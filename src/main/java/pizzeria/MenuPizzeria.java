package pizzeria;

import java.util.Scanner;

import controller.MenuService;
import controller.MenuServiceFactory;
import exception.StockageException;
import persistence.IPizzaDao;
import persistence.PizzaMemDao;

/**
 * @author Tanon Console d'éxecution de l'application
 */
public class MenuPizzeria {

	static IPizzaDao dao = new PizzaMemDao();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int choix = 0;

		menu();

		do {
			System.out.println("Veuillez effectuer un choix:");

			choix = Integer.parseInt(scan.nextLine());
			if (choix >= 1 && choix <= 4) {

				MenuService service = MenuServiceFactory.serviceFactory(choix);
				try {
					service.executeUC(scan);
				} catch (StockageException e) {

					System.out.println(e.getMessage());
				}
			}

		} while (choix != 99);
		System.out.println("bye");

	}

	/**
	 * Methode pour afficher le menu
	 */
	public static void menu() {
		System.out.println("\n****** Menu Pizzeria******");
		System.out.println("1. Lister les pizzas");
		System.out.println("2. Ajouter une nouvelle pizza");
		System.out.println("3. Mettre à jour une pizza");
		System.out.println("4. Supprimer une pizza");
		System.out.println("99. Sortir \n");

	}

}
