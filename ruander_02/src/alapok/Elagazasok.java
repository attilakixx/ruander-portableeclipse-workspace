package alapok;

import java.util.Scanner;

public class Elagazasok {
	public static void main(String[] args) {

		// Vezérlési szerkezetek: szekvencia sorrendiség - elágazás szelekció - ciklus
		// iteráció
		// Mikor használjuk?
		// Egy vagy több feltételtől függően különböző irányba szeretnénk vezérelni a
		// programunkat
		// A feltétel csak igaz / hamis lehet
		// Típusai egyirányú, kétirányú, többirányú

		// Egyirányú - csak az igaz ágra van szükségünk (if)
		// Kétirányú - if else - Igaz és hamis ágra is szükségünk van
		// Többitányú - ief elseif else - Ha akkor, különben típusú feladatoknál

		/**************** Egyirányú elágazás ************************/
		// A feltétel (condition) igaz ágával foglalkozunk csak.
		// Feladat 01: Kérjük be a kinti hőmérsékletet, majd döntsük el, fagy e (<0)
		// Csak abban az esetben írjunk ki eredményt, ha 0 alatt van a hőmérséklet.

		Scanner scanner = new Scanner(System.in);

		int homerseklet;

		System.out.print("Add meg a kinti hőmérsékletet (egész szám):");
		homerseklet = Integer.parseInt(scanner.nextLine());

		if (homerseklet < 0) {
			System.out.println("Fagy odakint.");
		}
		System.out.println();

		// Kövi példa: logikai típus kezdőértéke false, és csak akkor billentjük át ha
		// igaz az állítás

		// Feladat 2:Van e termék raktáron? Állítsuk be az elérheto változót
		// igaz/hamisra.

		System.out.println("Feladat 2 - Termék elérhető-e");
		boolean elerheto = false;
		System.out.print("Kérem adja meg a raktármennyiséget (egész szám): ");
		int raktarmennyiseg = Integer.parseInt(scanner.nextLine());
		if (raktarmennyiseg > 0) {
			elerheto = true;
		}

		// Kétirányú elág:
		if (elerheto) {
			System.out.println("A termék elérhető, raktáron: " + raktarmennyiseg + "db.");
		} else {
			System.out.println("A termék nem elérhető.");
		}
		System.out.println(
				elerheto ? ("A termék elérhető, raktáron: " + raktarmennyiseg + "db.") : ("A termék nem elérhető."));
		/******************* Kétirányú elág ***************/

		// Feladat03: Kérjünk be egy pozitív egész számot, majd döntsük el, hogy páros
		// vagy páratlan!

		System.out.print("Adjon meg egy pozitív egész számot: ");
		int megadottSzam = Integer.parseInt(scanner.nextLine());
		System.out.println((megadottSzam % 2 == 0) ? ("A megadott szám páros") : ("A megadott szám páratlan."));
		System.out.println();

		// Feladat04: Kérjünk be két pozitív egész számot, majd a szorzatukról döntsük
		// el, hogy 100 száz felett van -e!

		System.out.print("Adjon meg egy pozitív egész számot: ");

		int megadottSzam2 = Integer.parseInt(scanner.nextLine());
		System.out.print("Adjon meg még egy pozitív egész számot: ");

		int megadottSzam3 = Integer.parseInt(scanner.nextLine());

		int szorzat = megadottSzam2 * megadottSzam3;

		if (szorzat > 100) {
			System.out.print("A megadott számok szorzata (" + szorzat + ") nagyobb, mint 100.");
		} else {
			System.out.print("Amegadott számok szorzata (" + szorzat + ") kisebb, vagy egyenlő 100.");
		}

		/****************************** Többirányú elégazás ***********/

		// Akkor használjuk, ha kettőnél is több irányra van szükség.
		// Feladat 5: Kérj be két egész számot, döntsd el kisebb nagyobb vagy egyenlő!

		System.out.print("Adjon meg egy pozitív egész számot: ");
		int szam1 = Integer.parseInt(scanner.nextLine());

		System.out.print("Adjon meg még egy pozitív egész számot: ");
		int szam2 = Integer.parseInt(scanner.nextLine());

		if (szam1 == szam2) {
			System.out.println("A két szám megegyezik");
		} else if (szam1 > szam2) {
			System.out.println("Az első megadott szám nagyobb");
		} else {
			System.out.println("A második megadott szám a nagyobb.");
		}

		// Feladat06: Kérjük be felhasználótól, hogy naponta átlagosan mennyi
		// időt(órában)
		// tölt a képernyő előtt! A választól függően írjuk ki a következőket:
		// 0-2: Kevés időt tölt a képernyő előtt, nem szükséges szemtorna!
		// 3-5: Mérsékelt a képernyőhasználat, de néha tartsunk pihenőt!
		// 6 és felette: Óránként tartsunk 10 perc szünetet vagy végezzünk szemtornát!
		System.out.println("Feladat 6\n");

		System.out.println("Adja meg mennyi időt tölt képernyő előtt egy nap (órában): ");

		int gepezikOra = Integer.parseInt(scanner.nextLine());

		if (gepezikOra < 0 || gepezikOra > 24) {
			System.out.println("Érvénytelen szám");

		} else if (gepezikOra < 3) {
			System.out.println("Kevés időt tölt a képernyő előtt, nem szükséges szemtorna!");

		} else if (gepezikOra < 6) {
			System.out.println("Mérsékelt a képernyőhasználat, de néha tartsunk pihenőt!");

		} else {
			System.out.println("Óránként tartsunk 10 perc szünetet vagy végezzünk szemtornát!");
		}

		/************************** Több irányú elág switchcase szerkezettel *********/
		// Akkor használjuk, ha kötött a lehetőségek száma. Pl.hónapok napok nevei,
		// érdemjegyek, menüszerkezet...
		// Intervallumvizsgálatra nem való, csak egy konkrét értéket vizsgál.
		// A vizsgált érték lehet szám, karakter, szöveg.

		System.out.println("Feladat 7\n");
		// érdemjegy bekér, kiír szövegesen

		System.out.println("Adja meg az érdemjegyet (1-5)");

		int erdemjegy = Integer.parseInt(scanner.nextLine());

		switch (erdemjegy) {
		case 1:
			System.out.println("Elégtelen");
			break;
		case 2:
			System.out.println("Elégséges");
			break;
		case 3:
			System.out.println("Közepes");
			break;
		case 4:
			System.out.println("Jó");
			break;
		case 5:
			System.out.println("Jeles");
			break;

		default:
			System.out.println("Érvénytelen érték");
			break;
		}
		// break kötelező résza a szintaxnak, kiugrik a switch utáni részre
		// default nem kötelező

		System.out.println("Feladat 8\n");
		System.out.print("Adja meg szövegesen az érdemjegyet: ");
		String erdemjegySzovegesen = (scanner.nextLine()).toLowerCase();

		switch (erdemjegySzovegesen) {
		case "elégtelen":
			System.out.println("1");
			break;
		case "elégséges":
			System.out.println("2");
			break;
		case "közepes":
			System.out.println("3");
			break;
		case "jó":
			System.out.println("4");
			break;
		case "jeles":
			System.out.println("5");
			break;

		default:
			System.out.println("Érvénytelen szöveg");
			break;
		}

		System.out.println("Feladat 9\n");
		// kérjük be a nap sorszámát (1-7) határozzuk meg, hogy hétvége, vagy hétköznap!
		System.out.print("Adja meg a nap számát (1-7)");
		int napSorszama = Integer.parseInt(scanner.nextLine());

		switch (napSorszama) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Hétköznap");

			break;
		case 6:
		case 7:
			System.out.println("Hétvége");
		default:
			System.out.println("Hibás adat");
			break;
		}
		scanner.close();

	}
}