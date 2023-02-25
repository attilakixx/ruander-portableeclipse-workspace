package hazi.JavaAlapok;

import java.util.Scanner;

public class F06AtlagHarom {
//	Kérj be 3 egész számot, majd írd ki az átlagukat! (atlag_harom)
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Adja meg az első számot: ");
		int elsoSzam = Integer.parseInt(scanner.nextLine());

		System.out.print("Adja meg az második számot: ");
		int masodikSzam = Integer.parseInt(scanner.nextLine());

		System.out.print("Adja meg az harmadik számot: ");
		int harmadikSzam = Integer.parseInt(scanner.nextLine());

		double atlag = (elsoSzam + masodikSzam + harmadikSzam) / 3.0;

		System.out.printf("A három szám átlaga: %.2f", atlag);

		scanner.close();
	}

}
