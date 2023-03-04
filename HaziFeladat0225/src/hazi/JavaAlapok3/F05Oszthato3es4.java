package hazi.JavaAlapok3;

import java.util.Scanner;

public class F05Oszthato3es4 {

	public static void main(String[] args) {
//		5. Kérjünk be a felhasználótól egész számokat mindaddig, amíg a megadott szám nem osztható 3-mal
//		és 4-gyel maradék nélkül!

		Scanner scanner = new Scanner(System.in);

		int bekertSzam;

		do {
			System.out.print("Adjon meg egy számot: ");
			bekertSzam = Integer.parseInt(scanner.nextLine());

		} while (bekertSzam % 3 != 0 || bekertSzam % 4 != 0);

		System.out.print("Az utolsó bekert szám: " + bekertSzam + " osztható 3-mal és 4-gyel is.");

		scanner.close();

	}

}
