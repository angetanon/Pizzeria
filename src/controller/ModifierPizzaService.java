package controller;

import java.util.Scanner;

import pizzeria.Pizza;

public class ModifierPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner scan) {

		System.out.println("Mise à jour d’une pizza \n");
		for (Pizza p : dao.findAllPizzas()) {
			System.out.println(p);
		}

		System.out.println("\n Veuillez saisir le code de la pizza que vous voulez Modifier:");
		String codeModif = scan.next();

		System.out.println("\n Veuillez saisir le nouveau code de la pizza");
		String choixCode = scan.next();

		System.out.println("\n Veuillez saisir le nouveau nom de la pizza ");
		String choixNom = scan.next();
		System.out.println("\n Veuillez saisir le nouveau prix de la pizza");
		double choixPrix = scan.nextDouble();

		dao.updatePizza(codeModif, new Pizza(choixCode, choixNom, choixPrix));

		for (Pizza p : dao.findAllPizzas()) {
			System.out.println(p);
		}

	}

}
