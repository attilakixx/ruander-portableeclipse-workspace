package hazi.JavaAlapok4;

import java.util.Random;

//3. Hozz létre metódust, amely legenerál 2 db véletlen számot 1-10 között, majd eldönti, hogy
//szorzatuk páros vagy páratlan! Az ellenőrzéshez a generált két számot is írjuk ki! 
public class F03VelSzamParosParatlan {

	public static void main(String[] args) {
		szamotGeneralOsszeszorozEldontParosE();



	}

	public static int veletlenszamGeneral(int minIncl, int maxIncl) {
		Random random = new Random();
		return (random.nextInt((maxIncl - minIncl + 1)) + minIncl);
	}

	public static int ketSzamotGeneralSzorzatSzámol() {
		int szam1 = veletlenszamGeneral(1, 10);
		int szam2 = veletlenszamGeneral(1, 10);
		System.out
				.println("Az első generált szám a " + szam1 + ", a második szám a " + szam2 + ".");
		return szam1 * szam2;
	}

	public static boolean eldontParosE(int szam) {
		return (szam != 0 & szam % 2 == 0);
	}

	public static void szamotGeneralOsszeszorozEldontParosE() {
		int szorzat = ketSzamotGeneralSzorzatSzámol();
		String messageIfTrue = "A két szám szorzata (" + szorzat + ") páros.";
		String messageIfFalse = "A két szám szorzata (" + szorzat + ") páratlan.";
		System.out.println(eldontParosE(szorzat) ? messageIfTrue : messageIfFalse);

	}
}