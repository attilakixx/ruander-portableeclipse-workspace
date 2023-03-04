package hazi.JavaAlapok3;

import java.util.Scanner;

public class F07Jelszo {

	public static void main(String[] args) {
		// 7. Kérjünk be szöveget mindaddig, amíg a megadott szó nem a „jelszó”!
		Scanner scanner = new Scanner(System.in);

		String jelszo;
		String requestedPass = "jelszó";

		do {
			System.out.print("Adja meg a jelszót: ");
			jelszo = scanner.nextLine();

		} while (!jelszo.equals(requestedPass));

		System.out.println("A jelszó helyes");

		scanner.close();
	}

}
