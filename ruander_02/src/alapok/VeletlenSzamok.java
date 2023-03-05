package alapok;

import java.util.Random;

public class VeletlenSzamok {

	public static void main(String[] args) {
		// véletlen számok generálása
		// álvéletlen szám, pszeudó random
		// CPU órajele alapján állítja elő

		// Egy objektum létrehozása "random" néven, ennek segítségével tudunk véletlen
		// számot generálni
		// Konstruktor hívás - az osztályvból létrehozza az objektumpéldányt és
		// beállítja azt.
		// new operátor = memórafoglalás megtörténik
		Random random = new Random();

		int velSzam = random.nextInt(100) + 1; // veletlenszam 1-100 között
		System.out.println("Véletlen szám 1-100 között: " + velSzam);

		int velSzam2 = random.nextInt(2) + 1;
		System.out.println("Véletlen szám 1-2 között: " + velSzam2);

		int felsoHatar = 10;
		int alsohatar = 5;
		int velSzam3 = random.nextInt(felsoHatar - alsohatar + 1) + alsohatar;
		System.out.println("Véletlen szám 5-10 között: " + velSzam3);

		// általános képlet mi és max - iclusive (mindkét érték benne van a generált
		// számok között):
		// random.nextInt((max-min)+1)+min

	}

}
