package hazi.JavaAlapok2;

import java.util.Scanner;

public class F11AutoFogyasztas {
//	11. Kérjük be két autó rendszámát és fogyasztását, majd írjuk ki melyik rendszámú autónak több a 
//	fogyasztása, esetleg egyenlő -e! (benzin_fogyasztas)
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Adja meg az első autó rendszámát: ");
		String rendszam1 = scanner.nextLine();

		System.out.print("Adja meg a második autó rendszámát: ");
		String rendszam2 = scanner.nextLine();

		System.out.print("Mennyi a " + rendszam1
				+ "forgalmi rendszámú gépjármű fogyasztása (l/100km)? ");
		Double fogyasztas1 = Double.parseDouble(scanner.nextLine());
		System.out.print("Mennyi a " + rendszam2
				+ "forgalmi rendszámú gépjármű fogyasztása (l/100km)? ");
		Double fogyasztas2 = Double.parseDouble(scanner.nextLine());

		if (fogyasztas1 == fogyasztas2) {
			System.out.println("A két autó fogyasztása megegyezik.");

		} else if (fogyasztas2 > fogyasztas1) {
			System.out.println(
					"A " + rendszam2 + " rendszámú autó többet fogyaszt.");

		} else {
			System.out.println(
					"A " + rendszam1 + " rendszámú autó többet fogyaszt.");

		}
		scanner.close();

	}

}
