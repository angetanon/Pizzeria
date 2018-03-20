package controller;

import java.util.Scanner;

import dao.IPizzaDao;
import dao.PizzaDaoJDBC;
import dao.PizzaDaoJPA;
import dao.PizzaMemDao;
import exception.StockageException;

/**
 * Classe du menu des services
 * 
 * @author Tanon
 *
 */
public abstract class MenuService {

	static IPizzaDao dao = new PizzaDaoJPA();

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
