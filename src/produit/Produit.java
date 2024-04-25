package produit;

public class Produit {
	private String nom;
	private String unite;
	
	public Produit(String nom, String unite) {
		this.nom = nom;
		this.unite = unite;
	}
	
	public String getNom() {
		return nom;
	}
}
