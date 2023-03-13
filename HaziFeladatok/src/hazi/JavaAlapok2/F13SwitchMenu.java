package hazi.JavaAlapok2;

import java.util.Scanner;

public class F13SwitchMenu {
//	13. Készíts min. 5 menüpontból álló menüt switch-case szerkezettel! (pld. az 1-est lenyomva írja ki: 
//		"Az első menüpontot választotta!”, a 2-est lenyomva írja ki: "A második menüpontot választotta!" 
//		stb.) (switch_menu)
	public static void main(String[] args) {
		System.out.println("Menü:");
		System.out.println("1. Pénzügy");
		System.out.println("2. Műszaki ügyfélszolgálat");
		System.out.println("3. Szerelésszervezés");
		System.out.println("4. Értékesítés");
		System.out.println("5. English menu");

		System.out.print("Adja meg, melyik menüpontot választja: ");

		Scanner scanner = new Scanner(System.in);
		int valasztottMenuPont = Integer.parseInt(scanner.nextLine());

		System.out.println();

		switch (valasztottMenuPont) {
		case 1:
			System.out.println("Kapcsoljuk a pénzügyi osztályt");
			break;
		case 2:
			System.out.println("Kapcsoljuk a műszaki ügyfélszolgálatot");
			break;
		case 3:
			System.out.println("Kapcsoljuk a szerelésszervezést");
			break;
		case 4:
			System.out.println("Kapcsoljuk az ártékesítést");
			break;
		case 5:
			System.out.println("You chose the english menu");
			break;

		default:
			System.out.println(
					"Hibásan megadott menükód, kapcsoljik az ügyfélszolgálatot.");
			break;

		}
		scanner.close();



	}

}
