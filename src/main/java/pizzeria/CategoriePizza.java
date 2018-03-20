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
	 * Valeur de la cat�gorie
	 */
	private String libelle;

	private CategoriePizza(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Methode qui r�cup�re la cat�gorie de pizza ou la valeur saisie par
	 * l'utilisateur
	 * 
	 * @param chaine
	 *            � trouver
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
