package c01_Schleifen;

import java.util.Scanner;

public class W�rfel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		System.out.print("H�chste Zahl des W�rfels:\t");
		int h�chsteZahlW�rfel = sc.nextInt();
		System.out.print("Gewinn Zahl eintragen:\t");
		int gewinnZahl = sc.nextInt();
		if (h�chsteZahlW�rfel<gewinnZahl) {
			System.out.println("Bitte g�ltige Zahlen eintragen!!!");
			
		}
		else {
			int i = 0;
			int anz = 0;
			
			while (i!=gewinnZahl) {
				i = (int) (Math.random()*h�chsteZahlW�rfel+1);
				System.out.println("gew�rfelt "+i);
				anz++;

			}
			System.out.println("anzahl "+anz);
			
		}
		
		
		
		
	}


}
