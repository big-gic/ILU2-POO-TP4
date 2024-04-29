package produit;

import personnages.Gaulois;

public class Sanglier extends Produit{
	int poids;
	Gaulois chasseur;
	String nom = "sanglier";
	
	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier","kg");
		this.poids = poids;
		this.chasseur = chasseur;
	}
}
