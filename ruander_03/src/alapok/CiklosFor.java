package alapok;

import java.util.Scanner;

public class CiklosFor {

	public static void main(String[] args) {
		// Ciklus - iteráció
		// Mikor használjuk
		// Amkior egy vagy több utasítást többször szeretnénk ismételni
		// Mikor használunk for ciklust?
		// Amikor előre tudjuk, hányszor kell ismételni
		// Milyen részei vannak?
		// Ciklusfeltétel, ciklusmag, iterátor (léptető)
		// legtöbbször használt ciklusfajta
		// oka: adatszerkezetek bejárására használjuk a legtöbbször

		Scanner scanner = new Scanner(System.in);
//		System.out.println(
//				"F01: Kérjünk be egy nevet, írjuk ki 5x egymás alá! Jelenítsük meg hányadik futás");
//
//		System.out.print("Adja meg a nevét: ");
//		String nev = scanner.nextLine();
//
//
//		for (int i = 1; i < 6; i++) {
//			System.out.println(i + ". futás: " + nev);
//		}
//
//		System.out.println();

//		System.out.println(
//				"Kérjük be egy gyümölcsnevet és egy ismétlésszámo! Írjuk ki annyiszor a gyümölcsöt, amekkora sértéket megadott a felhasználó.");
//
//		System.out.print("Kérem adja meg a gyümölcsnevet: ");
//		String gyumolcsnev = scanner.nextLine();
//
//		System.out.print("Ennyiszer ismételjen: ");
//		int ismetlesSzam = Integer.parseInt(scanner.nextLine());
//
//		for (int i = 0; i < ismetlesSzam; i++) {
//			System.out.println(gyumolcsnev);
//
//		}
		// Feladat03: Kérjünk be 10 db egész számot, majd mindegyikről külön-külön
		// írjuk ki, hogy hárommal maradék nélkül osztható -e!
		// Tömb nélkül oldjuk meg!!!
		/*
		 * // System.out.println("F03 - Hárommal való oszthatóság"); // // for (int i =
		 * 0; i < 10; i++) { // // System.out.print("Adja meg a " + (i + 1) +
		 * ". számot: "); // int szam = Integer.parseInt(scanner.nextLine()); //
		 * System.out.println((szam % 3 == 0) ? szam + " osztható 3-mal maradék nélkül."
		 * // : szam + " nem osztható 3-mal maradék nélkül."); // } // // // // //
		 * Feladat04: 10-től visszafelé 1-ig egymás mellé szóközzel elválasztva írjuk ki
		 * // // a számokat! 10 9 8 ... 1 // for (int i = 10; i > 0; i--) { // //
		 * System.out.print(i + " "); // // // // } // }
		 */

		// Feladat05: Kérjünk be egy kezdő és egy végértéket, majd írjuk ki az
		// intervallumon
		// belül a hárommal és néggyel maradék nélkül osztható egész számokat egymás
		// mellé szóközzel elválasztva! Amennyiben nincs az intervallumon belül
		// megfelelő érték, arról is tájékoztassuk a felhasználót!

//		System.out.println("F05 - intervallum 3-4 osztás");
//
//		System.out.print("Adja meg az intervallum kezdőértékét: ");
//		int kezdoertek = Integer.parseInt(scanner.nextLine());
//
//		System.out.print("Adja meg az intervallum végértékét: ");
//		int vegertek = Integer.parseInt(scanner.nextLine());
//
//		boolean voltESzam = false;
//
//		for (int i = kezdoertek; i <= vegertek; i++) {
//
//			if (vegertek <= kezdoertek) {
//				System.out.println("A végérték nem lehet kisebb, mint a kezdőérték.");
//				break;
//
//			}
//			if (i % 3 == 0 && i % 4 == 0 && i != 0) {
//				System.out.println(i + " ");
//				voltESzam = true;
//
//			}
//		}
//		if (!voltESzam) {
//			System.out.println(
//					"A megadott intervallumban nem volt 3-mal, vagy 4-gyel osztható szám.");
//		}



		// Feladat06: 500 és 600 között írjunk ki minden harmadik számot, egymás mellé
		// vesszővel elválaszva, de utolsó után ne legyen vessző!

		for (int i = 500; i <= 600; i += 3)
			if ((i + 3) < 600)
				System.out.print(i + ", ");
			else {
				System.out.println(i);
			}

	}
}

