package hazi.JavaAlapok3;

import java.util.Random;

public class F03Veletlen7ig {

	public static void main(String[] args) {

		Random random = new Random();

		int generatedRandomNumber;

		do {
			generatedRandomNumber = random.nextInt(10) + 1;
		} while (generatedRandomNumber != 7);

		System.out.println("A legutolsó generált szám: " + generatedRandomNumber);
	}

}


