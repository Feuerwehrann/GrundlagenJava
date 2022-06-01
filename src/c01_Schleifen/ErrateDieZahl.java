package c01_Schleifen;

import java.util.Scanner;

public class ErrateDieZahl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int zahl;
		int gerateneZahl;
		int anzahlversuche = 0;
		int hoechsteZahl;
		int niedrigsteZahl;
		System.out.println("Bitte die Zahlen des gewünschten Zahlenbereiches eingeben.");
		System.out.print("Niedrigste Zahl: ");
		niedrigsteZahl = sc.nextInt();
		System.out.print("Höchste Zahl: ");
		hoechsteZahl = sc.nextInt();
		System.out.println("Zahl zwischen "+niedrigsteZahl+" und "+hoechsteZahl+".");
		System.out.println("Das Spiel beginnt!");
		
		
		zahl = (int) (Math.random()*hoechsteZahl+niedrigsteZahl);
		
		do {
			gerateneZahl = sc.nextInt();
			if (gerateneZahl>zahl) {
				System.out.println("Zahl ist zu gross");
				}
			if (gerateneZahl<zahl) {
				System.out.println("Zahl ist zu klein");
				
			}
			
			anzahlversuche=anzahlversuche+1;
			
			
		} while (gerateneZahl!=zahl);
		System.out.println("Sie haben gewonnen!");
		System.out.println("Die gesuchte Zahl war "+zahl+".");
		System.out.println("Sie haben "+anzahlversuche+" Versuche benötigt.");

	}

}
