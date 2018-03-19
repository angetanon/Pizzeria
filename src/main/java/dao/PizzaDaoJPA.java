package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import persistence.IPizzaDao;
import pizzeria.CategoriePizza;
import pizzeria.Pizza;

public class PizzaDaoJPA implements IPizzaDao{
	
	private EntityManagerFactory emfPizza ; 

	private EntityManager emPizza;
	
	
	public PizzaDaoJPA(){
		emfPizza = Persistence.createEntityManagerFactory("pizza");
		emPizza = emfPizza.createEntityManager();
		
		
	}


	@Override
	public List<Pizza> findAllPizzas() {
		
		List<Pizza>pizzas = new ArrayList<>();
		EntityTransaction etPizza = emPizza.getTransaction();
		etPizza.begin();
		
		
		pizzas.add(new Pizza("PEP", "Pépéroni", 12.50, CategoriePizza.VIANDE));
		pizzas.add(new Pizza("MAR", "Margherita", 14.00, CategoriePizza.SANS_VIANDE));
		pizzas.add(new Pizza("REIN", "La Reine", 11.50, CategoriePizza.SANS_VIANDE));
		pizzas.add(new Pizza("FRO", "La 4 fromages", 12.00, CategoriePizza.SANS_VIANDE));
		pizzas.add(new Pizza("CAN", "La cannibale", 12.50, CategoriePizza.VIANDE));
		pizzas.add(new Pizza("SAV", "La savoyarde", 13.00, CategoriePizza.POISSON));
		pizzas.add(new Pizza("ORI", "L’orientale", 13.50, CategoriePizza.SANS_VIANDE));
		pizzas.add(new Pizza("IND", "L’indienne", 14.00, CategoriePizza.POISSON));
		for(Pizza p: pizzas){
			if(p!=null){			
			emPizza.persist(p);
			}			
		}
		etPizza.commit();
		emPizza.close();
		
	}


	@Override
	public void saveNewPizza(Pizza pizza) {
		// TODO Auto-generated method stub
		
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
