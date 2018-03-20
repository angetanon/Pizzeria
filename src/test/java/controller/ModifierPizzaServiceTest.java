package controller;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

import java.util.Scanner;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import org.mockito.Mockito;

import dao.IPizzaDao;
import exception.StockageException;
import pizzeria.CategoriePizza;

public class ModifierPizzaServiceTest {

	@Rule
	public TextFromStandardInputStream systemInMock = emptyStandardInputStream();
	@Test
	public void testExecuteUC() {
		systemInMock.provideLines("FRO", "MVT", "Vegetarienne", "25", "Viande");

		MenuService service = new ModifierPizzaService();

		IPizzaDao dao = MenuService.getDao();
		Scanner scan = new Scanner(System.in);

		try {
			service.executeUC(scan);

		} catch (StockageException e) {
			System.out.println(e.getMessage());
		}

		assertThat(dao.findAllPizzas().size(), is(8));
		
	
	}
	
	
	
	@Rule
	public TextFromStandardInputStream systemInMock1 = emptyStandardInputStream();
	@Test
	public void testExecuteUC1() {
		systemInMock.provideLines("FRO", "MVT", "Vegetarienne", "25", "Viande");

		MenuService service = new ModifierPizzaService();

		IPizzaDao dao = Mockito.mock(IPizzaDao.class);
		Mockito.when(dao.findAllPizzas()).thenReturn(null);
		
		Scanner scan = new Scanner(System.in);

		try {
			service.executeUC(scan);

		} catch (StockageException e) {
			System.out.println(e.getMessage());
		}
	}
}
