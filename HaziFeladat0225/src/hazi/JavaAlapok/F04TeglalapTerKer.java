package hazi.JavaAlapok;

import java.util.Scanner;

public class F04TeglalapTerKer {

//	Kérd be a téglalap két oldalát és írd ki a kerületét, területét! (teglap_ter_ker)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Adja meg a teglalap 'a' oldalának hosszát (cm, pozitív egész, vagy tört szám): ");
		double aOldal = Double.parseDouble(scanner.nextLine());

		System.out.print("Adja meg a teglalap 'b' oldalának hosszát (cm, pozitív egész, vagy tört szám): ");
		double bOldal = Double.parseDouble(scanner.nextLine());

		double keruletTeglalap = 2 * (aOldal + bOldal);
		double teruletTeglalap = aOldal * bOldal;

		System.out.println(
				"A téglalap kerülete: " + keruletTeglalap + "cm, " + "a területe pedig: " + teruletTeglalap + "cm²");

		scanner.close();

	}

}
