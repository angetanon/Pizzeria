package controller;

/**
 * Classe du menu service factory
 * 
 * @author Tanon
 *
 */
public class MenuServiceFactory {

	/**
	 * Methodes du menu des services liste, ajout, mise à jour et suppression de
	 * pizza
	 * 
	 * @param choix
	 * @return MenuService
	 */
	public static MenuService serviceFactory(int choix) {

		switch (choix) {
		case 1:
			return new ListerPizzasService();
		case 2:
			return new AjouterPizzaService();
		case 3:
			return new ModifierPizzaService();
		case 4:
			return new SupprimerPizzaService();
		default:
			break;
		}
		return null;

	}

}
