package a06_Verzweigungen;

import java.util.Scanner;

public class Restpr�fer {
	public static void main(String[] args) {
		//EINGABE
		double teiler, pr�fZahl, ergebniss;
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Bitte die zu pr�fende Zahl eingeben:\t");
		pr�fZahl = sc.nextDouble();
		
		System.out.print("Bitte den Teiler eingeben:\t");
		teiler = sc.nextDouble();
		
		//VERARBEITUNG + AUSGABE
		
		if (pr�fZahl%teiler==0) {
			System.out.println("Zahl ist ohne Rest teilbar");
		}
		else {
			System.out.println("Zahl ist nicht ohne Rest teilbar");
		}
		
		sc.close();
		
	}

}
