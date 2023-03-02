package hazi.JavaAlapok2;

import java.util.Scanner;

public class F02FelnottE {

//2. Kérjük be a felhasználó életkorát, majd döntsük el, hogy felnőtt –e (18 éves kortól már felnőtt)!
//	(felnott_e)

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Adja meg az életkorát! (pozitív, egész szám): ");
		int megadottEletkor = Integer.parseInt(scanner.nextLine());

		if (megadottEletkor >= 18) {
			System.out.println("Már felnőtt");
		} else {
			System.out.println("Még kiskorú.");
		}
		scanner.close();

	}

}
