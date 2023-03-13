package hazi.JavaAlapok;

import java.util.Scanner;

public class F12EgyenesKorkup {
//	12. Olvasd be egy egyenes körkúp sugarát és magasságát, majd számold ki belőle a térfogatát és a
//	felszínét! (egyenes_korkup)
	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		System.out.print("Adja meg az egyenes körkúp sugarát(pozitív egész, vagy tört szám, cm): ");
		double korkupSugara = Double.parseDouble(scanner.nextLine());


		System.out.print(
				"Adja meg az egyenes körkúp magasságát(pozitív egész, vagy tört szám, cm): ");
		double korkupMagassaga = Double.parseDouble(scanner.nextLine());

		double korkupTerfogat = (1.0 / 3.0) * Math.PI * Math.pow(korkupSugara, 2.0)
				* korkupMagassaga;
		double teruletAlap = Math.PI * Math.pow(korkupSugara, 2.0);
		double palastSugara = Math
				.sqrt((Math.pow(korkupSugara, 2.0) + Math.pow(korkupMagassaga, 2.0)));
		double teruletPalast = Math.PI * korkupSugara * palastSugara;
		double korkupFelszin = teruletAlap + teruletPalast;

		System.out.printf("Az " + korkupSugara + "cm sugarú, " + korkupMagassaga
				+ "cm magasságú egyenes körkúp térfogata:  %.2f cm³.", korkupTerfogat);
		System.out.printf("A felszíne: %.2f cm².", korkupFelszin);

		scanner.close();
	}

}
