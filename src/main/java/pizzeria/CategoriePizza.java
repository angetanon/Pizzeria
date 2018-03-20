package pizzeria;

import javax.persistence.Entity;

/**
 * @author Tanon Abedjinan Categorie de pizza
 */
public enum CategoriePizza {
	/**
	 * catgorie avec viande
	 */
	VIANDE("Viande"),

	/**
	 * catgorie avec poisson
	 */
	POISSON("Poisson"),

	/**
	 * catgorie sans viande
	 */
	SANS_VIANDE("Sans Viande");

	/**
	 * Valeur de la catégorie
	 */
	private String libelle;

	private CategoriePizza(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Methode qui récupère la catégorie de pizza ou la valeur saisie par
	 * l'utilisateur
	 * 
	 * @param chaine
	 *            à trouver
	 * @return CategoriePizza
	 */
	public static CategoriePizza find(String chaine) {
		String chaineModifiee = chaine.replace(' ', '_').toUpperCase();
		for (CategoriePizza categorie : values()) {

			if (categorie.name().equals(chaine) || categorie.name().equals(chaineModifiee)) {
				return categorie;
			}
		}
		return null;
	}

	/**
	 * Methode pour recuperation du libelle
	 * 
	 * @return String
	 */
	public String getLibelle() {
		return libelle;
	}

}
