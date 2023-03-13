package hazi.JavaAlapok;

import java.util.Scanner;

//Kérjük be a felhasználó lakcímadatait, majd írjuk ki egysorban irányítószám, város, utca házszám
//sorrendben, pld: 1051 Budapest, Fő u. 1/B. (lakcim)

public class F01Lakcim {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Adja meg az irányítószámot: ");
		String iranyitoszam = scanner.nextLine() + " ";
		System.out.print("Adja meg a várost: ");
		String varos = scanner.nextLine() + ", ";
		System.out.print("Adja meg az utca nevét: ");
		String utca = scanner.nextLine() + " ";
		System.out.print("Adja meg a házszámot: ");
		String hazszam = scanner.nextLine();

		String lakcim = iranyitoszam + varos + utca + hazszam;
		System.out.println("A lakcím:\n" + lakcim);

		scanner.close();
	}

}