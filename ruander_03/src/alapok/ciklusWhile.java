package alapok;

public class ciklusWhile {

	public static void main(String[] args) {


		// Mikor használunk while ciklust?
		// Amikor nem tudjuk előre, hányszor kell ismételni
		// Előszötr megnézni a ciklusfeltételt, ha igaz, végrehajtja, de lehet egyszer
		// sem fut le.
		// ciklusváltozó léptetése manuális

		// Feladat01 Addig vegyünk számokat 0-tól egyesével, amíg 7-tel osztható számok
		// összege át nem lépi a százat!
		int szamlalo = 0;
		int osszeg = 0;
		while (osszeg < 100) {
			if (szamlalo % 7 == 0) {
				osszeg += szamlalo;
				System.out.println(szamlalo);
			}
			szamlalo++;
		}

		System.out.println("A számláló értéke: " + szamlalo);
		System.out.println("Az összeg értéke: " + osszeg);

	}
}
