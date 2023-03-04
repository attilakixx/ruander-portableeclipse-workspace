package hazi.JavaAlapok3;

import java.util.Scanner;

public class F08NyolcelemuBekertTomb {

	public static void main(String[] args) {
//		Töltsünk fel egy 8 elemű tömböt a felhasználótól érkező egész számokkal! Írjuk ki az adatokat 
//		egymás mellé szóközzel elválasztva!
//		a. Írjuk ki a párosakat és indexeiket!
//		b. Írjuk ki az utolsó elem négyzetét!
//		c. Írjuk ki az első 2 elem átlagát!
//		d. Írjuk ki az utolsó 3 elem összegét!
//		e. Írjuk ki az első és második elem különbségét!
//		f. Kérjünk be a felhasználótól egy indexet, és egy hatványkitevőt. A megadott indexen lévő 
//		elemet emeljük a megfelelő hatványra, majd írjuk ki!

		Scanner scanner = new Scanner(System.in);
		int[] felhasznaloTombje = new int[7];

		for (int i = 0; i < felhasznaloTombje.length; i++) {
			System.out.println("Adjon meg egy egész számot " + (i + 1) + "/"
					+ felhasznaloTombje.length);
			felhasznaloTombje[i] = Integer.parseInt(scanner.nextLine());
		}

		System.out.println("A tömb elemei: ");
		for (int i : felhasznaloTombje) {
			System.out.print(i + " ");

		}
		System.out.println("\n");
		System.out.println("a, A párosak és indexük: ");
		for (int i = 0; i < felhasznaloTombje.length; i++) {
			if (felhasznaloTombje[i] % 2 == 0) {
				System.out.println("Index " + i + " = " + felhasznaloTombje[i]);
			}
		}

		System.out.println("\n");
		System.out.println("b. Írjuk ki az utolsó elem négyzetét!");
		System.out.println("Az utolsó szám négyzete: " + (int) (Math
				.pow(felhasznaloTombje[felhasznaloTombje.length - 1], 2.0)));


		System.out.println("\n\nc. Írjuk ki az első 2 elem átlagát!");
		double elsoKettoAtlga = (double) (felhasznaloTombje[0]
				+ felhasznaloTombje[1]) / 2.0;
		System.out.println("Az első két szám átlaga: " + elsoKettoAtlga);


		System.out.println("\n");
		System.out.println("d. Írjuk ki az utolsó 3 elem összegét!");
		int sumUtolsoHarom = 0;
		for (int i = felhasznaloTombje.length - 1; i > felhasznaloTombje.length
				- 4; i--) {
			sumUtolsoHarom += felhasznaloTombje[i];
		}

		System.out.println("Az utolsó három szám öszzege: " + sumUtolsoHarom);



		System.out.println("\n");
		System.out.println("e. Írjuk ki az első és második elem különbségét!");
		int kulonbsegEgyKEtto = felhasznaloTombje[0] - felhasznaloTombje[1];
		System.out.println("Az első és a második elem különbsége "
				+ kulonbsegEgyKEtto + ".\n");


		System.out.println("\n");
		System.out.println(
				"f. Kérjünk be a felhasználótól egy indexet, és egy hatványkitevőt. "
						+ "A megadott indexen lévő elemet emeljük a megfelelő hatványra, majd írjuk ki!");

		System.out.println("Adja meg az indexet amit hatványozni "
				+ "szeretne(nagyobb vagy egyenlő 0, kisebb , mint "
				+ felhasznaloTombje.length + ": ");
		int bekertIndex = Integer.parseInt(scanner.nextLine());

		System.out.println(
				"Adja meg melyik hatványra emelné (pozitív, egész szám): ");
		int bekertPow = Integer.parseInt(scanner.nextLine());

		int indexHatvanyozva = (int) Math.pow(felhasznaloTombje[bekertIndex],
				bekertPow);
		System.out.println("A bekért indexen lévő szám ("
				+ felhasznaloTombje[bekertIndex]
				+ ") a megadott hatványkitevőre emelve: " + indexHatvanyozva);


	}



}
