package controller;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

import java.util.Scanner;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import dao.IPizzaDao;
import exception.StockageException;

public class SupprimerPizzaServiceTest {

	@Rule
	public TextFromStandardInputStream systemInMock = emptyStandardInputStream();
	@Test
	public void testExecuteUC() {
		systemInMock.provideLines("SAV");

		MenuService service = new SupprimerPizzaService();

		IPizzaDao dao = MenuService.getDao();
		Scanner scan = new Scanner(System.in);

		try {
			service.executeUC(scan);

		} catch (StockageException e) {
			System.out.println(e.getMessage());
		}
		
		assertThat(dao.findAllPizzas().size(), is(7));

	}

}
