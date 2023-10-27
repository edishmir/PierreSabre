package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}

	public int seFaireExtorquer() {
		int montantExtorque = getArgent();
		perdreArgent(montantExtorque);
		parler("J'ai tout perdu! Le monde est trop injuste...");
		return montantExtorque;
	}

	public void recevoir(int argent) {
		parler(argent + " sous ! Je te remercie généreux donateur!");
		gagnerArgent(argent);
	}

}
