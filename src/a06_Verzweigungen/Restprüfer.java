package a06_Verzweigungen;

import java.util.Scanner;

public class Restprüfer {
	public static void main(String[] args) {
		//EINGABE
		//TEST
		double teiler, prüfZahl;
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Bitte die zu prüfende Zahl eingeben:\t");
		prüfZahl = sc.nextDouble();
		
		System.out.print("Bitte den Teiler eingeben:\t");
		teiler = sc.nextDouble();
		
		//VERARBEITUNG + AUSGABE
		
		if (prüfZahl%teiler==0) {
			System.out.println("Zahl ist ohne Rest teilbar");
		}
		else {
			System.out.println("Zahl ist nicht ohne Rest teilbar");
		}
		
		sc.close();
		
	}

}
