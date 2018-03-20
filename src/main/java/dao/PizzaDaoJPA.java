package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import pizzeria.CategoriePizza;
import pizzeria.Pizza;

public class PizzaDaoJPA implements IPizzaDao{
	
	private EntityManagerFactory emfPizza ; 

	private EntityManager emPizza;
	
	
	public PizzaDaoJPA(){
		emfPizza = Persistence.createEntityManagerFactory("projet-JPA");
		emPizza = emfPizza.createEntityManager();
		
		
	}


	@Override
	public List<Pizza> findAllPizzas() {
		List<Pizza> pizzas = Data.pizzaList();
		
		return pizzas;
	}


	@Override
	public void saveNewPizza(Pizza pizza) {
		EntityTransaction etPizza = emPizza.getTransaction();
		etPizza.begin();	
		emPizza.persist(pizza);
		etPizza.commit();
		
	}


	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deletePizza(String codePizza) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Pizza findPizzaByCode(String codePizza) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean pizzaExists(String codePizza) {
		// TODO Auto-generated method stub
		return false;
	}

}
