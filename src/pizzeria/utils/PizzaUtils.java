package pizzeria.utils;

import pizzeria.Pizza;

public class PizzaUtils {

	public static String convertToString(Pizza pizza) {
		return pizza.getCode() + " " + pizza.getLibelle() + " " + pizza.getPrix();
	}

	/**
	 * 
	 * public static String convertToMenu(Pizza pizza) { return pizza.getCode() + "
	 * ->" + pizza.getLibelle() + " " + pizza.getPrix(); }
	 */

	public static void show(Pizza[] pizzas) {
		for (int i = 0; i < pizzas.length; i++) {
			if (pizzas[i] != null) {

				System.out.println(pizzas[i]);
			}
		}

	}
}

/*
 * 
 * 
 * public static void main(String[] args) {
 * 
 * Pizza[] tabPizza = new Pizza[20]; Pizza[] tabPizzaSuppr = new Pizza[20];
 * 
 * tabPizza[0] = new Pizza("PEP", "Pépéroni", 12.50); tabPizza[1] = new
 * Pizza("MAR", "Margherita", 14.00); tabPizza[2] = new Pizza("REIN",
 * "La Reine", 11.50); tabPizza[3] = new Pizza("FRO", "La 4 fromages", 12.00);
 * tabPizza[4] = new Pizza("CAN", "La cannibale", 12.50); tabPizza[5] = new
 * Pizza("SAV", "La savoyarde", 13.00); tabPizza[6] = new Pizza("ORI",
 * "L’orientale", 13.50); tabPizza[7] = new Pizza("IND", "L’indienne", 14.00);
 * 
 * afficherTabMenu(tabPizza);
 * 
 * Scanner scan = new Scanner(System.in); int choix = 0;
 * 
 * do { menu(); choix = scan.nextInt(); if (choix == 1) {
 * 
 * System.out.println("Liste des pizzas \n"); PizzaUtils.show(tabPizza); }
 * 
 * else if (choix == 2) { System.out.println("Ajout d’une nouvelle pizza\n");
 * 
 * afficherTabMenu(tabPizza); System.out.println("\n Veuillez saisir le code");
 * String choixCode = scan.next();
 * 
 * System.out.println("\n Veuillez saisir le nom (sans espace)"); String
 * choixNom = scan.next();
 * 
 * System.out.println("\n Veuillez saisir le prix"); double choixPrix =
 * scan.nextDouble();
 * 
 * Pizza p = new Pizza(choixCode, choixNom, choixPrix); for (int i = 0; i <
 * tabPizza.length; i++) { if (tabPizza[i] == null) { tabPizza[i] = p; break; }
 * 
 * } PizzaUtils.show(tabPizza); } else if (choix == 3) {
 * 
 * System.out.println("Mise à jour d’une pizza \n"); PizzaUtils.show(tabPizza);
 * 
 * System.out.
 * println("\n Veuillez saisir le code de la pizza que vous voulez Modifier:");
 * String codeModif = scan.next();
 * 
 * System.out.println("\n Veuillez saisir le nouveau code de la pizza"); String
 * choixCode = scan.next();
 * 
 * System.out.println("\n Veuillez saisir le nouveau nom de la pizza "); String
 * choixNom = scan.next();
 * System.out.println("\n Veuillez saisir le nouveau prix de la pizza"); double
 * choixPrix = scan.nextDouble();
 * 
 * for (int i = 0; i < tabPizza.length; i++) {
 * 
 * if (tabPizza[i].getCode().equals(codeModif)) {
 * tabPizza[i].setCode(choixCode); tabPizza[i].setLibelle(choixNom);
 * tabPizza[i].setPrix(choixPrix); break; } } PizzaUtils.show(tabPizza); }
 * 
 * else if (choix == 4) {
 * 
 * System.out.println(" Suppression d’une pizza");
 * 
 * System.out.
 * println("Veuillez saisir le code de la pizza que vous voulez Supprimer:");
 * String codeSuppr = scan.next();
 * 
 * for (int i = 0; i < tabPizza.length; i++) {
 * 
 * /*if (tabPizza[i].getCode().equals(codeSuppr)) { tabPizza[i].setCode(null);
 * tabPizza[i].setLibelle(null); tabPizza[i].setPrix(0); break;
 * 
 * }
 */

/*
 * if ( tabPizza[i] != null && !(tabPizza[i].getCode().equals(codeSuppr))) {
 * tabPizzaSuppr[i] = tabPizza[i]; }
 * 
 * 
 * } PizzaUtils.show(tabPizzaSuppr); } else if (choix == 99) {
 * 
 * System.out.println(" Aurevoir"); } } while (choix != 99);
 * 
 * }
 * 
 * public static void menu() { System.out.println("****** Menu Pizzeria******");
 * System.out.println("1. Lister les pizzas");
 * System.out.println("2. Ajouter une nouvelle pizza");
 * System.out.println("3. Mettre à jour une pizza");
 * System.out.println("4. Supprimer une pizza");
 * System.out.println("99. Sortir \n");
 * 
 * }
 * 
 * public static void afficherTabMenu(Pizza[] tabMenu) {
 * 
 * for (int i = 0; i < tabMenu.length; i++) { if (tabMenu[i] != null)
 * 
 * System.out.println(PizzaUtils.convertToString(tabMenu[i])); }
 * 
 * System.out.println("\n");
 * 
 * }
 */
