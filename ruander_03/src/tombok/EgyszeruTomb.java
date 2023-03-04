package tombok;

import java.util.Random;

public class EgyszeruTomb {

	public static void main(String[] args) {


//		Tömb: összetett adattípus
//		Több azonos típusú elem tárolására alkalmaegy, egy névvel lehet rá hivatkozni
//		javaban csak azonos típus lehet (pl.: int vagy String)
//		Az egyes értékeket a tömb nevével és indexével érjük el.
//		Az indexelés 0-tól kezdődik, az első elem indexe 0.
//		Fontos kötöttségek: létrehozáskor meg kell adni milyen típusú elemeket akarunk benne tárolni+meg kell ani a méretét
//		Egydimenziós tömb - Vektor (Vector)
//
		int[] tombElso = { 3, 6, 77, 22, 98, 11 };
//		System.out.println("2-es indexen lévő elem: " + tombElso[2]); // 77
//		System.out.println("2.elem a tömbben (1-es index): " + tombElso[1]);// 6
//		// Ennél a szintaxisnál nem adjuk meg a tömb hosszát, de az elemeit igen.
//
//		// tömb első elemének felülírása
//		tombElso[0] = 1;
//		System.out.println("Tömb első eleme: " + tombElso[0]); // 1
//
//		// System.out.println(tombElso[6]);
//		System.out.println("A tömb mérete: " + tombElso.length); // 6
//
//		System.out.println("A tomb utolsó eleme: " + tombElso[tombElso.length - 1]); // 11

		// Feladat01: Hozzunk létre egy 20 egész szám tárolására alkalmas tömböt,
		// majd írjuk ki az üres? elemeit!

//
//		System.out.println("Feladat01 - Üres tömb elemei");
//
//		int[] tombUres = new int[20];
//		for (int i : tombUres) {
//			System.out.print(i + " ");
//		}
//for ciklusos kiírás
//		for (int i = 0; i < tombElso.length; i++) {
//			System.out.print(tombElso[i] + " ");
//
//		}

		// Feladat03 - Szövegtárolás tömbben
//		System.out.println("Feladat03 - szöveg tömbben");
//		String[] nevekTömb = { "Elek", "János", "Tamás" };
//		System.out.println("2-es indexen lévő 3. elem: " + nevekTömb[2]);

		// Feladat04 - Karakterek tárolása tömbben és kiírása vesszővel egymás mellé,
		// de az utolsó elem után ne legyen vessző!

//		char[] karakterek = { 'g', 'r', 'z', 'w' };
//		for (char c : karakterek) {
//			System.out.println(c + " ");
//		}
		// Feladat05 - 20 elemű tömb feltöltése véletlen számokkal 1-100 közötti
		// tartományban
		// Írjuk ki a tömb elemeit egymás mellé szóközzel elválasztva!

		Random random = new Random();
		int[] veletlen05 = new int[20];
		for (int i = 0; i < veletlen05.length; i++) {
			veletlen05[i] = random.nextInt(100) + 1;

		}
		for (int i : veletlen05) {
			System.out.print(i + " ");
		}

	}
}

