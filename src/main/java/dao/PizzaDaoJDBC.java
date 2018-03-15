package dao;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import persistence.IPizzaDao;
import pizzeria.CategoriePizza;
import pizzeria.Pizza;

public class PizzaDaoJDBC implements IPizzaDao {



	public PizzaDaoJDBC() {

	
		try {
			UtilsDao.connectionJDBC();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Pizza> findAllPizzas() {

		List<Pizza> piz = new ArrayList<>();
		try {
			Statement statement = UtilsDao.myConnection.createStatement();
			ResultSet resultats = statement.executeQuery("SELECT * FROM PIZZA");
			while (resultats.next()) {
				Integer id = resultats.getInt("ID");
				String code = resultats.getString("CODE");
				String libelle = resultats.getString("LIBELLE");
				BigDecimal price = resultats.getBigDecimal("PRIX");
				String categoriePizza = resultats.getString("CATEGORIE_PIZZA");
				System.out.println("[id=" + id + " code=" + code + "libelle=" + libelle + " price=" + price
						+ "categoriePizza =" + categoriePizza + "]");

				Pizza pizza = new Pizza(code, libelle, price.doubleValue(), CategoriePizza.valueOf(categoriePizza));
				piz.add(pizza);

			}
			resultats.close();
			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return piz;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {

		try {
			Statement statement = UtilsDao.myConnection.createStatement();
			int nbPizzaInsere = statement
					.executeUpdate("INSERT INTO PIZZA(CODE,LIBELLE,PRIX,CATEGORIE_PIZZA) "
							+ "VALUES ('"+pizza.getCode()+"','"+pizza.getLibelle()+"',"+pizza.getPrix()+",'"+pizza.getCategorie().name()+"')");

			System.out.println(nbPizzaInsere + " pizza inséré");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		try {
			Statement statement = UtilsDao.myConnection.createStatement();
			int nbPizzaModifiee = statement
					.executeUpdate("UPDATE PIZZA "
							+ "SET CODE ="+pizza.getCode()+ "','"+pizza.getLibelle()+"',"+pizza.getPrix()+",'"+pizza.getCategorie().name()+"'"+
							" WHERE CODE = "+codePizza );

			System.out.println(nbPizzaModifiee + " pizza modifiée");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deletePizza(String codePizza) {
		try {
			Statement statement = UtilsDao.myConnection.createStatement();
			int nbPizzaSupprimee = statement
					.executeUpdate("DELETE FROM PIZZA WHERE CODE = '" +codePizza+"'"); 
							

			System.out.println(nbPizzaSupprimee + " pizza supprimee");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean pizzaExists(String codePizza) {
	
		return false;
	}

}
