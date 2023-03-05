package hazi.JavaAlapok3;

import java.util.Random;

public class F12VeletlenMeretuTomb {

	public static void main(String[] args) {
//		12. Hozzunk létre egy véletlen méretű tömböt 5 - 10 közötti zárt intervallumban, majd töltsük fel
//		véletlenszerűen a következő lehetséges gyümölcsnevekkel: körte, alma, szilva, barack.

// Véletlen méretű tömb létrehozása:
		Random random = new Random();
		String[] gyumolcsok = new String[random.nextInt(6) + 5];

// tömb a lehetséges gyünminevekkel:
		String[] lehetsegesGyumolcsnevek = { "körte", "alma", "szilva", "barack" };

// a tömb feltöltése:
		for (int i = 0; i < gyumolcsok.length; i++) {
			gyumolcsok[i] = getRandomStringFromAnArray(lehetsegesGyumolcsnevek);

		}


// ellenörző:
//		for (int i = 0; i < gyumolcsok.length; i++) {
//			System.out.println(gyumolcsok[i] + " ");
//		}

	}

// method, hogy véletlen stringet dobjon
	public static String getRandomStringFromAnArray(String[] stringArray) {

		Random randomGenerator = new Random();
		return stringArray[randomGenerator.nextInt(stringArray.length - 1)];
	}

}
