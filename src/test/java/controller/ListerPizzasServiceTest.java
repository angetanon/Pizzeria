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

public class ListerPizzasServiceTest {

	@Rule
	public TextFromStandardInputStream systemInMock = emptyStandardInputStream();

	@Test
	public void testExecuteUC() {
		systemInMock.provideLines("1");

		MenuService service = new ListerPizzasService();

		IPizzaDao dao = MenuService.getDao();
		Scanner scan = new Scanner(System.in);

		try {
			service.executeUC(scan);

		} catch (StockageException e) {
			System.out.println(e.getMessage());
		}

		assertThat(dao.findAllPizzas().size(), is(8));
		assertThat(dao.findAllPizzas().get(0).getCode(), is("PEP"));
		assertThat(dao.findAllPizzas().get(0).getLibelle(), is("Pépéroni"));
		assertThat(dao.findAllPizzas().get(0).getPrix(), is(12.50));
		assertThat(dao.findAllPizzas().get(0).getCategorie(), is(CategoriePizza.VIANDE));
	}

}
