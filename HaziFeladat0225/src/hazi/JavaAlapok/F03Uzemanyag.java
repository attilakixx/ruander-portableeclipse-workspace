package hazi.JavaAlapok;

import java.util.Scanner;

public class F03Uzemanyag {

//	Programunk kérje be egy autó fogyasztását (literben 100 km-en), a benzin literenkénti árát és a
//	megteendő út hosszát, majd számítsa ki az útiköltséget! (pld. Autó fogyasztása: 5 liter / 100km, út
//	hossza: 850 km, benzinár: 370 Ft / liter, útiköltség: 15.725 Ft) (uzemanyag)

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print(
				"Adja meg, hány liter üzemanyagot fogyaszt az autó 100 kilométeren (tört, vagy egész pozitív szám): ");
		double fogyasztas = Double.parseDouble(scanner.nextLine());
		System.out.print("Adja meg az üzemanyag literenkénti árát (tört, vagy egész pozitív szám): ");
		double uzemanyagAr = Double.parseDouble(scanner.nextLine());
		System.out.print("Adja meg az út hosszát kiloméerben (pozitív egész, vagy tört szám): ");
		double utHossza = Double.parseDouble(scanner.nextLine());

		double utikoltseg = (utHossza / 100.0) * fogyasztas * uzemanyagAr;

		System.out.printf("Az útiköltség %.2f Ft.", utikoltseg);

		scanner.close();
	}

}
