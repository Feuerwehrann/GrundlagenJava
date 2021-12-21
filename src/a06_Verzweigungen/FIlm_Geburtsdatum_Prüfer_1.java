package a06_Verzweigungen;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class FIlm_Geburtsdatum_Prüfer_1 {
  //test
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Geburtsjahr eingeben:\t");
		int geburtsjahr = sc.nextInt();
		System.out.print("Geburtsmonat eingeben:\t");
		int geburtsmonat = sc.nextInt();
		System.out.print("Geburtstag eingeben:\t");
		int geburtstag = sc.nextInt();
		LocalDate gebDatum = LocalDate.of(geburtsjahr, geburtsmonat, geburtstag);
		LocalDate heute = LocalDate.now();
		int alter = calculateAge(gebDatum, heute);
		System.out.print("FSK eingeben:\t\t");
		int fsk = sc.nextInt();
		if (alter>=fsk) {
			System.out.println("Der Film darf ausgeliehen werden!");
			
		} else {
			System.out.println("Der Film darf nicht ausgeliehen werden!");

		}
		

	}
	public static int calculateAge(
			LocalDate birthDate,
			LocalDate currentDate) {
		return Period.between(birthDate, currentDate).getYears();
	}
}
