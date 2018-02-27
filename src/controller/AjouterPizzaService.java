package controller;

import java.util.Scanner;

import pizzeria.Pizza;

public class AjouterPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner scan) {
		System.out.println("Ajout d’une nouvelle pizza\n");

		for (Pizza p : dao.findAllPizzas()) {
			System.out.println(p);
		}
		System.out.println("\n Veuillez saisir le code");
		String choixCode = scan.next();

		System.out.println("\n Veuillez saisir le nom (sans espace)");
		String choixNom = scan.next();

		System.out.println("\n Veuillez saisir le prix");
		double choixPrix = scan.nextDouble();

		dao.saveNewPizza(new Pizza(choixCode, choixNom, choixPrix));
		for (Pizza p : dao.findAllPizzas()) {
			System.out.println(p);
		}
	}

}
