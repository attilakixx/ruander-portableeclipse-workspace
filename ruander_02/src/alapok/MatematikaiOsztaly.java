package alapok;

public class MatematikaiOsztaly {

	public static void main(String[] args) {
		// Math class - beépített osztály
		// Matematikai műveletekhez, számításokhoz
		// Statikus osztály - nem kell példányosítani a használathoz

		// Pi értéke
		System.out.println(Math.PI);

		// Hatványozás - Math.pow - avisszatérése mindig double.
		System.out.println(Math.pow(2, 3));

		// Gyökvonás

		System.out.println(Math.sqrt(25.0));

		// Kerekítések
		System.out.println(Math.round(25.5)); // matek szabályai szerint kerekít
		System.out.println(Math.floor(26.9)); // lefelé kerekít, double a visszatérése
		System.out.println(Math.ceil(33.1)); // felfelé kerekít, double a visszatérése
		System.out.println(Math.abs(-22.5)); // abszolút érték tört és int számmal is megy

	}

}
