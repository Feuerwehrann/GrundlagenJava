package a02_Ausgabe;

public class Ausgabe {
	/**
	 * hier kann man Sachen reinschreiben, die dann sp�ter auf einer Webseite
	 * angezeigt werden k�nnen
	 * 
	 **/

	public static void main(String[] args) {

		/**
		 * mann kann Sachen mit Str. Leertatse vervollst�ndigen
		 **/

		// Ausgabe in Java
		// Textausgabe
		System.out.println("Ich bin nicht du.");
		System.out.println(278); // Ganzezahl -> int
		System.out.println(2.5); // Kommazahl -> double
		System.out.println('A'); // einzelne Zeichen -> char
		System.out.println(true); // boolischer Wert

		// -> der System.out.print Befehl ist �berladen

		// Verkn�pfen von Ausgaben mit dem +-Opertator
		System.out.println("Ich hei�e nicht wie du und bin " + 16);

		// Rechnen mit Zahlen
		System.out.println(5 + 2);

		// Rechnen und Verkn�pfen
		System.out.println("5" + 3); // -> 53
		System.out.println(5 + 3 + "8"); // -> 88
		System.out.println("5" + 3 + 8); // -> 538
		System.out.println("5" + (3 + 8)); // -> 511
		// -> Arbeitung von Links nach rechts
		// -> Baerbeitung in Klammern wird vorgezogen, wie beim Taschenrechner
		// -> +-Operator ist �berladen
		// -> Merke: mit Text in "" kann nicht gerechnet werden.

		// Escape Seqeunzen
		System.out.println("Hier kommt ein Zeilenumbruch \n hin");
		System.out.println("Der Backdslash \\");
		System.out.println("Name: \t Vorname:");
		System.out.println("Maier \t Max");
	}
}
