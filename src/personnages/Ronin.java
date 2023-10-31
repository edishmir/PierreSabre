package personnages;

public class Ronin extends Humain{
	private int honneur = 1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int dixPourcent = getArgent()/10;
		parler(beneficiaire.getNom() + " prend ces " + dixPourcent + " sous.");
		beneficiaire.recevoir(dixPourcent);
		perdreArgent(dixPourcent);
	}

}
