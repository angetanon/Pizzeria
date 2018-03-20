package dao;

import java.util.Arrays;
import java.util.List;

import pizzeria.CategoriePizza;
import pizzeria.Pizza;

public class Data {

	public static List<Pizza> pizzaList() {
		return Arrays.asList(
				new Pizza("PEP", "Pépéroni", 12.50, CategoriePizza.VIANDE),
				new Pizza("MAR", "Margherita", 14.00, CategoriePizza.SANS_VIANDE),
				new Pizza("REIN", "La Reine", 11.50, CategoriePizza.SANS_VIANDE),
				new Pizza("FRO", "La 4 fromages", 12.00, CategoriePizza.SANS_VIANDE),
				new Pizza("CAN", "La cannibale", 12.50, CategoriePizza.VIANDE),
				new Pizza("SAV", "La savoyarde", 13.00, CategoriePizza.POISSON),
				new Pizza("ORI", "L’orientale", 13.50, CategoriePizza.SANS_VIANDE),
				new Pizza("IND", "L’indienne", 14.00, CategoriePizza.POISSON)
				);

	}
}
