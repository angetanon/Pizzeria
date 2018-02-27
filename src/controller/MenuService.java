package controller;

import java.util.Scanner;

import exception.StockageException;
import persistence.IPizzaDao;
import persistence.PizzaMemDao;

/**
 * Classe du menu des services
 * 
 * @author Tanon
 *
 */
public abstract class MenuService {

	static IPizzaDao dao = new PizzaMemDao();

	/**
	 * Methode d'exécution des cas d'utilisation
	 * 
	 * @param scan
	 * @throws StockageException
	 */
	public abstract void executeUC(Scanner scan) throws StockageException;

}
