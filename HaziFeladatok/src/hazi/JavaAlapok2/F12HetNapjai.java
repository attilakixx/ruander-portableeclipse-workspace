package hazi.JavaAlapok2;

import java.util.Scanner;

public class F12HetNapjai {
//	12. Switch-case szerkezettel készítsük el a következő programot! Kérjük be egy nap sorszámát (1..7) 
//	numerikus formában, és írjuk ki a nap megnevezését a képernyőre (hétfő, kedd, ..., vasárnap). 
//	Amennyiben a beírt sorszám nem 1..7 közötti szám, úgy a „Hibás adat!” kiírás jelenjen meg. 
//	(hetnapjai)
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		System.out.print("Hanyadik nap nevét írjam ki? ");
		int napSzammal = Integer.parseInt(scanner.nextLine());
		String napSzovegesen;

		switch (napSzammal) {
		case 1:
			napSzovegesen = "Hétfő";
			break;
		case 2:
			napSzovegesen = "Kedd";
			break;
		case 3:
			napSzovegesen = "Szerda";
			break;
		case 4:
			napSzovegesen = "Csütörtök";
			break;
		case 5:
			napSzovegesen = "Péntek";
			break;
		case 6:
			napSzovegesen = "Szombat";
			break;
		case 7:
			napSzovegesen = "Vasárnap";
			break;

		default:
			napSzovegesen = "Hibás adat!";
			break;
		}
		System.out.println(napSzovegesen);

		scanner.close();
	}

}
