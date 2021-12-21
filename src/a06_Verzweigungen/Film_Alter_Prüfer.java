package a06_Verzweigungen;

import java.util.Scanner;

public class Film_Alter_Prüfer {
	public static void main(String[] args) {
		//EINGABE
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Bitte FSK des Filmes eingeben:\t");
		int fsk = sc.nextInt();
		System.out.print("Bitter Alter eingeben:\t\t");
		int alter = sc.nextInt();
		
		//VERARBEITUNG + AUSGABE
		if (alter>=fsk) {
			System.out.println("Der Film darf ausgeliehen werden");
		}
		else {
			System.out.println("Der Film darf nicht ausgeliehen werden");
		}
		sc.close();
		
	}
}
