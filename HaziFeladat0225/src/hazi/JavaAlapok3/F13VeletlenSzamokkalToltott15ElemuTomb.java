package hazi.JavaAlapok3;

import java.util.Random;

public class F13VeletlenSzamokkalToltott15ElemuTomb {

//13. Hozzunk létre egy 15 elemű tömböt véletlen számokkal [20, 60] közötti intervallumban, majd írjuk
//	ki az elemeket egymás mellé szóközzel elválasztva!
//	a. Írjuk ki az 40-nél nagyobb értékeket egymás mellé!
//	b. Írjuk ki a 25-nél kisebb értékeket, ha nincs ilyen, akkor „Nincsen 25-nél kisebb” szöveg jelenjen
//	meg a konzolon!
//	c. Írjuk ki az 3-mal maradék nélkül osztható számokat egymás mellé!
//	d. Írjuk ki a páratlan elemeket egymás mellé!

	public static void main(String[] args) {
		// Hozzunk létre egy 15 elemű tömböt véletlen számokkal [20, 60] közötti
		// intervallumban, majd írjuk
		// ki az elemeket egymás mellé szóközzel elválasztva!

		Random random = new Random();
		int[] myIntArray = new int[15];
		for (int i = 0; i < myIntArray.length; i++) {
			myIntArray[i] = random.nextInt(41) + 20;
		}

		for (int i : myIntArray) {
			System.out.print(i + " ");
		}


		//// a. Írjuk ki az 40-nél nagyobb értékeket egymás mellé!

		System.out.println("\n\nA 40-nél nagyobb értékek: ");

		for (int i = 0; i < myIntArray.length; i++) {
			if (myIntArray[i] > 40) {


				System.out.print(myIntArray[i] + " ");
			}
		}

		// b. Írjuk ki a 25-nél kisebb értékeket, ha nincs ilyen, akkor „Nincsen 25-nél
		// kisebb” szöveg jelenjen
		// meg a konzolon!

		System.out.println("\n\nA 25-nél kisebb értékek: ");
		boolean isAnylessThan25 = false;

		for (int i = 0; i < myIntArray.length; i++) {
			if (myIntArray[i] < 25) {
				System.out.print(myIntArray[i] + " ");
				isAnylessThan25 = true;
			}

		}
		if (!isAnylessThan25) {
			System.out.println("Nincsen 25-nél kisebb");
		}

//		c. Írjuk ki az 3-mal maradék nélkül osztható számokat egymás mellé!

		System.out.println("\n\nA 3-mal maradék nélkül oszthatók: ");
		for (int i = 0; i < myIntArray.length; i++) {
			if (myIntArray[i] % 3 == 0) {
				System.out.print(myIntArray[i] + " ");
			}
		}
//		d. Írjuk ki a páratlan elemeket egymás mellé!
		System.out.println("\n\nA páratlen elemek: ");
		for (int i = 0; i < myIntArray.length; i++) {
			if (myIntArray[i] % 2 != 0) {
				System.out.print(myIntArray[i] + " ");
			}
		}
	}
}