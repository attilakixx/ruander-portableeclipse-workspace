package tombok.matrixFeladatok;

import java.util.Scanner;

public class F04CharMatrix {
	// Feladat04: 4X2-es mátrix oszlopszintű feltöltése a felhasználótól érkező
	// karakterekkel!

	public static void main(String[] args) {
		System.out.println(
				"Feladat04: 4X2-es mátrix oszlopszintű feltöltése a felhasználótól érkező karakterekkel!\n");
		Scanner scanner = new Scanner(System.in);


		char[][] matrix4 = new char[4][2];

		// Feltöltés

		for (int j = 0; j < matrix4[0].length; j++) {
			System.out.println((j + 1) + ". oszlop:");

			for (int i = 0; i < matrix4.length; i++) {
				System.out.print((i + 1) + ". sor: ");
				matrix4[i][j] = scanner.nextLine().charAt(0);
			}

		}

		for (int i = 0; i < matrix4.length; i++) {

			for (int j = 0; j < matrix4[i].length; j++) {
//				System.out.print("(" + i + "/" + j + "): ");
				System.out.print(matrix4[i][j] + "\t");

			}
			System.out.println();

		}

		scanner.close();
	}



}
