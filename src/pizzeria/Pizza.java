package pizzeria;

public class Pizza {

	private int id;
	private String code;

	private String libelle;
	private double prix;

	private static int compteur = 0;

	public Pizza(String code, String libelle, double prix) {
		this.id = compteur;
		this.setCode(code);
		this.setLibelle(libelle);
		this.setPrix(prix);

		compteur++;

	}

	Pizza(int id, String code, String libelle, double prix) {

		this.setId(id);
		this.setCode(code);
		this.setLibelle(libelle);
		this.setPrix(prix);
	}

	public Pizza(String choixCode) {

	}

	public Pizza() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return code + " -> " + libelle + " (" + prix + "€)";
	}
}
