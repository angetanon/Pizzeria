package controller;

import java.util.Scanner;

import dao.PizzaDaoJDBC;
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

	static IPizzaDao dao = new PizzaDaoJDBC();

	public static IPizzaDao getDao() {
		return dao;
	}

	public static void setDao(IPizzaDao dao) {
		MenuService.dao = dao;
	}

	/**
	 * Methode d'exécution des cas d'utilisation
	 * 
	 * @param scan
	 * @throws StockageException
	 */
	public abstract void executeUC(Scanner scan) throws StockageException;

}
