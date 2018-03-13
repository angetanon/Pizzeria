package persistence;

import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import pizzeria.CategoriePizza;
import pizzeria.Pizza;

public class IPizzaDaoTest {

	@Test
	public void testFindAllPizzas() {
		IPizzaDao dao = new PizzaMemDao();

		List<Pizza> pizzas = dao.findAllPizzas();
		assertEquals(8, pizzas.size());
	}

	@Test
	public void testSaveNewPizza() {
		IPizzaDao dao = new PizzaMemDao();

		Pizza pizzas = new Pizza("MAR", "Margherita", 14.00, CategoriePizza.SANS_VIANDE);
		dao.saveNewPizza(pizzas);
		assertEquals(9, dao.findAllPizzas().size());

	}

	@Test
	public void testUpdatePizza() {
		IPizzaDao dao = new PizzaMemDao();

		Pizza pizzas = new Pizza("PON", "Alibaba", 35.00, CategoriePizza.SANS_VIANDE);
		dao.updatePizza("MAR", pizzas);

		assertThat(dao.findAllPizzas().get(1).getCode(), is("PON"));
		assertThat(dao.findAllPizzas().get(1).getLibelle(), is("Alibaba"));
		assertThat(dao.findAllPizzas().get(1).getPrix(), is(35.00));
		assertThat(dao.findAllPizzas().get(1).getCategorie(), is(CategoriePizza.SANS_VIANDE));
	}

	@Test
	public void testDeletePizza() {
		IPizzaDao dao = new PizzaMemDao();

		dao.deletePizza("MAR");

		assertThat(dao.findAllPizzas().size(), is(7));
	}

	@Test
	public void testFindPizzaByCode() {
		IPizzaDao dao = new PizzaMemDao();

		dao.findPizzaByCode("MAR");
		
		assertThat(dao.findAllPizzas().get(1).getCode(), is("MAR"));
		assertThat(dao.findAllPizzas().get(1).getLibelle(), is("Margherita"));
		assertThat(dao.findAllPizzas().get(1).getPrix(), is(14.00));
		assertThat(dao.findAllPizzas().get(1).getCategorie(), is(CategoriePizza.SANS_VIANDE));

		//assertThat(dao.findAllPizzas(), dao.findAllPizzas().contains(new Pizza("MAR", "Margherita", 14.00, CategoriePizza.SANS_VIANDE)));
	}

	@Test
	public void testPizzaExists() {
		IPizzaDao dao = new PizzaMemDao();

		dao.pizzaExists("MAR");
		assertThat(dao.pizzaExists("MAR"), is(true));
		assertThat(dao.pizzaExists("LJR"), is(false));
		
		
	}

}
