package hazi.JavaAlapok2;

import java.util.Scanner;

public class F10TesttomegIndex {
//	Kérjük be a felhasználó tömegét kg-ban és magasságát cm-ben, majd számítsuk ki és írjuk a
//	képernyőre a felhasználó testtömeg-indexét a következő képlet alapján:
//	A testtömeg-index és táblázat alapján írjuk ki szövegesen a testsúly-osztályzást!
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Adja meg a magasságát (cm, pozitív egész, vagy tört szám): ");
		double magassag = Double.parseDouble(scanner.nextLine());

		System.out.println("Adja meg a testsúlyát (kg, pozitív egész, vagy tört szám): ");
		double suly = Double.parseDouble(scanner.nextLine());

		double bmi = suly / Math.pow((magassag / 100.0), 2);
		String szovegesBmi;

		if (bmi < 16) {
			szovegesBmi = "súlyos soványság";
		} else if (bmi >= 16 && bmi < 17) {
			szovegesBmi = "mérsékelt soványság";
		} else if (bmi >= 17 && bmi < 18.5) {
			szovegesBmi = "enyhe soványság";
		} else if (bmi >= 18.5 && bmi < 25) {
			szovegesBmi = "normális testsúly";
		} else if (bmi >= 25 && bmi < 30) {
			szovegesBmi = "túlsúlyos";
		} else if (bmi >= 30 && bmi < 35) {
			szovegesBmi = "I. fokú elhízás";
		} else if (bmi >= 35 && bmi < 40) {
			szovegesBmi = "II. fokú elhízás";
		} else {
			szovegesBmi = "III. fokú (súlyos) elhízás";
		}

		System.out.printf("A tettömeg-indexe: %.2f\n", bmi);
		System.out.println("A testsúlyosztályozása: " + szovegesBmi);


		scanner.close();
	}

}
