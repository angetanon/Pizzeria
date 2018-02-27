package controller;

import java.util.Scanner;

import pizzeria.Pizza;

public class SupprimerPizzaService extends MenuService {

	Scanner scan = new Scanner(System.in);

	@Override
	public void executeUC(Scanner scan) {

		System.out.println("Mise à jour d’une pizza \n");
		for (Pizza p : dao.findAllPizzas()) {
			System.out.println(p);
		}

		System.out.println(" Suppression d’une pizza");

		System.out.println("Veuillez saisir le code de la pizza que vous voulez Supprimer:");
		String codeSuppr = scan.next();

		dao.deletePizza(codeSuppr);
		for (Pizza p : dao.findAllPizzas()) {
			System.out.println(p);

		}
	}

}