package a04_Eingabe;
import java.util.Scanner;

import a03_Variablen.PhysikKonstanten;

public class BrueckenhoehEingabe implements PhysikKonstanten {

	public static void main(String[] args) {
		//Eingabe
		Scanner sc = new Scanner(System.in);  
		double zeit;
		double brueckenhoehe;
		
		System.out.print("Zeit:\t");
		zeit = sc.nextDouble();
		
		//Verarbeitung
		brueckenhoehe = 0.5 * ERDFALLBESCHLEUNIGUNG * zeit * zeit;
		
		//Ausgabe
		System.out.print("Die Brücke hat eine Höhe von " + brueckenhoehe + "m.");
		sc.close();
		
	}

}
