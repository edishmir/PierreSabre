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
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur * 2;
		if (force >= adversaire.getReputation()) {
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			gagnerArgent(adversaire.getArgent());
			parler("Je t'ai eu petit yakusa!");
			adversaire.perdre();
		} else {
			parler("J'ai perdu contre ce yakusa, mon honneur et ma bourse ont en pris un coup.");
			honneur --;
			adversaire.gagner(getArgent());
			perdreArgent(getArgent());
		}
	}

}
