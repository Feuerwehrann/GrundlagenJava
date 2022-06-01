package c01_Schleifen;

import java.util.Scanner;

public class Würfel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		System.out.print("Höchste Zahl des Würfels:\t");
		int höchsteZahlWürfel = sc.nextInt();
		System.out.print("Gewinn Zahl eintragen:\t");
		int gewinnZahl = sc.nextInt();
		if (höchsteZahlWürfel<gewinnZahl) {
			System.out.println("Bitte gültige Zahlen eintragen!!!");
			
		}
		else {
			int i = 0;
			int anz = 0;
			
			while (i!=gewinnZahl) {
				i = (int) (Math.random()*höchsteZahlWürfel+1);
				System.out.println("gewürfelt "+i);
				anz++;

			}
			System.out.println("anzahl "+anz);
			
		}
		
		
		
		
	}


}
