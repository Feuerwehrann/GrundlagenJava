package a03_Variablen;

public class Kraftberechnung implements PhysikKonstanten {

	/*
	 * F = m * a
	 * 
	 * Berechne die Kraft f�r eine Masse von 105 kg und der Erdfallbeschleunigung
	 * 9.81m/s�
	 * 
	 * [F]=kg*m/s� = N [m]=kg [a]=m/s�
	 * 
	 */

	public static void main(String[] args) {

		// ****** EINGABE
		// Deklaration
		double kraft, masse;

		// Wertzuweisung, Initialisierung
		masse = 105;

		// ****** VERARBEITUNG
		kraft = masse * ERDFALLBESCHLEUNIGUNG;

		// ****** AUSGABE
		System.out.println("Masse: \t\t" + masse);
		System.out.println("Beschleunigung: " + ERDFALLBESCHLEUNIGUNG);
		System.out.println("Kraft: \t\t" + kraft + "N");
	}
}