package hazi.JavaAlapok2;

import java.util.Scanner;

public class F05SzorzatParos {
//5. Kérj be 2 számot, majd döntsd el, hogy szorzatuk páros vagy páratlan! (szorzat_paros)
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Adjon meg egy egész számot: ");
		int szam1 = Integer.parseInt(scanner.nextLine());

		System.out.print("Adjon meg még egy egész számot: ");
		int szam2 = Integer.parseInt(scanner.nextLine());

		int szorzat = szam1 * szam2;

		if (szorzat == 0) {
			System.out.println("A számok szorzata 0 - se nem páros, se nem páratlan.");
		} else if (szorzat % 2 == 0) {
			System.out.println("A megadott számok szorzata (" + szorzat + ") páros.");

		} else {
			System.out.println("A megadott számok szorzata (" + szorzat + ") páratlan.");
		}

		scanner.close();

	}

}
