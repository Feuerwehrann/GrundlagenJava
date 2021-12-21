package a06_Verzweigungen;

import java.util.Scanner;

public class NotenrechnerMitFehlermeldung {

	public static void main(String[] args) {
		//EINGABE
		Scanner sc = new Scanner (System.in);
		double erreichtePunkte, maximalePunkte, note;
		System.out.print("Maximale punkte:\t");
		maximalePunkte = sc.nextDouble();
		System.out.print("Erreichte Punkte:\t");
		erreichtePunkte = sc.nextDouble();
		note = 6-5*erreichtePunkte/maximalePunkte;
		if (maximalePunkte>erreichtePunkte) {
			System.out.println("Note:\t\t\t"+note);
			
		} else {
			System.out.println("kann nicht berechnet werden!");

		}


		
		sc.close();

	}

}
