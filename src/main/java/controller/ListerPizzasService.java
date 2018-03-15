package controller;

import java.util.Scanner;

import exception.StockageException;
import exception.UpdatePizzaException;
import pizzeria.Pizza;

/**
 * Classe du menu service liste des pizzas
 * 
 * @author Tanon
 *
 */
public class ListerPizzasService extends MenuService {

	@Override
	public void executeUC(Scanner scan) throws StockageException {

		System.out.println("Liste des pizzas \n");

		if (dao.findAllPizzas() != null) {
			for (Pizza p : dao.findAllPizzas()) {

				System.out.println(p);

			}

		} else
			throw new StockageException("Liste pizza vide");
	}

}
