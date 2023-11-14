package personnages;

import java.util.Random;

public class GrandMere extends Humain{
	private static final String boisson = "tisane";
	private int maxNbConnaissance = 5;

	public GrandMere(String nom, int argent) {
		super(nom, boisson, argent);
	}
	
	@Override
	protected void memoriser(Humain humain) {
		if (nbConnaissance < maxNbConnaissance) {
			memoire[nbConnaissance] = humain;
			nbConnaissance++;
		} else {
			parler("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !");
		}
	}
	
	private String humainHasard() {
		Random random = new Random();
		TypeHumain[] types = TypeHumain.values();
		int i = random.nextInt(0, types.length);
		return "" + types[i];
	}
	
	public void ragoter() {
		for (int i=0; i<nbConnaissance; i++) {
			if (memoire[i] instanceof Traitre) {
				parler("Je sais que " + memoire[i].getNom() + " est " + TypeHumain.TRAITRE + ". Petit Chenapon !");
			} else {
				parler("Je crois que " + memoire[i].getNom() + " est " + humainHasard());
			}
		}
 }
}
