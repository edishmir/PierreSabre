package personnages;

public class Commercant extends Humain {
	private int extorquer = 0;

	public Commercant(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}

	public int seFaireExtorquer() {
		int argent = getArgent();
		extorquer += argent;
		perdreArgent(argent);
		parler("J'ai tout perdu! Le monde est trop injuste...");
		return extorquer;
	}

	public void recevoir(int argent) {
		parler(argent + " sous ! Je te reemercie généreux donateur!");
		gagnerArgent(argent);
	}

}
