package alapok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KiirasBeolvasas {

	public static void main(String[] args) throws Throwable, IOException {

		/********* adatbe *************/

//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Add meg a neved!");
//		String name = scanner.nextLine();
//
//		System.out.println("A neved: " + name);
//
//		System.out.print("Add meg az életkorod!");
//		// int eletkor = scanner.nextInt();
//
//		int eletkor = Integer.parseInt(scanner.nextLine());
//		System.out.println(name + ", the " + eletkor + " éves vagy");
//
//		System.out.println("Hány kiló almát szeretne?");
//		double almaKilo = Double.parseDouble(scanner.nextLine());
//		System.out.println(name + " " +almaKilo + " kilo almát kér.");

		/*************** BufferedReader beolvasás **************/

		System.out.println("");

		BufferedReader buffreader = new BufferedReader(new InputStreamReader(System.in));

		// szöveg beolvasása
		System.out.print("Adja meg a beosztását:");
		String beolvasottBeosztas = buffreader.readLine(); // ha hibát dob, kell egy throwExeption, vagy try catch
		System.out.println("A megadott beosztás ez volt: " + beolvasottBeosztas);

		// egész szám beolvasása
		System.out.print("Mi a termék ára?");
		int termekAra = Integer.parseInt(buffreader.readLine());
		System.out.println(termekAra + "Ft a termék ára");

		// törtszám olvasása_

		System.out.println("Mi a termék hossza?");
		double termekHossza = Double.parseDouble(buffreader.readLine());
		System.out.println("A termék hossza: " + termekHossza + "cm.");

		buffreader.close();

		/********************
		 * Mi a különbség a scanner és buffreader közt?
		 *************/
		// Scanner lassabb és régebbi szintaxisa viszon egyszerűbb, nem szálbiztos

		// Buffreader újabb, gyorsabb, kötelez a kivételkezelésre
		// szinkronizált többszálú, szálbiztos.

	}

}
