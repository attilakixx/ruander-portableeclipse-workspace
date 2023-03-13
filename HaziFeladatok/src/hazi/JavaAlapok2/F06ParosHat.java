package hazi.JavaAlapok2;

import java.util.Scanner;

public class F06ParosHat {

//	6. Kérj be a felhasználótól 6 egész számot, majd írjuk ki mellé, hogy páros vagy páratlan a megadott 
//	szám! (paros_hat)
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 6; i++) {
			System.out.print("Adja meg az " + (i + 1) + ". (egész) számot: ");
			int szam = Integer.parseInt(scanner.nextLine());
			if (szam == 0) {
				System.out.println("0 se nem páros se nem páratlan");
				continue;
			}
			String message = (szam % 2 == 0) ? " Páros." : " Páratlan.";

			System.out.println("A megadott szám: " + szam + message);
		}
		scanner.close();
	}
}
