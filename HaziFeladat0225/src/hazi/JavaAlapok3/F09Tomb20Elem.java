package hazi.JavaAlapok3;

import java.util.Random;

public class F09Tomb20Elem {
//Töltsünk fel egy 20 elemű tömböt véletlen számokkal [-60;+60] intervallumból, majd írjuk ki az 
//	elemeket egymás mellé szóközzel elválasztva! Alatta írjuk ki egy sorban egymás mellé tabulátorral 
//	elválasztva a negatív számok közül azokat, amelyek kisebbek -20-nál!

	public static void main(String[] args) {



		int[] tombVeletlen = new int[20];

		Random random = new Random();

		for (int i = 0; i < tombVeletlen.length; i++) {
			tombVeletlen[i] = random.nextInt(121) - 60;

		}
		// Kiírjuk az összes elemet szóközzel elválasztva
		for (int i = 0; i < tombVeletlen.length; i++) {
			System.out.print(tombVeletlen[i] + " ");
		}


		System.out.println();

		// negatív elemek -20 alatt tabbal elválasztva
		for (int i = 0; i < tombVeletlen.length; i++) {
			if (tombVeletlen[i] < -20)
				System.out.print(tombVeletlen[i] + "	");
		}

	}
}
