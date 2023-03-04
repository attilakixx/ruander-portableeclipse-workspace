package hazi.JavaAlapok3;

import java.util.Random;

public class F01Veletlen5 {

	public static void main(String[] args) {
//		Hozzunk létre 5 darab véletlen számot 1-8 közötti intervallumban, majd írjuk ki az elemeket
//		egymás mellé vesszővel elválasztva (az utolsó elem után ne legyen vessző)!


		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			int randomNumber = random.nextInt(8) + 1;
			if (i == 4)
				System.out.println(randomNumber);
			else {
				System.out.print(randomNumber + ", ");
			}
		}


	}

}
