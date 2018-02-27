package persistence;

import java.util.List;

import pizzeria.Pizza;

/**
 * @author Tanon
 *
 */
public interface IPizzaDao {

	/**
	 * Methode pour récupérer le code
	 */
	String getCode = null;

	/**
	 * Methode qui affiche une liste de pizzas
	 * 
	 * @return Objet de type liste de pizza
	 */
	List<Pizza> findAllPizzas();

	/**
	 * Methode pour ajouter une nouvelle pizza
	 * 
	 * @param pizza
	 */
	void saveNewPizza(Pizza pizza);

	/**
	 * Methode pour modifier une pizza
	 * 
	 * @param codePizza
	 * @param pizza
	 */
	void updatePizza(String codePizza, Pizza pizza);

	/**
	 * Methode pour supprimer une pizza
	 * 
	 * @param codePizza
	 */
	void deletePizza(String codePizza);

	/**
	 * Methode pour trouver une pizza à partir de son code
	 * 
	 * @param codePizza
	 * @return String
	 */
	Pizza findPizzaByCode(String codePizza);

	/**
	 * Methode qui vérifie si le code existe
	 * 
	 * @param codePizza
	 * @return boolean
	 */
	boolean pizzaExists(String codePizza);

}
