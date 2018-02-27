package pizzeria;

import java.util.Scanner;

import controller.MenuService;
import controller.MenuServiceFactory;
import persistence.IPizzaDao;
import persistence.PizzaMemDao;

public class MenuPizzeria {

	static IPizzaDao dao = new PizzaMemDao();

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int choix = 0;

		menu();

		do {
			System.out.println("Veuillez effectuer un choix:");

			choix = scan.nextInt();
			if (choix >= 1 && choix <= 4) {

				MenuService service = MenuServiceFactory.serviceFactory(choix);
				service.executeUC(scan);
			}

		} while (choix != 99);
		System.out.println("bye");

	}

	public static void menu() {
		System.out.println("\n****** Menu Pizzeria******");
		System.out.println("1. Lister les pizzas");
		System.out.println("2. Ajouter une nouvelle pizza");
		System.out.println("3. Mettre à jour une pizza");
		System.out.println("4. Supprimer une pizza");
		System.out.println("99. Sortir \n");

	}

}
