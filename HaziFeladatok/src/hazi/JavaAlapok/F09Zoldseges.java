package hazi.JavaAlapok;

import java.util.Scanner;

public class F09Zoldseges {
//	Háromféle terméket vásárolunk: almát (240 Ft / kg), szilvát (310 Ft/kg) és szőlőt (650 Ft/kg). A
//	program kérje be a vásárolt mennyiségeket, majd írja ki az árakat tételenként és a végösszeget is!
//	Tájékoztasd a felhasználót az egységárakról is! (zoldseges)

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double almaAr = 340.0;
		double szilvaAr = 310.0;
		double szoloAr = 650.0;

		System.out.print("Adja meg hány kiló almát szeretne vásárolni (pozitív tört vagy egész szám): ");
		double almaVasarol = Double.parseDouble(scanner.nextLine());
		System.out.print("Adja meg hány kiló szilvát szeretne vásárolni (pozitív tört vagy egész szám): ");
		double szilvaVasarol = Double.parseDouble(scanner.nextLine());
		System.out.print("Adja meg hány kiló szőlőt szeretne vásárolni (pozitív tört vagy egész szám): ");
		double szoloVasarol = Double.parseDouble(scanner.nextLine());

		double almaFelszorozva = kalkulaltAr(almaAr, almaVasarol);
		double szilvaFelszorozva = kalkulaltAr(szilvaAr, szilvaVasarol);
		double szoloFelszorozva = kalkulaltAr(szoloAr, szoloVasarol);

		double vegOsszeg = almaFelszorozva + szilvaFelszorozva + szoloFelszorozva;

		scanner.close();

		System.out.printf("A fizetendő végösszeg: %.2fFt.\n ", vegOsszeg);
		System.out.println("A termékek ára tételesen:\nAlma: " + almaFelszorozva + "Ft (Ára kilónként: " + almaAr
				+ "Ft)" + "\nSzilva: " + szilvaFelszorozva + "Ft (Ára kilónként: " + szilvaAr + "Ft)" + "\nSzőlő: "
				+ szoloFelszorozva + "Ft (Ára kilónként: " + szoloAr + "Ft)");
	}

	public static double kalkulaltAr(double termekAr, double termekMennyiseg) {
		double totalAr = termekAr * termekMennyiseg;
		return totalAr;

	}

}
