package hazi.JavaAlapok2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F03Vizfogyasztas3Liter {

//	3. Kérjük be a felhasználótól a napi vízfogyasztását! Döntsük el, hogy elég vizet ivott –e (ajánlott
//			bevitel min. 3 liter)! (vizfogyasztas_3liter)

	public static void main(String[] args) throws Throwable, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Mennyi vizet ivott ma? (liter, pozitív szám): ");
		double megivottViz = Double.parseDouble(reader.readLine());

		if (megivottViz < 3.0) {
			System.out.println("Igyon napota " + (3.0 - megivottViz) + "l vízzel többet, hogy "
					+ "meglegyen az ajánlott 3 liter folyadékbevitel!");
		}

		else {
			System.out.println("A napi folyadékbevitel megfelelő.");

		}
		reader.close();
	}

}
