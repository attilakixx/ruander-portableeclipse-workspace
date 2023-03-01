package hayi.JavaAlapok2;

import java.util.Scanner;

public class MaradekNelkulOttelHarommal {
//	Kérj be két számot, majd döntsd el, hogy összegük osztható –e 5-tel és 3-mal is maradék nélkül! 
//	(maradek_nelkul_ottel_harommal)

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Adjon meg egy számot, és megmondom osztható-e "
				+ "5-tel és 3-mal is maradék nélkül! A szám: ");

		double megadottSzam = Double.parseDouble(scanner.nextLine());

		System.out.println(oszthatoAB(megadottSzam, 5, 3)
				? "A megadott szám osztható 3-mal és 5-tel maradék nélkül."
				: "A megadott szám nem osztható 3-mal és 5-tel maradék nélkül. ");

	}

	public static int osszegAB(int a, int b) {
		return a + b;
	}

	public static double osszegAB(double a, double b) {
		return a + b;
	}

	public static boolean oszthatoAB(int szam, int a, int b) {
		return (szam / a == 0 && szam / b == 0);

	}

	public static boolean oszthatoAB(double szam, int a, int b) {
		return (szam / a == 0 && szam / b == 0);
	};
}
