package hazi.JavaAlapok;

import java.util.Scanner;

public class F05KorKerTer {

//	Írjunk programot, amely bekéri egy kör sugarát, majd kiszámolja a kör kerületét és területét!
//	(kor_ker_ter)

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Adja meg a kör sugarát (cm, pozitív tört, vagy egész szám): ");
		double korSugara = Double.parseDouble(scanner.nextLine());

		double korKerulet = 2 * korSugara * Math.PI;
		double korTerulet = Math.pow(korSugara, 2) * Math.PI;

		System.out.println("A " + korSugara + "cm sugarú kör kerülete: " + korKerulet + "cm, a területe pedig: "
				+ korTerulet + "cm².");

		scanner.close();

	}

}
