package controller;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import dao.IPizzaDao;
import exception.StockageException;
import pizzeria.CategoriePizza;

import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.*;

import java.util.Scanner;

public class AjouterPizzaServiceTest {

	@Rule
	public TextFromStandardInputStream systemInMock = emptyStandardInputStream();

	@Test
	public void testExecuteUC() {

		systemInMock.provideLines("PLT", "Vegetarienne", "25", "Viande");

		MenuService service = new AjouterPizzaService();

		IPizzaDao dao = MenuService.getDao();
		Scanner scan = new Scanner(System.in);

		try {
			service.executeUC(scan);

		} catch (StockageException e) {
			System.out.println(e.getMessage());
		}

		assertThat(dao.findAllPizzas().size(), is(9));
		assertThat(dao.findAllPizzas().get(8).getCode(), is("PLT"));
		assertThat(dao.findAllPizzas().get(8).getLibelle(), is("Vegetarienne"));
		assertThat(dao.findAllPizzas().get(8).getPrix(), is(25.00));
		assertThat(dao.findAllPizzas().get(8).getCategorie(), is(CategoriePizza.VIANDE));

	}
}
