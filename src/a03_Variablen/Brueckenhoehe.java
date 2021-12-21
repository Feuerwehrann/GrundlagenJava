package a03_Variablen;

/*
 * Die Hoehe einer Br�cke soll berechnet werden.
 * 
 * s = 1/2 * a * t�
 * 
 * Wir lassen einen Stein von einer Br�ke fallen und messen die Zeit mit 1.8 Sekunden.
 * Der Luftwiederstand soll vernachl�ssigt werden.
 * Wie hoch ist die Br�cke?
 * 
 * - Arbeiten sie nach dem EVA-Prinzip
 * - Verwenden sie f�r Konstanten ein Interface
 * - Verwenden sie aussagekr�ftige Variabelnamen (klein)
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
