package tombok.feladatok;

import java.util.Random;
import java.util.Scanner;

public class F08ZoldsegesTomb {
	// Kérjük be a felhasználótól mekkora méretű tömböt szeretne létrehozni,
	// majd töltsük fel a következő lehetséges értékekkel véletlenszerűen:
	// répa, karalábé, krumpli, zeller, hagyma

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);


		System.out.println("Feladat08: Megadott méretű tömb véletlen String feltöltése\n");

		System.out.print("Adja meg a tömb méretét: ");
		int tombMeret = Integer.parseInt(scanner.nextLine());

		String[] zoldsegekTomb = new String[tombMeret];

		String[] zoldsegnevek = { "répa", "karalábé", "krumpli", "zeller", "hagyma" };

		for (int i = 0; i < zoldsegekTomb.length; i++) {
			zoldsegekTomb[i] = zoldsegnevek[random.nextInt(zoldsegnevek.length)];
		}

		for (int i = 0; i < zoldsegekTomb.length; i++) {
			if (i == zoldsegekTomb.length - 1) {
				System.out.print(zoldsegekTomb[i]);
			} else {
				System.out.print(zoldsegekTomb[i] + ", ");
			}
		}
		scanner.close();
	}
}
