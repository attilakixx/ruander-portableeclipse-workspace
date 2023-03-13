package tombok.matrixFeladatok;

import java.util.Scanner;

public class F03FormazottMatrix {

	public static void main(String[] args) {
		// Feladat03: 2X3-as mátrix feltöltése (sorszintű) a felhasználótól érkező egész
		// számokkal.
		// Írjuk ki a feltöltött mátrixot formázottan! A sor és oszlopindexet
		// beolvasáskor is
		// jelenítsük meg!

		System.out.println(
				"Feladat03: 2X3-as mátrix feltöltése (sorszintű) a felhasználótól érkező egész számokkal.\n");
		Scanner scanner = new Scanner(System.in);


		int[][] matrix3 = new int[2][3];

		// Feltöltés

		for (int i = 0; i < matrix3.length; i++) {
			for (int j = 0; j < matrix3[i].length; j++) {
				System.out.print((i + 1) + ". sor, " + (j + 1) + ". oszlop: ");
				matrix3[i][j] = Integer.parseInt(scanner.nextLine());

			}

		}

		for (int i = 0; i < matrix3.length; i++) {

			for (int j = 0; j < matrix3[i].length; j++) {
				System.out.print("(" + i + "/" + j + "): ");
				System.out.print(matrix3[i][j] + "\t");

			}
			System.out.println();

		}

		scanner.close();
	}
}