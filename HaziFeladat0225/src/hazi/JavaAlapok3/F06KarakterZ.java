package hazi.JavaAlapok3;

import java.util.Scanner;
//6. Kérjünk be karaktereket mindaddig, amíg a megadott karakter nem ’z’ betű!

public class F06KarakterZ {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		char bekertKarakter;

		do {
			System.out.print("Adjon meg egy karaktert: ");
			bekertKarakter = scanner.nextLine().charAt(0);
		} while (bekertKarakter != 'z');

		System.out.println("Az utolsó megadott karakter '" + bekertKarakter + "' volt.");

		scanner.close();
	}

}
