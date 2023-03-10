package hazi.JavaAlapok;

import java.util.Random;
//11. Készítsünk alkalmazást, amely kiír egy véletlen számot 50 -100 közötti zárt intervallumban!
//(vel_50_100)

public class F11Vel50100 {

	public static void main(String[] args) {
		Random random = new Random();

		int szam = random.nextInt(51) + 50;
		System.out.println(szam);

	}
}


