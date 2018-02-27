package controller;

import java.util.Scanner;

import exception.SavePizzaException;
import pizzeria.CategoriePizza;
import pizzeria.Pizza;

/**
 * Classe menu service de ajouter pizza
 * 
 * @author diginamic
 *
 */
public class AjouterPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner scan) throws SavePizzaException {
		System.out.println("Ajout d’une nouvelle pizza\n");

		for (Pizza p : dao.findAllPizzas()) {
			System.out.println(p);
		}
		System.out.println("\n Veuillez saisir le code");
		String choixCode = scan.nextLine();

		System.out.println("\n Veuillez saisir le nom (sans espace)");
		String choixNom = scan.nextLine();

		System.out.println("\n Veuillez saisir le prix");
		double choixPrix = Double.parseDouble(scan.nextLine());

		System.out.println("\n Veuillez saisir la categorie");
		String libelle = scan.nextLine();

		dao.saveNewPizza(new Pizza(choixCode, choixNom, choixPrix, CategoriePizza.find(libelle)));
		for (Pizza p : dao.findAllPizzas()) {
			System.out.println(p);
		}

	}

}
