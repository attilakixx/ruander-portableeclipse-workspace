package alapok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CiklusDoWhile {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Hátultesztelős
		// Nem tudjuk hányszor kell ismételni
		// 1x biztosan CompletableFuture<ha igaz újra bemegy a ciklusmagba.

		BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
//
//		// Feladat01 : Addig kérek be számokat amíg 0-t nem ad a user
//		System.out.println("Feladat01 - Számok 0-ig");
//		int bekertSzam;
//
//		do {
//			System.out.println("Adjon meg egy számot: ");
//			bekertSzam = Integer.parseInt(buffReader.readLine());
//
//		} while (bekertSzam != 0);
//		}System.out.println("Kiléptem, mert 0-t adtál meg.");
//	}
//
//	
		// Feladat02: Addig dobik míg 6 nem lesz, kiírjuk a dobásokat egymás mellé

//		System.out.println("Feladat02: Kockadobások első 6-osig");
//
//		Random random = new Random();
//
//		int velszam;
//		do {
//			velszam = random.nextInt(6) + 1;
//			System.out.println(velszam + " ");
//		} while (velszam != 6);
//
//
//		System.out.println();
		// Feladat03: Addig kérek be számot amíg nem osztható 5-tel és 6-tal m.n.
		System.out.println("Feladat03: 5-tel 6tal oszthatóig");
//
//		int szamBekert3;
//		do {
//			System.out.print("Kérem adjon meg egy számot, ha 5-tel és 6-tal m.n osztható kilép: ");
//			szamBekert3 = Integer.parseInt(buffReader.readLine());
//		} while (szamBekert3 % 5 != 0 || szamBekert3 % 6 != 0);
//

		// Feladat04: Addig kérek be jelszót, amíg a megadott jelszó nem pwd.
		System.out.println("Feladat04: jelszóbekérés");
		String jelszo;

		do {
			System.out.println("Adja meg a jelszót: ");
			jelszo = buffReader.readLine();

		} while (!jelszo.equals("pwd"));
		System.out.println("Jelszó helyes");
		buffReader.close();
	}

}

