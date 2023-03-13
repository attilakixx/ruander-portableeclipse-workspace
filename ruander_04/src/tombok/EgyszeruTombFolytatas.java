package tombok;

import java.util.Scanner;

public class EgyszeruTombFolytatas {

	public static void main(String[] args) {
		// Feladat06
		// Feladat06: 5 elemű tömb feltöltése a felhasználótól érkező egész számokkal.
		// Írjuk ki egymás mellé szóközzel elválasztva az elemeket! A feltöltéskor
		// tájékoztassuk a felhasználót arról, hogy melyik értéket adja meg.
		// Melyik indexen vannak a páros elemek! Amennyiben nem volt ilyen, erről
		// is írjunk üzenetet!

		System.out.println("Feladat06: \n");

		int[] tomb6 = new int[5];

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < tomb6.length; i++) {
			System.out.print("Adja meg az " + (i + 1) + ". számot: ");


			tomb6[i] = Integer.parseInt(scanner.nextLine());

		}
		System.out.println("\nA tömb elemei: ");
		for (int i : tomb6) {
			System.out.print(i + " ");

		}


		boolean vanEParos = false;
		String parosElemuIndexek = "";

		for (int i = 0; i < tomb6.length; i++) {
			if (tomb6[i] % 2 == 0) {
				parosElemuIndexek = parosElemuIndexek + i + " ";
				vanEParos = true;
			}
		}
		if (vanEParos) {
			System.out.println("\n\nA páros elemet tartozó indexek: " + parosElemuIndexek);
		} else {
			System.out.println("\n\nNem volt páros elem.");
		}



		scanner.close();

	}

}
