package a04_Eingabe;
import java.util.Scanner;

public class PreisBerechner {

	public static void main(String[] args) {
		//Eingabe
		Scanner sc = new Scanner(System.in);  
		double betrag;
		String meldung;
		
		System.out.print("Preis: \t\t");
		double preis = sc.nextDouble();
		
		System.out.print("Stückzahl:\t");
		int stueckzahl = sc.nextInt();
		
		System.out.print("Artikel: \t");
		String artikel= sc.next();
		
		//Verarbeitung
		betrag = preis * stueckzahl;
		meldung = "Bezahlen Sie " + betrag + " Euro für " + stueckzahl + " " + artikel;
		
		//Ausgabe
		System.out.print(meldung);
		sc.close();

	}

}
