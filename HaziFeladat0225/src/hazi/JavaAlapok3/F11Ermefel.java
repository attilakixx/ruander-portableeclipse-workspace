package hazi.JavaAlapok3;

import java.util.Random;

public class F11Ermefel {

	public static void main(String[] args) {
//		11. Hozzunk létre 10 érmefeldobást szimuláló alkalmazást! Melyik érmefeldobások alkalmával volt fej 
//		az eredmény? Egy lehetséges eredmény: fej, fej, írás, fej, írás, írás, fej, fej, írás, írás	

		String[] fejIrasArray = new String[10];

		Random random = new Random();
		for (int i = 0; i < fejIrasArray.length; i++) {
			boolean binarisFejIras = random.nextBoolean();
			fejIrasArray[i] = binarisFejIras ? "fej" : "írás";
		}

		for (String string : fejIrasArray) {
			System.out.print(string + ", ");
		}

		System.out.println("\n");

		System.out.println("A következő indexeken volt fej: ");
		for (int i = 0; i < fejIrasArray.length; i++) {
			if (fejIrasArray[i].equals("fej")) {
				System.out.print(i + " ");

			}
		}

	}

}
