package hazi.JavaAlapok2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F04KaloriaBevitel {
//
//	4. Kérd be a felhasználó napi kalória-bevitelét, majd döntsd el, hogy megfelelően táplálkozott –e
//	(megfelelő bevitel 2500 kcal-3500 kcal között van)! (kaloria_bevitel)

	public static void main(String[] args) throws Throwable, IOException {

		BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Adja meg a napi kalóriabevitelét! (kcal, pozitív egész szám): ");

		int kcalBevitel = Integer.parseInt(buffReader.readLine());

		if (kcalBevitel >= 2500 && kcalBevitel <= 3500) {
			System.out.println("A kalóriabevitel megfelelő.");

		} else {
			System.out.println((kcalBevitel < 3000) ? "Túl alacsony kalóriabevitel" : "Túl magas kalóriabevitel");
		}

		buffReader.close();

	}

}
