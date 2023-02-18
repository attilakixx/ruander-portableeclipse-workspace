package alapok;

public class TipusokSzovegEsKarakter {

	public static void main(String[] args) {

		// char primitiv tius : Egy karakter tárolása
		// String - rferenciatípus

		char betu = 'R';
		System.out.println(betu);

		String szoveg1;
		szoveg1 = "teszt szöveg";
		System.out.println(szoveg1);
		String szoveg2 = "vége";

		System.out.println(szoveg1 + " " + szoveg2);

		// speckó karakterek
		// \n: sortörés / new line character
		// \t: tabulátor
		// \b: backspace - kurzor a sor elejére ugrik

		String szoveg3 = "Ez egy java String";
		System.out.println(szoveg3);

		/************ szöveg összeóhasonlítás *********/

		if (szoveg1.equals(szoveg2))
			System.out.println("egyezik");

		// 2. szöveg immutable object: nem lehet megváltoztatni a benne lévő
		// karaktereket.
		// elérni el lehet, csak olvasható, de nem felülírható. Megoldás: StringBuilder
		// használata.

		System.out.println(szoveg2.charAt(0));

		// szoveg2 = "122";
		System.out.println(szoveg2);
	}

}
