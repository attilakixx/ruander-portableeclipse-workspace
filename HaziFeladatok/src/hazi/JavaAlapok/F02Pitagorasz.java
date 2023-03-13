package hazi.JavaAlapok;

import java.util.Scanner;

public class F02Pitagorasz {

//	Írjunk programot a Pitagorasz-tétel alkalmazására! A program kérje be egy derékszögű
//	háromszög két befogóját, és számítsa ki az átfogó hosszát! (pitagorasz)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Adja meg az egyik befogó hosszát (cm): ");
		double befogoA = Double.parseDouble(scanner.nextLine());

		System.out.print("Adja meg a másik befogó hosszát (cm): ");
		double befogoB = Double.parseDouble(scanner.nextLine());

		double atfogo = Math.sqrt(befogoA * befogoA + befogoB * befogoB);

		System.out.printf("Az átfogó hossza: %.2f cm", atfogo);

		scanner.close();
	}

}
