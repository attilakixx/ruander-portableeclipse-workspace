package hazi.JavaAlapok2;

import java.util.Scanner;

public class F09Telepules {
//	Irj programot, amely bekér a felhasználótól egy helységnevet, valamint ennek a helységnek a
//	lélekszámát, és a megadott lélekszámtól függően kiírja, hogy az adott helység milyen
//	településtípusba tartozik. (telepules)
//	- ha a lélekszám kevesebb, mint 5000, akkor község
//	- ha a lélekszám legalább 5000, de kevesebb, mint 20 000, akkor kisváros
//	- ha a lélekszám legalább 20 000, de kevesebb, mint 100 000, akkor középváros
//	- ha a lélekszám legalább 100 000, de kevesebb, mint 1 000 000, akkor nagyváros
//	- ha a lélekszám legalább 1 000 000, akkor metropolis
//	- ha a felhasználó 0 vagy annál kisebb számot ad meg, a program írja ki, hogy "Hibás
//	adatbevitel"!

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);


		System.out.print("Adja meg a telpülés nevét: ");
		String telepulesNeve = scanner.nextLine();

		System.out.print("Adja meg a lélekszámot (pozitív egész szám): ");
		int telepulesLelekszama = Integer.parseInt(scanner.nextLine());

		String telepulesTipusa;

		if (telepulesLelekszama < 5000) {
			telepulesTipusa = "község";
		} else if (telepulesLelekszama < 20000) {
			telepulesTipusa = "kisváros";
		} else if (telepulesLelekszama < 10000) {
			telepulesTipusa = "középváros";
		} else if (telepulesLelekszama < 1000000) {
			telepulesTipusa = "nagyváros";
		} else {
			telepulesTipusa = "metropolis";
		}

		if (telepulesLelekszama <= 0) {
			System.out.println("Hibás adatbevitel");
		} else {
			System.out.println(telepulesNeve + " települes egy " + telepulesTipusa + ".");
		}

		scanner.close();
	}
}


