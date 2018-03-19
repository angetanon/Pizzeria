package pizzeria;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Tanon Classe principale de l'objet pizza
 */
@Entity
public class Pizza {

	/**
	 * identifiant de la pizza
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;
	/**
	 * code de la pizza
	 */
	@Column(name = "CODE")
	private String code;

	/**
	 * libelle de la pizza
	 */
	@Column(name = "LIBELLE")
	private String libelle;

	/**
	 * prix de la pizza
	 */
	@Column(name = "PRIX")
	private double prix;

	/**
	 * categorie de la pizza
	 */
	@Enumerated(EnumType.STRING)
	@Column(name = "CATEGORIE_PIZZA")
	private CategoriePizza categorie;

	/**
	 * compteur d'initialisation de l'ientifiant
	 */
	private static int compteur = 0;

	/**
	 * constructeur
	 * 
	 * @param code
	 * @param libelle
	 * @param prix
	 * @param categorie
	 */
	public Pizza() {

	}

	public Pizza(String code, String libelle, double prix, CategoriePizza categorie) {

		this.setCode(code);
		this.setLibelle(libelle);
		this.setPrix(prix);
		this.categorie = categorie;

	}

	/**
	 * @param id
	 * @param code
	 * @param libelle
	 * @param prix
	 * @param categorie
	 */
	Pizza(int id, String code, String libelle, double prix, CategoriePizza categorie) {

		this.setId(id);
		this.setCode(code);
		this.setLibelle(libelle);
		this.setPrix(prix);
		this.categorie = categorie;
	}

	/**
	 * Methode d'affichage de l'identifiant
	 * 
	 * @return int
	 */
	public int getId() {
		return id;
	}

	/**
	 * Methode de modification de l'identifiant
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Methode d'affichage du code
	 * 
	 * @return string
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Methode de modification de code
	 * 
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Methode d'affichage du libelle
	 * 
	 * @return
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Methode de modification du libelle
	 * 
	 * @param libelle
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Methode d'affichage du prix
	 * 
	 * @return double
	 */
	public double getPrix() {
		return prix;
	}

	/**
	 * Methode de modification du prix
	 * 
	 * @param prix
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}

	/**
	 * Methode d'affichage de catégorie de pizza
	 * 
	 * @return CategoriePizza
	 */
	public CategoriePizza getCategorie() {
		return categorie;
	}

	@Override
	public String toString() {
		return code + " -> " + libelle + " (" + prix + "€)" + "  " + categorie.getLibelle();
	}

}
