package personnages;

public class Traitre extends Samourai{
	private int niveauTraitrise = 0;

	public Traitre(String seigneur, String nom, String boisson, int argent) {
		super(seigneur, nom, boisson, argent);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traitre et mon niveau de traitrise est : " + niveauTraitrise + ". Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		if (niveauTraitrise < 3) {
			int argentCommercant = commercant.getArgent();
			int argentRanconer = argentCommercant * 2/10;
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne moi " + argentRanconer + " sous ou gare à toi !");
			commercant.parler("Tout de suite grand " + getNom() + ".");
			commercant.perdreArgent(argentRanconer);
			gagnerArgent(argentRanconer);
			niveauTraitrise ++;
		} else {
			parler("Mince je ne peux plus ranconner personne sinon un samourai risque de me démasquer !");
		}
	}
	
	public void faireLeGentil(Humain ami) {
		if (nbConnaissance < 1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
		} else {
			int don = getArgent() * 1/20;
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + ami.getNom() + ".");
			parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + " sous.");
			ami.gagnerArgent(don);
			perdreArgent(don);
			ami.parler("Merci " + getNom() + ". Vous êtes quelqu'un de bien.");
			niveauTraitrise --;
		}
	}
}
