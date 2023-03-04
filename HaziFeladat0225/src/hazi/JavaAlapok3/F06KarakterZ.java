package hazi.JavaAlapok3;

import java.util.Scanner;

public class F06KarakterZ {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		char bekertKarakter;

		do {
			System.out.print("Adjon meg egy karaktert: ");
			bekertKarakter = scanner.next().charAt(0);
		} while (bekertKarakter != 'z');

		System.out.println("Az utolsó megadott karakter '" + bekertKarakter + "' volt.");

		scanner.close();
	}

}
