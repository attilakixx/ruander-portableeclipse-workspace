package hazi.JavaAlapok4;

import java.util.Random;
import java.util.Scanner;

//4. Készíts programot a kő-papír-olló játék szimulálására! Metódusokkal oldjuk meg a feladatot!
public class F04KoPapirOllo {
	Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) {
		System.out.println("Üdv, játsszunk kő/papír/ollót!");

		boolean szerenteUjrajatszani = false;
		int felhasznaloPontszam = 0;
		int gepPontszam = 0;

		do {
			String felhasznaloValasza = koPapirOlloBeker();
			String gepValasza = veletlenKoPapOllo();

			System.out.println("\nA felhasználó választása: " + felhasznaloValasza);
			System.out.println("A gép választása: " + gepValasza);
			String akiNyert = felhasznaloNyertEEldont(felhasznaloValasza, gepValasza);

			System.out.println(akiNyert);

			if (akiNyert.equals("A felhasználó nyert.")) {
				felhasznaloPontszam++;
			} else if (akiNyert.equals("A gép nyert.")) {
				gepPontszam++;
			}

			System.out.println(
					"\nAz állás: \nFelhasználó: " + felhasznaloPontszam + "\nGép: " + gepPontszam);

			szerenteUjrajatszani = ujraJatszikEldont();

		} while (szerenteUjrajatszani);



	}

	public static String veletlenKoPapOllo() {
		Random random = new Random();
		int generaltSzam = random.nextInt(3) + 1;
		return ValasztastSzovegesenKiir(generaltSzam);
	}

	public static String koPapirOlloBeker() {
		Scanner scanner = new Scanner(System.in);
		int felhasznaloValasztasa = 0;

		boolean ervenyesEValasztas = false;
		while (!ervenyesEValasztas) {

			System.out.println("Mit választ?");
			System.out.println("1 - kő");
			System.out.println("2 - papír");
			System.out.println("3 - olló");

			int bekertszam = Integer.parseInt(scanner.nextLine());
			if (bekertszam > 0 && bekertszam < 4) {
				felhasznaloValasztasa = bekertszam;
				ervenyesEValasztas = true;
			} else {
				System.out.println("Érvénytelen válasz. Adjon meg egy számot 1 és 3 között!");
			}
		}
		return ValasztastSzovegesenKiir(felhasznaloValasztasa);
	}

	public static String ValasztastSzovegesenKiir(int koPapirVagyOllo) {
		String koPapirVagyOlloString = (koPapirVagyOllo == 1) ? "kő"
				: ((koPapirVagyOllo == 2) ? "papír" : "olló");
		return koPapirVagyOlloString;

	}

	public static String felhasznaloNyertEEldont(String felhasznaloValasztasa,
			String gepValasztasa) {
		String nyertE;
		if (felhasznaloValasztasa.equals(gepValasztasa)) {
			nyertE = "Döntetlen";
		} else if ((felhasznaloValasztasa.equals("kő") && gepValasztasa.equals("olló"))
				|| (felhasznaloValasztasa.equals("olló") && gepValasztasa.equals("papír"))
				|| (felhasznaloValasztasa.equals("papír") && gepValasztasa.equals("kő"))) {
			nyertE = "A felhasználó nyert.";
		} else {

			nyertE = "A gép nyert.";
		}
		return nyertE;
	}

	public static boolean ujraJatszikEldont() {
		Scanner scanner = new Scanner(System.in);

		boolean validEValasz = false;
		boolean szerenteEUjrajatszani = false;

		while (!validEValasz) {
			System.out.println("Szeretne újra játszani?");
			System.out.println("1 - Igen");
			System.out.println("2 - Nem");

			int igenNemSzammal = Integer.parseInt(scanner.nextLine());

			validEValasz = (igenNemSzammal == 1 || igenNemSzammal == 2);
			if (!validEValasz) {
				System.out.println("Érvénytelen válasz.");
			}
			if (igenNemSzammal == 1) {
				szerenteEUjrajatszani = true;
			}

		}
		return szerenteEUjrajatszani;



	}
}