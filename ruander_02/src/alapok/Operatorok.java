package alapok;

public class Operatorok {

	public static void main(String[] args) {
		// operátor: müveletvégző jel
		// operandus: amin végezzük a műveletet
		// int sum = a + b; //operátor: +, =, operandus: a, b, sum

		/************* Metematikai (atitmetikai) oerátorok ***************/
		// + - * / % (Maradékképzés) - MOD

		int szam1 = 5;
		int szam2 = 10;
		System.out.println("Összegük: " + (szam1 + szam2)); // Összegük: 15

		int kulonbseg = szam2 - szam1;
		System.out.println("Különbség: " + kulonbseg); // Különbség: 5

		System.out.println("Szorzat: " + (szam1 * szam2)); // Szorzat: 50

		System.out.println(10 / 3); // 3 adatvesztés, egész osztás, castolás a megoldás

		// Maradékképzés - modulo vagy mod operátor %

		System.out.println(5 % 7); // 5
		System.out.println(4 % 2); // 0
		System.out.println(7 % 2); // 1
		System.out.println(2 % 1); // 0
		System.out.println(12 % 5); // 2
		System.out.println("");

		/**************** Értéknövelés, értékcsökkentés ****************/
		// értéknövelés: inkrementálás ++
		// értékcsökkentés: dekrementálás --
		// prefix vagy suffix
		int szam3 = 7;
		System.out.println(++szam3); // 8 először növel, majd kiír
		System.out.println(szam3++); // 8 először kiír, majd növel
		System.out.println(szam3); // 9 kiírja a végeredményt

		System.out.println("");

		int szam4 = 7;

		System.out.println(++szam4); // 8 először növel, majd kiír
		System.out.println(szam4 + 5); // 13 csak a kiírás erejéig növeli meg az értéket
		System.out.println(szam4); // 8 kiírja a végeredményt

		System.out.println("");

		/******************** Értékadó operátor = ******************/
		// balról jobbra működik ---> left value = right value
		int a = 10;
		int b = 12;
		a = b;
		System.out.println("a értéke: " + a); // a értéke: 12
		System.out.println("b értéke: " + b); // b értéke: 12

		/*************** Operátor rövidítések **************/
		a += 5; // a = a + 5;
		// *=; /=; -=
		System.out.println(a);
		System.out.println("");

		/*************** Relációs (összehasonlító) operátorok ***************/
		// < > <= >= != ==
		// pld elágazásokban feltételnél használjuk

		System.out.println(5 <= 5); // true
		System.out.println(5 <= 7); // true

		// = - értékadás
		// == összehasonlítás

		/**************** Logiaki operátorok **************/
		// Bool logika
		// Kétértékű logika : true vagy false
		// Műveletek:
		// ÉS AND &&
		// VAGY OR ||
		// NEGÁLÁS !
		// Kizáró VAGY XOR

		boolean A = true;
		boolean B = false;

		System.out.println("A és B művelet: " + (A && B)); // A és B művelet: false
		System.out.println("A vagy B művelet: " + (A || B)); // A vagy B művelet: true
		System.out.println("A esemény tagadása: " + !A); // A esemény tagadása: false
		System.out.println(A && B || A); // true
		System.out.println(A || (B && A)); // true

	}

}
