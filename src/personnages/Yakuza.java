package personnages;

public class Yakuza extends Humain{
    private String clan;
    private int reputation = 0;

    public Yakuza(String nom, String boisson, int argent, String clan) {
        super(nom, boisson, argent);
        this.clan = clan;
    }

    public int getReputation() {
        return reputation;
    }

    public void extorquer(Commercant victime) {
        parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
        parler(victime.getNom() + ", si tu tiens à la vie donne ta bourse !");
        int argentAvantExtorquer = argent;
        gagnerArgent(victime.seFaireExtorquer());
        int argentPique = argent - argentAvantExtorquer;
        parler("J'ai piqué " + argentPique + " sous de " + victime.getNom() + ", ce qui me fait " + argent +
                " sous dans ma poche. Hi ! Hi !");
        reputation += 1;
    }

    public int perdre() {
        parler("J'ai perdu mon duel et mes " + argent + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
        perdreArgent(argent);
        reputation -= 1;
        return argent;
    }

    public void gagner(int gain) {
        gagnerArgent(gain);
        reputation += 1;
        parler("Ce ronin pensait vraiment battre " + this.getNom() + " du clan de " + clan +
                " ? Je l'ai dépouillé de ses " + gain + " sous.");
    }
}
