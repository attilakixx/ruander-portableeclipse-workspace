package alapok;

public class FormazottKiiras {

	public static void main(String[] args) {

		Integer egeszSzam = 4;
		System.out.println("Szám értéke: " + egeszSzam);

		// printf elavult (deprecated)
		// formátum String
		System.out.printf("A szám értéke: %d volt", egeszSzam);
		System.out.println("");

		// A szám értéke: 4 volt

		Integer almaDarab = 6;
		Float homerseklet = 33.4f;
		String napSzovegesen = "szombat";

		System.out.format("Az almák darabszáma: %d. " // %d=decimális
				+ "A jelenlegi hőmérséklet: %f, " // %f = float
				+ "ezen a napon: %s ", almaDarab, homerseklet, napSzovegesen); // %s = String

		System.out.println("");
		// %d = decimal (egész szám
		// %f = float egyszeres pontosságú tört
		// %s = szöveg (string)
		// %n new line új sor
		System.out.format("A Pi értéke 3 tizedes jegyig: %.3f%n", Math.PI);

		// kiírja: A Pi értéke 3 tizedes jegyig: 3,142

		System.out.format("93 oktálisan |%#o|%n", 93); // %#o = oktális
	}

}
