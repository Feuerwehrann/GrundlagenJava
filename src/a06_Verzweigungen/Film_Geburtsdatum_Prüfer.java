package a06_Verzweigungen;

import java.util.Date;
import java.util.Scanner;

public class Film_Geburtsdatum_Prüfer {

	public static void main(String[] args) {
		//EINGABE
		Scanner sc = new Scanner (System.in);
		Date datum = new Date ();
		int tagHeute = datum.getDay();
		int monatHeute = datum.getMonth();
		int jahrHeute = datum.getYear();
		System.out.print("Bitte FSK des Filmes eingeben:\t");
		int fsk = sc.nextInt();
		String tagHeuteString = ""+tagHeute;
		String monatHeuteString = ""+monatHeute;
		String jahrHeuteString = ""+jahrHeute;
		
		String tagHeute1 = jahrHeuteString+monatHeuteString+tagHeuteString;
		int tagHeuteInt = Integer.parseInt(tagHeute1);
		System.out.println(tagHeuteInt);
		
		
		System.out.print("Bitte Geburtsjahr des Kunden eingeben:\t");
		int geburtsjahrKunde = sc.nextInt();
		System.out.print("Bitte Geburtsmonat des Kunden eingeben:\t");
		int geburtsmonatKunde = sc.nextInt();
		System.out.print("Bitte Geburtstag des Kunden eingeben:\t");
		int geburtstagKunde = sc.nextInt();
		
		String geburtsdatumKundeString = ""+geburtsjahrKunde+geburtsmonatKunde+geburtstagKunde;
		int geburtsdatumKundeInt = Integer.parseInt(geburtsdatumKundeString);
		
		fsk = fsk*1000000;
		
		int alter = tagHeuteInt-geburtsdatumKundeInt;
		
		
		
		//VERARBEITUNG+AUSGABE
		
		if (alter>=fsk) {
			System.out.println("Film darf ausgeliehen werden!");
			
		} else {
			System.out.println("Film darf nicht ausgeliehen werden!");

		}
		
		
		
		
		
		

	}

}
