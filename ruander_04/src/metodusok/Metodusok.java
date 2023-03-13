package metodusok;

public class Metodusok {
	// Metódus fogalma: egy olyan elkülönített kódrészlet, amely segítségével
	// kiküszöbölhető a kódismétlés: egyszer létrehozom (deklaráció)
	// és többször meg tudom hívni.
	// Egy névvel tudok hivatkozni rá, lehet visszatérése és lehetnek
	// bemenő paraméterei.



	// Metódus vs függvény vs eljárás vs tagmetódus
	// https://www.w3schools.com/java/java_methods.asp

	// Prog. nyelvektől függ, hogy hogyan hivatkozunk egy kódblokkra
	// Eljárás - PASCAL: BEGIN - END
	// Függvény - van visszatérési értéke - javaban nem használjuk ezt a kifejezést.
	// Az OOP-s nyelveknél metódusnak/tagmetódusnak (osztályon belüli) hívják

	// https://mkyong.com/java8/java-8-function-examples/
	// https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html

	// Metódus fogalma: egy olyan elkülönített kódrészlet, amely segítségével
	// kiküszöbölhető a kódismétlés: egyszer létrehozom (deklaráció)
	// és többször meg tudom hívni.
	// Egy névvel tudok hivatkozni rá, lehet visszatérése és lehetnek
	// bemenő paraméterei.
	// Metódus - mindig egy viselkedést valósít meg, ezért ige pl: hibás -
	// osszeada() helyes - osszead()
	// kisbetűvel kezdjük, camelCase.
	// Tiszta kód szabályai: fejezze ki a neve azt, amit csinál!
	// Lehet bemenő paramétere, aminek meg kell adni a típusát is
	// Metódus deklaráció (egyszer szerepel a kódnak)
	// Metódus szignatúra: metódusnév + bemenő paraméterek tipussal együtt
	// a és b formális paraméterek
	// return kötelező ha visszatérési érték
	// Tiszta kód szabályai alapján 20-30 sornál ne legyen több,
	// ne legyen túl sok paramétere.
	// Metódus - viselkedésforma - ige
	/* Method callnál aktuiális paraméter, deklarációnál formális paraméter van */

	public static void main(String[] args) {

//		hatványSzamolEsKiir(2, 4);
//
//		System.out.println(teglalapKeruletSzamol(2, 3));

		// metódus hívás

//		int keer = teglalapKeruletSzamol(5, 8);
//		System.out.println("Kerület = " + keer);
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("\nAdja meg a téglalap a oldalát: ");
//		int aOldal = Integer.parseInt(scanner.nextLine());
//		System.out.print("Adja meg a téglalap  oldalát: ");
//		int bOldal = Integer.parseInt(scanner.nextLine());
//
//		System.out.println("Kerület: " + teglalapKeruletSzamol(aOldal, bOldal));
//
//		System.out.println("\n2-nek a 8. hatványa: ");
//		hatványSzamolEsKiir(2, 8);
//
//
//
//		System.out.println("000000000000000000000000");
//		System.out.println("\n" + negyzetOsszegSzamol(2, 5));
//
//		negyzetOsszegKiir(2, 5);

//		System.out.println(gyokSzamol(25));
//		afavalNoveltArKiir(100, 25);
		// scanner.close();

	}
	// public=mindenki látja
	// static=osztályszintű, nem kell példányosítani
	// void=nincs visszatérése (no return)

	public static void hatványSzamolEsKiir(double alap, double kitevo) {
		System.out.println(Math.pow(alap, kitevo));
	}

//Method declare: csak egyszer szerepel a kódban.
	public static int teglalapKeruletSzamol(int a, int b) {
		return (a + b) * 2;
	}

	public static double negyzetOsszegSzamol(double a, double b) {
		double eredmeny = Math.pow(a, 2) + Math.pow(b, 2);
		return eredmeny;
	}

	public static void negyzetOsszegKiir(double a, double b) {
		double eredmeny = negyzetOsszegSzamol(a, b);
		System.out.println(eredmeny);

	}

	public static double gyokSzamol(double szam) {
		return Math.sqrt(szam);
	}

	public static double afaErtekeSzamol(int ar, double afaKulcs) {
		return ar * afaKulcs / 100;
	}

	public static void afavalNoveltArKiir(int ar, double afaKulcs) {
		System.out.print("Az áfával növelt ár: " + (ar * (1 + (afaKulcs / 100))));
	}

	public static boolean haromszogSzerkeszthetoEldont(int a, int b, int c) {
		return (a + b > c && a + c > b && b + c > a);
	}
}
