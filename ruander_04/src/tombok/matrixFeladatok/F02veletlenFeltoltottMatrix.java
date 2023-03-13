package tombok.matrixFeladatok;

import java.util.Random;

public class F02veletlenFeltoltottMatrix {

	public static void main(String[] args) {
		// Feladat02: 5X6 (5 sor és 6 oszlop) mátrix feltöltése véletlen számokkal
		// 1-100 között. Írjuk ki a számokat formázottan!

		System.out.println(
				"Feladat02: 5X6 (5 sor és 6 oszlop) mátrix feltöltése véletlen számokkal\n");
		Random random = new Random();

		int[][] matrix2 = new int[5][6];

		// Feltöltés

		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				matrix2[i][j] = random.nextInt(92) + 1;

			}

		}

		for (int i = 0; i < matrix2.length; i++) {

			for (int j = 0; j < matrix2[i].length; j++) {
				System.out.print(matrix2[i][j] + "\t");

			}
			System.out.println();

		}



	}

}
