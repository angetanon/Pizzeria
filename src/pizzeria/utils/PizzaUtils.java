package pizzeria.utils;

import pizzeria.Pizza;

/**
 * Classe pizzaUtils de l'objet pizza
 * 
 * @author diginamic
 *
 */
public class PizzaUtils {

	/**
	 * Methode de conersion en chaine de caractère
	 * 
	 * @param pizza
	 * @return string
	 */
	public static String convertToString(Pizza pizza) {
		return pizza.getCode() + " " + pizza.getLibelle() + " " + pizza.getPrix() + " " + pizza.getCategorie();
	}

	/**
	 * 
	 * public static String convertToMenu(Pizza pizza) { return pizza.getCode() + "
	 * ->" + pizza.getLibelle() + " " + pizza.getPrix(); }
	 */

	/**
	 * Methode d'affichage de la liste de pizza
	 * 
	 * @param pizzas
	 */
	public static void show(Pizza[] pizzas) {
		for (int i = 0; i < pizzas.length; i++) {
			if (pizzas[i] != null) {

				System.out.println(pizzas[i]);
			}
		}

	}
}
