package hazi.JavaAlapok3;

public class F10Maganhangzo {

	public static void main(String[] args) {
//		10. Hozzunk létre egy tömböt, amely a következő értékeket tárolja: ’a’, ’h’, ’r’, ’t’, ’z’, ’e’, ’v’
//		a. Írjuk ki a tömb elemeit egymás mellé szóközzel elválasztva!
//		b. Melyik indexeken található magánhangzó?

		char[] betuk = { 'a', 'h', 'r', 't', 'z', 'e', 'v' };



		// a,
		for (char c : betuk) {
			System.out.print(c + " ");
		}

		System.out.println();


		// b,
		System.out.println("A következő indexeken található magánhangzó: ");
		for (int i = 0; i < betuk.length; i++) {
			if ((betuk[i] == 'a') || (betuk[i] == 'e') || (betuk[i] == 'i') || (betuk[i] == 'o')
					|| (betuk[i] == 'u'))
				System.out.print(i + " ");
		}


	}

}
