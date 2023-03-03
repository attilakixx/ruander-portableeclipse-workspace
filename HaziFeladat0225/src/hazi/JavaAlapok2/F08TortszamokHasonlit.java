package hazi.JavaAlapok2;

import java.util.Scanner;

public class F08TortszamokHasonlit {
//	Készíts alkalmazást, amely bekér két tört számot, majd eldönti, hogy melyik a kisebb/nagyobb, 
//	esetleg egyenlő –e a két szám! (tortszamok_hasonlit)
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);


		System.out.print("Adjon meg egy tört számot: ");
		double tortszam1 = Double.parseDouble(scanner.nextLine());

		System.out.print("Adjon meg egy tört számot: ");
		double tortszam2 = Double.parseDouble(scanner.nextLine());


		if (tortszam1 == tortszam2) {
			System.out.println("A két szám egyenlő.");
		} else if (tortszam1 > tortszam2) {
			System.out.println("Az első szám nagyobb.");
		} else {
			System.out.println("A második szám nagyobb.");
		}
		scanner.close();



	}

}
