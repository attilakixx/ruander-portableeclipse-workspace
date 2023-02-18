package alapok;

public class TipusokSzamok {

	public static void main(String[] args) {

		/****** Egész számok *******/
		int szam1; // deklaráció
		szam1 = 100; // definicio

		int szam2 = 200; // deklaráció és definició

		System.out.println("A két szám összege: " + (szam1 + szam2));

		int osszeg = szam1 + szam2;

		System.out.println("A két szám összege, másként: " + osszeg);

		/*************** Adattípusok - számoknál ****************************/
		System.out.println("Az integer max értéke: " + Integer.MAX_VALUE);
		System.out.println("Az integer min értéke: " + Integer.MIN_VALUE);
		System.out.println("Az integer max értéke: " + (Integer.MAX_VALUE + 5));

		double tortSzam = 10d / 3d;
		System.out.println(tortSzam);

		double tortSzam4 = (double) 10 / 3;
		System.out.println(tortSzam4);

		int erdemjegy1 = 5;
		int erdemjegy2 = 4;
		System.out.println("Atlag = " + ((double) (erdemjegy1 + erdemjegy2) / 2));

		byte kategoriaId = 8;
		System.out.println("Kategória id = " + kategoriaId);

		long bevetel = 846543246874654L;
		System.out.println(bevetel);

		int szamTeszt = 0;
		Integer szamTesztObject = 300000045;
		System.out.println("A szamteszt értéke: " + szamTeszt);
		System.out.println("A szamteszt értéke: " + szamTesztObject);
		System.out.println(szamTesztObject.hashCode());

		// int a = 4; // érték szerinti másolás, nem referencia
		// int b = a;

		// Integer aObject = Integer.valueOf(12);
		// Integer bObject = new Integer(12);

	}

}
