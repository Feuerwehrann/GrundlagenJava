package d01_Methoden;

import java.util.Scanner;

public class Runden {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Bitte Zahl eingeben, die gerundet werden soll: ");
		double zahl = sc.nextDouble();
		System.out.print("\nBitte Stellen eingeben, auf die gerundet werden soll: ");
		int stelle = sc.nextInt();
		sc.close();
		double gerundeteZahl = runden(zahl, stelle);
		System.out.print("\nGerundete Zahl:\t");
		System.out.println(gerundeteZahl);
	}

	public static double runden(double z, int stellen) {
		double zGerundet = 0;
		zGerundet = z * hoch(stellen, 10);
		zGerundet = zGerundet + 0.5;
		zGerundet = (int)zGerundet;
		zGerundet = zGerundet / hoch(stellen, 10);

		return zGerundet;

	}

	public static int hoch(int exponent, int nenner) {
		int zhoch=1;
		while (exponent >= 1) {
			zhoch = zhoch * nenner;
			exponent--;
		}
		return zhoch;

	}
	
}
