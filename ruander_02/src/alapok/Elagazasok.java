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
	}
}