package hazi.JavaAlapok4;

import java.util.Scanner;

//F01. Készíts metódust tombElemHatvanyKiir() néven, amelynek nincsen visszatérési értéke. Két db 
//bemeneti paramétere van, az egész számokat tartalmazó tömb és egy egész szám (hányadik 
//hatványra emeljük). Írjuk ki egymás mellé szóközzel elválasztva a tömb elemeinek megadott 
//hatványát! Teszteljük a metódusunkat a felhasználótól érkező adatokkal. 
public class F01Hatvanyos {

	public static void main(String[] args) {
		int[] tesztArray = arraytBeker();

		System.out.println("\nHatványozásteszt: \n\n");
		tombElemHatvanyKiir(tesztArray, 2);



	}

	public static int[] arraytBeker() {
		Scanner scanner = new Scanner(System.in);


		System.out.print("Adja meg, hány elemű tömböt szeretne létrehozni: ");
		int tombHossza = Integer.parseInt(scanner.nextLine());

		int[] array = new int[tombHossza];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Adja meg a tömb " + (i + 1) + "/" + array.length + " elemét: ");
			array[i] = Integer.parseInt(scanner.nextLine());

		}


		scanner.close();
		return array;
	}



	public static void tombElemHatvanyKiir(int[] tomb, int hatvanykitevo) {
		for (int i : tomb) {
			System.out.print((int) Math.pow(i, hatvanykitevo) + " ");

		}
	}

}
