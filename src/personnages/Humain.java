package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	protected int nbConnaissance = 0;
	protected Humain[] memoire = new Humain[30];
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boissonFavorite = boisson;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}
	
	protected void setArgent(int argent) {
		this.argent = argent;
	}
	
	public int getArgent() {
		return argent;
	}
	
	
	protected void gagnerArgent(int gain) {
		argent += gain;
	}
	
	protected void perdreArgent(int depense) {
		argent -= depense;
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
		}
	}
	
	protected void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		this.direBonjour();
		repondre(autreHumain);
	}
	
	private void repondre(Humain autreHumain) {
		autreHumain.direBonjour();
		this.memoriser(autreHumain);
		autreHumain.memoriser(this);
	}
	
	private void memoriser(Humain humain) {
		if (nbConnaissance <= memoire.length-1) {
			memoire[nbConnaissance] = humain;
			nbConnaissance++;
		} else {
			for (int i=0; (i+1)<nbConnaissance; i++) memoire[i] = memoire[i+1];
			memoire[nbConnaissance-1] = humain;
		}
	}
	
	public void listerConnaissance() {
		String noms = "";
		for (int i=0; i<nbConnaissance; i++)
		{
			if (i<nbConnaissance-1) {
				noms += memoire[i].getNom() + ", ";
			} else {
				noms += memoire[i].getNom();
			}
		}
		parler("Je connais beaucoup de monde dont : " + noms);
	}
}
