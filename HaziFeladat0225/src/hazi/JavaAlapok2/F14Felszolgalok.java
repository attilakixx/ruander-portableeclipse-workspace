package hazi.JavaAlapok2;

import java.util.Scanner;

public class F14Felszolgalok {
//	15. A gyorsétterem felszolgálói hetente kapnak fizetést. Mindenki az alapján hány napot dolgozott a 
//	héten. Bérük 8.000 Ft / nap. Kérjük be a felszolgáló nevét és hány napon dolgozott a héten, majd 
//	írjuk ki a heti fizetését. (felszolgalok)
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int napiber = 8000;

		int ledolgozottNapok;
		do {
			System.out.print("Hány napot dolgozott a felszolgáló? ");
			ledolgozottNapok = Integer.parseInt(scanner.nextLine());
			if (ledolgozottNapok < 0 || ledolgozottNapok > 7) {
				System.out.println(
						"Hibás adat! Csak 0-7 közti egész számot adhat meg.");
			}
		} while (ledolgozottNapok < 0 || ledolgozottNapok > 7);

		int hetiFizetes = napiber * ledolgozottNapok;

		System.out.println(
				"\nA felszolgáló heti fizetése " + hetiFizetes + "Ft volt.");

		scanner.close();


	}

}
