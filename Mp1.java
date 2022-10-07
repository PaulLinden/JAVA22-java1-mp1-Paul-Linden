package mp1;

import java.util.Random;
import java.util.Scanner;

public class Mp1 {

	public static void main(String[] args) {

		while (true) {

			int svar;

			int gissa = 1;

			int forsok = 1;

			final int MAX = 100;

			Scanner in = new Scanner(System.in);

			Random rand = new Random();

			svar = rand.nextInt(MAX);

			System.out.println("Gissa ett nummer mellan 0 and 100: ");

			while (!kolla(svar, gissa)) {

				gissa = in.nextInt();

				if (gissa > svar) {
					System.out.println("För högt, prova igen");
					forsok++;
				}

				else if (gissa < svar) {
					System.out.println("För lågt, prova igen");
					forsok++;
				} else {
					System.out.println("!!Grattis!! du gissade rätt.");
					System.out.println("Du klara det på försök nr: " + forsok);

					System.out.println("____________________________________");
					System.out.println("Nytt tal genererat. Prova igen!");
					System.out.println("____________________________________");
				}

			}

		}
	}

	static boolean kolla(int svar, int gissa) {
		return svar == gissa;
	}

}
