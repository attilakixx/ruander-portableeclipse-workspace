package hazi.JavaAlapok;

import java.util.Scanner;

public class F07EuroFt {
	// Programunk kérje be az Euró árfolyamát (1 € hány Ft-ot ér), majd azt, hogy
	// hány eurót akarunk
	// átváltani Ft-ba, majd írja ki, hogy hány Ft az átváltott euró. (euro_ft)

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Adja meg az Euró árfolyamát (1€/HUF, pozitív egész vagy tört szám): ");
		double arfolyam = Double.parseDouble(scanner.nextLine());
		System.out.print("Adja meg, hány Forintit szeretne átváltani (pozitív egész, vagy tört szám): ");
		double valtandoForint = Double.parseDouble(scanner.nextLine());

		double forintInEur = valtandoForint / arfolyam;

		System.out.printf(valtandoForint + "Ft = %.2f€", forintInEur);

	}

}
