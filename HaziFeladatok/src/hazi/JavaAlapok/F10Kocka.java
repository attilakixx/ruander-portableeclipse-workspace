package hazi.JavaAlapok;

import java.util.Scanner;

public class F10Kocka {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Adja meg a kocka élének a hosszát(cm, pozitív egész, vagy tört szám): ");
		double kockaElenekHossza = Double.parseDouble(scanner.nextLine());

		double kockaFelszin = Math.pow(kockaElenekHossza, 3);
		double kockaTerfogat = 6 * kockaElenekHossza * kockaElenekHossza;

		System.out.println("A " + kockaElenekHossza + " cm élű kocka felszíne: " + kockaFelszin
				+ "cm², a térfogata pedig " + kockaTerfogat + " cm³.");

		scanner.close();
	}

}
