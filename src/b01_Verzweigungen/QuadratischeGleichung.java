package b01_Verzweigungen;

import java.util.Scanner;

public class QuadratischeGleichung {

	public static void main(String[] args) {
		
		//Einlesen von a, b, c, d
		Scanner sc = new Scanner(System.in);  
		System.out.println("Bitte geben Sie eine quadratische Gleichung in folgendem Format ein: \nax² + bx + c\n");
		
		System.out.print("a:\t");
		double a = sc.nextDouble();
		System.out.print("b:\t");
		double b = sc.nextDouble();
		System.out.print("c:\t");
		double c = sc.nextDouble();
		System.out.print("d:\t");
		double d = sc.nextDouble();
		
		//Ausgabe der Gleichung
		System.out.println("\nQuadratische Gleichung:\t\t" + a + "x² + " + b +"x + " + c + " = " + d);
		
		//Umformung und Ausgabe der Nullform
		c = c-d;
		d = 0;
		System.out.println("Gleichung in Nullform:\t\t"+ a + "x² + " + b +"x + " + c + " = " + d);
		
		//Umformung und Ausgabe der Normalform
		if (a==0) {
			System.out.println("a darf nicht =0 sein");
			}
		else {
		b = b/a;
		c = c/a;
		System.out.println("Gleichung in Normalform:\tx² + " + b +"x + " + c + " = " + d + "\n");
		
		//Berechnung diskrminante
		double di = ((b/2) * (b/2)) -c;
		
		//Verzweigung um zu prüfen, wie viele Lösungen es gibt und Berechnung der Lösung
		if (di>0) {
			System.out.println("Die Diskriminante ist >0, demnach gibt es zwei Lösungen");
			double x1 = -(b/2) + Math.sqrt(di);
			double x2 = -(b/2) - Math.sqrt(di);
			System.out.println("x1 = " + x1 + "\t\tx2 = " + x2);
			
		}
		else if (di<0) {
			System.out.println("Die Diskriminante ist <0, demnach gibt es keine Lösungen");
			
		}
		else {
			System.out.println("Die Diskriminante ist =0, demnach gibt es eine Lösungen");
			double x1 = -(b/2);
			
			if (x1 == 0 || x1 == -0) {
				System.out.println("x1 = 0");
				
			}
			else {
			System.out.println("x1 = " + x1);
			}
			
		}
		sc.close();
		}
	}
}


	

