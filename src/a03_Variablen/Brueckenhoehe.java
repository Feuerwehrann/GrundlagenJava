package a03_Variablen;

/*
 * Die Hoehe einer Brücke soll berechnet werden.
 * 
 * s = 1/2 * a * t²
 * 
 * Wir lassen einen Stein von einer Brüke fallen und messen die Zeit mit 1.8 Sekunden.
 * Der Luftwiederstand soll vernachlässigt werden.
 * Wie hoch ist die Brücke?
 * 
 * - Arbeiten sie nach dem EVA-Prinzip
 * - Verwenden sie für Konstanten ein Interface
 * - Verwenden sie aussagekräftige Variabelnamen (klein)
 */

public class Brueckenhoehe implements PhysikKonstanten{
	
	public static void main(String[] args) {
		
		//******	EINGABE
		//Deklaration
		double zeit, brueckenhoehe;
		
		//Wertzuweisung
		zeit = 1.8;
		
		//******	VERARBEITUNG
		brueckenhoehe = 0.5 * ERDFALLBESCHLEUNIGUNG * zeit;
		
		//******	AUSGABE
		System.out.println("brueckenhoehe: \t"+brueckenhoehe+"m");
		
		
		
		

	}
}
