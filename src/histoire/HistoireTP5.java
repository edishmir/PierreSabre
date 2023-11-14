package histoire;

//import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Traitre;
import personnages.GrandMere;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", "thé", 20);
		Commercant chonin = new Commercant("Chonin", "thé", 40);
		Commercant kumi = new Commercant("Kumi", "thé", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		System.out.println("\n");
		
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
		akimoto.faireConnaissanceAvec(marco);
		akimoto.listerConnaissance();
		System.out.println("\n");
		
		akimoto.boire(marco.getBoissonFavorite());
		System.out.println("\n");
		
		Traitre masako = new Traitre("Miyamoto", "Masako", "whisky", 100);
		masako.faireLeGentil(kumi);
		masako.ranconner(kumi);
		masako.ranconner(chonin);
		masako.ranconner(marco);
		akimoto.faireConnaissanceAvec(masako);
		masako.ranconner(kumi);
		masako.faireConnaissanceAvec(yaku);
		masako.faireLeGentil(yaku);
		masako.faireConnaissanceAvec(roro);
		System.out.println("\n");
		
//		Samourai akira = new Traitre("Miyamoto", "Akira", "whisky", 50);
//		Ronin hiro = new Traitre("Miyamoto", "Hiro", "saké", 20);
//		Humain nori = new Traitre("Miyamoto", "Nori", "whisky", 70);
		
		GrandMere grandMere = new GrandMere("Grand-Mère", 10);
		grandMere.faireConnaissanceAvec(akimoto);
		grandMere.faireConnaissanceAvec(yaku);
		grandMere.faireConnaissanceAvec(masako);
		grandMere.faireConnaissanceAvec(kumi);
		grandMere.faireConnaissanceAvec(marco);
		grandMere.faireConnaissanceAvec(chonin);
		grandMere.ragoter();

	}

}
