package personnages;

public enum TypeHumain {
	HUMAIN("un habitant"), COMMERCANT("un commerçant"), YAKUZA("un yakuza"), RONIN("un ronin"), SAMOURAI("un samouraï"),
	TRAITRE("un traître"), GRANDMERE("une grand-mère");

	private String nom;

	private TypeHumain(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	@Override
	public String toString() {
		return nom;
	}
}
