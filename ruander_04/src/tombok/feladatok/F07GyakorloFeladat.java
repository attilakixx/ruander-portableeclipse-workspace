package tombok.feladatok;

public class F07GyakorloFeladat {

	public static void main(String[] args) {
		// Feladat07: Töltsünk fel egy 4 elemű tömböt, megadott törtszámokkal:
		// 55.9, 74.1, 89.9, 1.8.
		// Hozzunk létre egy ugyanilyen méretű egész számok tárolására
		// alkalmas adatszerkezetet (tömböt),
		// majd mentsük bele a számokat lefelé kerekítve.

		double[] tortszamokTomb = { 55.9, 74.1, 89.9, 1.8 };
		int[] egeszSzamokTomb = new int[tortszamokTomb.length];

		for (int i = 0; i < egeszSzamokTomb.length; i++) {
			egeszSzamokTomb[i] = (int) Math.floor(tortszamokTomb[i]);
		}

		System.out.println("Az eredeti tömb elemei: ");
		for (double d : tortszamokTomb) {
			System.out.print(d + " ");
		}

		System.out.println("\nLefelés kerekített elemek: ");
		for (int i : egeszSzamokTomb) {
			System.out.print(i + " ");

		}


	}
}