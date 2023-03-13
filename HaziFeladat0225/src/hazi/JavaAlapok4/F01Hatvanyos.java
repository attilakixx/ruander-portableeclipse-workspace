package hazi.JavaAlapok4;

import java.util.Scanner;

//F01. Készíts metódust tombElemHatvanyKiir() néven, amelynek nincsen visszatérési értéke. Két db 
//bemeneti paramétere van, az egész számokat tartalmazó tömb és egy egész szám (hányadik 
//hatványra emeljük). Írjuk ki egymás mellé szóközzel elválasztva a tömb elemeinek megadott 
//hatványát! Teszteljük a metódusunkat a felhasználótól érkező adatokkal. 
public class F01Hatvanyos {

	public static void main(String[] args) {
		int[] myArray = { 1, 2, 3, 4, 5, 6, 7 };



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
		tombElemHatvanyKiir(myArray, 5);

	}

	public static void tombElemHatvanyKiir(int[] tomb, int hatvanykitevo) {
		for (int i : tomb) {
			System.out.print((int) Math.pow(i, hatvanykitevo) + " ");

		}
	}

}
