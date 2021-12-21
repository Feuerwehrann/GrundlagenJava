package a05_Operatoren;

public class Getraenkeautomat {

	public static void main(String[] args) {
		//EINGABE
		double preisGetraenk = 1.6;
		double betragGezahlt = 2;
		int anzahlGetraenke = 1;
		double rueckgeld, kosten;
		
		//VERARBEITUNG
		kosten = preisGetraenk * anzahlGetraenke;
		rueckgeld = runden(betragGezahlt-kosten);
		
		
		//AUSGABE
		System.out.println("Preis Getränk: " + preisGetraenk);
		System.out.println("Betrag bezahlt: " + betragGezahlt);
		System.out.println("Anzahl getränke: "+ anzahlGetraenke);
		System.out.println("Rückgeld: " + rueckgeld);		

	}
	public static double runden(double zahl) {
		zahl = zahl *100;
		zahl= zahl+0.5;
		int z = (int) zahl;
		double neueZahl = (double) z/100;
		
		return neueZahl;
	}
}
