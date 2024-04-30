package produit;

public class Poisson extends Produit{
	String date;
	String nom = "poisson";
	String jour;
	int quantite;
	
	public Poisson(int quantite, String jour) {
		super("poisson", "jsp");
		this.quantite = quantite;
		this.jour = jour;
	}
}
