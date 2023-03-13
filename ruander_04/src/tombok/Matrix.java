package tombok;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Mátrix: több dimenziós tömb
		// Egy érték tárolása sor és oszlopindex segítségével történik
		// sorindex i
		// oszlopindex j
		// sor X oszlop: 4X3-as mátrix: 4 soros és 3 oszlopos
		// sorindex és oszlopindex

		// Feladat01: 3x4-es mátrix feltöltése Deklaráció, definíció egyben.

		System.out.println("Feladat01 - 3x4 Mátrix, megadott számokkal\n");
		int[][] matrix1 = { { 1, 44, 66, 88 }, { 77, 49, 93, 11 }, { 2, 52, 17, 5, } };


		System.out.println(matrix1[2][1]);// 52
		System.out.println(matrix1[1][3]);// 11

		// Mátrix elemeinek kiiírása sorszintű bejárással

		for (int i = 0; i < matrix1.length; i++) {

			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.print(matrix1[i][j] + "\t");

			}
			System.out.println();

		}
		System.out.println();
	}

}
