package tombok.matrixFeladatok;

import java.util.Random;

public class F05_60_80Veletlen {
	// Feladat05: 6X4-es mátrix feltöltése (sorszintű) véletlen számokkal 60-80
	// között.

	public static void main(String[] args) {

		System.out.println(
				"Feladat05: 6X4-es mátrix feltöltése (sorszintű) véletlen számokkal 60-80 között.\n");
		Random random = new Random();

		int[][] matrix5 = new int[6][4];

		// Feltöltés

		for (int i = 0; i < matrix5.length; i++) {
			for (int j = 0; j < matrix5[i].length; j++) {
				matrix5[i][j] = random.nextInt(21) + 60;

			}

		}

		for (int i = 0; i < matrix5.length; i++) {

			for (int j = 0; j < matrix5[i].length; j++) {
				System.out.print(matrix5[i][j] + "\t");

			}
			System.out.println();

		}

		// Cseréljük meg az első két sort és írjuk ki újra.
		int[] temp = new int[matrix5[0].length];
		for (int i = 0; i < matrix5[0].length; i++) {
			temp[i] = matrix5[0][i];
			matrix5[0][i] = matrix5[1][i];
			matrix5[1][i] = temp[i];
		}

		System.out.println("\n Átrendezve: ");
		for (int i = 0; i < matrix5.length; i++) {

			for (int j = 0; j < matrix5[i].length; j++) {
				System.out.print(matrix5[i][j] + "\t");

			}
			System.out.println();

		}



	}



}

