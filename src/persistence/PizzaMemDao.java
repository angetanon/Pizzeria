package persistence;

import java.util.ArrayList;
import java.util.List;

import pizzeria.Pizza;

public class PizzaMemDao implements IPizzaDao {

	private List<Pizza> pizzas = new ArrayList<Pizza>();

	public PizzaMemDao() {
		pizzas.add(new Pizza("PEP", "Pépéroni", 12.50));
		pizzas.add(new Pizza("MAR", "Margherita", 14.00));
		pizzas.add(new Pizza("REIN", "La Reine", 11.50));
		pizzas.add(new Pizza("FRO", "La 4 fromages", 12.00));
		pizzas.add(new Pizza("CAN", "La cannibale", 12.50));
		pizzas.add(new Pizza("SAV", "La savoyarde", 13.00));
		pizzas.add(new Pizza("ORI", "L’orientale", 13.50));
		pizzas.add(new Pizza("IND", "L’indienne", 14.00));
	}

	@Override
	public List<Pizza> findAllPizzas() {
		return pizzas;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {
		pizzas.add(pizza);

	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		int index = findPizzaByIndex(codePizza);
		if (index != -1) {
			pizzas.set(index, pizza);
		} else
			System.out.println("erreur de valeurs");
	}

	@Override
	public void deletePizza(String codePizza) {
		int index = findPizzaByIndex(codePizza);
		if (index != -1) {
			pizzas.remove(index);
		} else
			System.out.println("erreur de valeurs");

	}

	public int findPizzaByIndex(String codePizza) {
		for (int i = 0; i < pizzas.size(); i++) {
			Pizza p = pizzas.get(i);
			if (p.getCode().equals(codePizza)) {

				return i;
			}

		}
		return -1;
	}

	@Override
	public boolean pizzaExists(String codePizza) {
		for (int i = 0; i < pizzas.size(); i++) {
			Pizza p = pizzas.get(i);
			if (p.getCode().equals(codePizza)) {

				return true;
			}
		}
		return false;
	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		// TODO Auto-generated method stub
		return null;
	}
}
