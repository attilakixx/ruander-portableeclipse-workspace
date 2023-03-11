package hazi.JavaAlapok2;

import java.util.Scanner;

public class F13SwitchHatvany {
//	14. Switch-case szerkezettel készítsünk hatványozó alkalmazást! Kérjünk be 2 pozitív egész számot: 
//		az első szám, amit hatványozni szeretnénk, a második megadott szám pedig a menüpont, amit 
//		leütve írja ki a 2. 3. vagy a 4. hatványát az első számnak! Ha más értéket adok meg, írja ki, hogy 
//		hibás adat! (switch_hatvany)
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print(
				"Adja meg azt a pozitív egész számot, amit hatványozni szeretne: ");

		int hatvanyalap = Integer.parseInt(scanner.nextLine());

		System.out.println("Melyik hatványra szeretné emelni?");
		System.out.println("1 - Négyzetre emelés");
		System.out.println("2 - Harmadik hatványra emelés");
		System.out.println("3 - Negyedik hatványra emelés");
		System.out.print("Vélasszon a menüpontok közül: ");

		int hatvanykitevo = Integer.parseInt(scanner.nextLine());
		System.out.println();

		String valaszUzenet;

		switch (hatvanykitevo) {
		case 1:
			valaszUzenet = "Az eredmény: " + (int) Math.pow(hatvanyalap, 2);
			System.out.println(valaszUzenet);
			break;
		case 2:
			valaszUzenet = "Az eredmény: " + (int) Math.pow(hatvanyalap, 3);
			System.out.println(valaszUzenet);

			break;
		case 3:
			valaszUzenet = "Az eredmény: " + (int) Math.pow(hatvanyalap, 4);
			System.out.println(valaszUzenet);
			break;

		default:
			System.out.println("Hibás adat!");
			break;
		}
		scanner.close();

	}

}
