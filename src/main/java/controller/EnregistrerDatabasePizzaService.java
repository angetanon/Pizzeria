package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.Data;
import exception.StockageException;
import pizzeria.Pizza;

public class EnregistrerDatabasePizzaService extends MenuService {

	@Override
	public void executeUC(Scanner scan) throws StockageException {
		List<Pizza> pizzas = new ArrayList<Pizza>();				
		pizzas = Data.pizzaList();
		for(Pizza p : pizzas){
			dao.saveNewPizza(p);
		}
		
	}

}
