package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant commercant) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(commercant.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int argentCommercant = commercant.seFaireExtorquer();
		gagnerArgent(argentCommercant);
		reputation ++;
		parler("J'ai piqué " + argentCommercant + " sous de " + commercant.getNom() + ", ce qui me fait " + getArgent() + " dans ma poche. Hi ! Hi !");
	}
}
