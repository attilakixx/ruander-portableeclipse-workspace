package hazi.JavaAlapok3;

import java.util.Random;

public class F02Veletlen10EsSzorzat {

	public static void main(String[] args) {
		Random random = new Random();

		int masodikElem = 0;
		int utolsoElottiElem = 0;

		for (int i = 0; i < 10; i++) {
			int veletlenSzam = random.nextInt(25) + 6;
			if (i == 9) {
				System.out.println(veletlenSzam);
			} else {
				System.out.print(veletlenSzam + "\t");
			}
			if (i == 1) {
				masodikElem = veletlenSzam;
			} else if (i == 8) {
				utolsoElottiElem = veletlenSzam;
			}

		}
		int szorzat = masodikElem * utolsoElottiElem;
		System.out.println("A második elem és az utolsó előtti elem szorzata = " + szorzat);
	}

}
