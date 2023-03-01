package hazi.JavaAlapok2;

import java.util.Scanner;

public class F01MaradekNelkulOttelHarommal {
//	01Kérj be két számot, majd döntsd el, hogy összegük osztható –e 5-tel és 3-mal is maradék nélkül! 
//	(maradek_nelkul_ottel_harommal)

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Adjon meg egy egész számot: ");
		int megadottSzam1 = Integer.parseInt(scanner.nextLine());

		System.out.println("Adjon meg még egy egész számot: ");
		int megadottSzam2 = Integer.parseInt(scanner.nextLine());

		int megadottSzamokOsszege = megadottSzam1 + megadottSzam2;

		String oszthato = "A megadott számok összege (" + megadottSzamokOsszege
				+ ") osztható 3-mal és 5-tel maradék nélkül.";
		String nemOszthato = "A megadott számok összege (" + megadottSzamokOsszege
				+ ") nem osztható 3-mal és 5-tel maradék nélkül.";

		if (megadottSzamokOsszege % 5 == 0 && megadottSzamokOsszege % 3 == 0) {
			System.out.println(oszthato);

		} else {
			System.out.println(nemOszthato);
		}
		scanner.close();
	}
}