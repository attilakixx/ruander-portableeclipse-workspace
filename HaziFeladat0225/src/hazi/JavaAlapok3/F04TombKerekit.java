package hazi.JavaAlapok3;

public class F04TombKerekit {

	public static void main(String[] args) {
//		Hozzunk létre egy tömböt a következő értékekkel: 4.66, 75.9, 33.5, 2.3! A matematika szabályai
//		alapján kerekítsük ezeket a számokat és mentsük le egy, az egész számok tárolására alkalmas
//		adatszerkezetbe!

		double[] myDoubleArray = { 4.66, 75.9, 33.5, 2.3 };

		int[] myIntArrayRounded = new int[myDoubleArray.length];

		for (int i = 0; i < myIntArrayRounded.length; i++) {
			myIntArrayRounded[i] = (int) Math.round(myDoubleArray[i]);

		}
		for (int i : myIntArrayRounded) {
			System.out.print(i + ", ");

		}

	}

}
