package controller;

import java.util.Scanner;

import pizzeria.Pizza;

/**
 * Classe du menu service liste des pizzas
 * 
 * @author Tanon
 *
 */
public class ListerPizzasService extends MenuService {

	@Override
	public void executeUC(Scanner scan) {

		System.out.println("Liste des pizzas \n");

		for (Pizza p : dao.findAllPizzas()) {
			System.out.println(p);
		}
	}

}
