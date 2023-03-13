package hazi.JavaAlapok2;

import java.util.Scanner;

public class F07DolgozoTobbetkeres {

//	Kérd be két dolgozó nevét, beosztását és fizetését, majd írjuk ki a többet kereső munkavállaló 
//	minden adatát egymás mellé! Lehetséges, hogy ugyanannyit keresnek, ebben az esetben azt írd ki: 
//	„Fizetésük egyenlő.”! (dolgozo_tobbetkeres)
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print(
				"Adja meg az egyes dolgozó fizetését (Ft, pozitív egész szám): ");
		int fizetesDolgozo1 = Integer.parseInt(scanner.nextLine());
		System.out.print(
				"Adja meg a kettes dolgozó fizetését (Ft, pozitív egész szám): ");
		int fizetesDolgozo2 = Integer.parseInt(scanner.nextLine());

		if (fizetesDolgozo1 > fizetesDolgozo2) {
			System.out.println("Egyes dolgozó többet keres");
		} else if (fizetesDolgozo1 == fizetesDolgozo2) {
			System.out.println("Fizetésük egyenlő.");

		} else {
			System.out.println("Kettes dolgozó többet keres");
		}
		scanner.close();

	}
}