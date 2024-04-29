package produit;

public class Poisson extends Produit{
	String date;
	String nom = "poisson";
	
	public Poisson(String date) {
		super("poisson", "jsp");
		this.date = date;
	}
}
