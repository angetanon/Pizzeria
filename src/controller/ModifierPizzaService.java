package controller;

import java.util.Scanner;

import exception.UpdatePizzaException;
import pizzeria.CategoriePizza;
import pizzeria.Pizza;

/**
 * Classe du menu service modifier la pizza
 * 
 * @author diginamic
 *
 */
public class ModifierPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner scan) throws UpdatePizzaException {

		System.out.println("Mise à jour d’une pizza \n");
		for (Pizza p : dao.findAllPizzas()) {
			System.out.println(p);
		}

		System.out.println("\n Veuillez saisir le code de la pizza que vous voulez Modifier:");
		String codeModif = scan.nextLine();

		if (!dao.pizzaExists(codeModif)) {

			throw new UpdatePizzaException("Saisie incorrecte");

		}

		System.out.println("\n Veuillez saisir le nouveau code de la pizza");
		String choixCode = scan.nextLine();

		System.out.println("\n Veuillez saisir le nouveau nom de la pizza ");
		String choixNom = scan.nextLine();

		System.out.println("\n Veuillez saisir le nouveau prix de la pizza");
		double choixPrix = Double.parseDouble(scan.nextLine());

		System.out.println("\n Veuillez saisir la categorie");
		String libelle = scan.nextLine();

		dao.updatePizza(codeModif, new Pizza(choixCode, choixNom, choixPrix, CategoriePizza.find(libelle)));

		for (Pizza p : dao.findAllPizzas()) {
			System.out.println(p);
		}

	}

}
