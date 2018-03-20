package dao;

import java.util.ArrayList;
import java.util.List;

import pizzeria.CategoriePizza;
import pizzeria.Pizza;

/**
 * classe pizza de la data access objet
 * 
 * @author diginamic
 *
 */
public class PizzaMemDao implements IPizzaDao {

	/**
	 * Liste de pizzas
	 */
	private List<Pizza> pizzas = new ArrayList<Pizza>();

	/**
	 * Liste des pizzas
	 */
	public PizzaMemDao() {
		pizzas.add(new Pizza("PEP", "Pépéroni", 12.50, CategoriePizza.VIANDE));
		pizzas.add(new Pizza("MAR", "Margherita", 14.00, CategoriePizza.SANS_VIANDE));
		pizzas.add(new Pizza("REIN", "La Reine", 11.50, CategoriePizza.SANS_VIANDE));
		pizzas.add(new Pizza("FRO", "La 4 fromages", 12.00, CategoriePizza.SANS_VIANDE));
		pizzas.add(new Pizza("CAN", "La cannibale", 12.50, CategoriePizza.VIANDE));
		pizzas.add(new Pizza("SAV", "La savoyarde", 13.00, CategoriePizza.POISSON));
		pizzas.add(new Pizza("ORI", "L’orientale", 13.50, CategoriePizza.SANS_VIANDE));
		pizzas.add(new Pizza("IND", "L’indienne", 14.00, CategoriePizza.POISSON));
	}

	@Override
	public List<Pizza> findAllPizzas() {
		return pizzas;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {
		pizzas.add(pizza);

	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		int index = findPizzaByIndex(codePizza);
		if (index != -1) {
			pizzas.set(index, pizza);
		} else
			System.out.println("erreur de valeurs");
	}

	@Override
	public void deletePizza(String codePizza) {
		int index = findPizzaByIndex(codePizza);
		if (index != -1) {
			pizzas.remove(index);
		} else
			System.out.println("erreur de valeurs");

	}

	public int findPizzaByIndex(String codePizza) {
		for (int i = 0; i < pizzas.size(); i++) {
			Pizza p = pizzas.get(i);
			if (p.getCode().equals(codePizza)) {

				return i;
			}

		}
		return -1;
	}

	@Override
	public boolean pizzaExists(String codePizza) {
		for (int i = 0; i < pizzas.size(); i++) {
			Pizza p = pizzas.get(i);
			if (p.getCode().equals(codePizza)) {

				return true;
			}
		}
		return false;
	}

	public boolean pizzaExistsPrix(double choixPrix) {
		for (int i = 0; i < pizzas.size(); i++) {
			Pizza p = pizzas.get(i);
			if (p.getCode().equals(choixPrix)) {

				return true;
			}
		}
		return false;
	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		// TODO Auto-generated method stub
		return null;
	}
}
