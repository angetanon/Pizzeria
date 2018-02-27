package controller;

import java.util.Scanner;

import persistence.IPizzaDao;
import persistence.PizzaMemDao;

public abstract class MenuService {

	static IPizzaDao dao = new PizzaMemDao();

	public abstract void executeUC(Scanner scan);

}
