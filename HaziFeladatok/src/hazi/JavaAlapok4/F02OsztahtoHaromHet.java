package hazi.JavaAlapok4;

import java.util.Scanner;

//2. Készíts metódust, amely két egész szám közötti intervallumon belül kiírja a 3-mal és 7-tel is
//maradék nélkül osztható számokat! A két bemenő paramétert a felhasználótól érkező adatokkal
//adjuk meg. Egészítsük ki a feladatot: a 3 és 7 helyett legyen megadható ez a két paraméter is,
//tetszőleges egész szám!

public class F02OsztahtoHaromHet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		intervallumBekerOszthatoEKiir();
		// megbeszélni, miért fut hibára, ha a scanner mindkét methodban be van csukva

		System.out.println("Teszt vége -----------------------");

		intervallumBekerOszthatoEHaromHetKiir();

		System.out.println("Teszt vége -----------------------");


		megadottKetSzamOszthatoKiir(1, 10, 2, 5);
		oszthatoHaromHetKiir(1, 10);
		oszthatoHaromHetKiir(10, 1);
		oszthatoHaromHetKiir(1, 1);
		scanner.close();

	}

	public static void megadottKetSzamOszthatoKiir(int intervallumKezdoeertek,
			int intervallumZaroertek, int oszto1, int oszto2) {


		boolean vanEOszthato = false;

		if (intervallumZaroertek < intervallumKezdoeertek) {
			System.out.println(
					"Csak olyan intervallumot adhat meg, ahol a kezdőérték kisebb, mint a záróérték.");
		} else {
			System.out.println("A következő számok oszthatók a megadott intervallumban " + oszto1
					+ " vagy " + oszto2 + " osztóval:");
			for (int i = intervallumKezdoeertek; i <= intervallumZaroertek; i++) {
				if (i % oszto1 == 0 || i % oszto2 == 0) {
					vanEOszthato = true;
					System.out.print(i + " ");
				}
			}

			if (!vanEOszthato) {
				System.out.println("Nincs olyan szám a megadott intervallumban,"
						+ " amely osztható a következő számok egyikével: " + oszto1 + ", " + oszto2
						+ ".");

			}

		}

		System.out.println();
	}

	public static void oszthatoHaromHetKiir(int intervallumKezdoeertek, int intervallumZaroertek) {
		megadottKetSzamOszthatoKiir(intervallumKezdoeertek, intervallumZaroertek, 3, 7);
	}

	public static void intervallumBekerOszthatoEKiir() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Adja meg az első vizsgálandó osztót: ");
		int oszto1 = Integer.parseInt(scanner.nextLine());

		System.out.print("Adja meg az második vizsgálandó osztót: ");
		int oszto2 = Integer.parseInt(scanner.nextLine());

		System.out.print("Adja meg az intervallum kezdőértékét: ");
		int kezdoertek = Integer.parseInt(scanner.nextLine());
		System.out.print("Adja meg az intervallum vegertékét: ");
		int vegertek = Integer.parseInt(scanner.nextLine());

		megadottKetSzamOszthatoKiir(kezdoertek, vegertek, oszto1, oszto2);



	}

	public static void intervallumBekerOszthatoEHaromHetKiir() {
		Scanner scanner = new Scanner(System.in);


		System.out.println("Adja meg az intervallum kezdőértékét: ");
		int kezdoertek = Integer.parseInt(scanner.nextLine());
		System.out.print("Adja meg az intervallum vegertékét: ");
		int vegertek = Integer.parseInt(scanner.nextLine());

		megadottKetSzamOszthatoKiir(kezdoertek, vegertek, 3, 7);

	}
}
//nyitva kell hagyni a scannert, hogy lefusson.
