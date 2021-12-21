package a03_Variablen;

public class Variablen {

	public static void main(String[] args) {
		// ******** EINGABE
		// Kommazahlen deklaration
		double ersteZahl;
		double zweiteZahl;
		double summe;

		// Ganze Zahl Deklaration & Initialisierung in einem Schritt
		int anzahlSchueler = 27;

		// Texte, Zeichenfolgen
		String name = "Ann ";
		name = name + "Manegold";

		// ******** VERARBEITUNG
		// Wertzuweisung/Initialisierung
		ersteZahl = 74.2;
		zweiteZahl = 27.2;

		// Rechnung
		summe = ersteZahl + zweiteZahl;

		// ******** AUSGABE
		//Ergebnisse ausgeben
		System.out.println( "Erste Zahl: \t\t"+ersteZahl);
		System.out.println("Zweite Zahl: \t\t"+zweiteZahl);
		System.out.println("Summe: \t\t\t"+summe);
		System.out.println("Anzahl der Schüler: \t"+anzahlSchueler);
		System.out.println("Name: \t\t\t"+name);

	}

}
