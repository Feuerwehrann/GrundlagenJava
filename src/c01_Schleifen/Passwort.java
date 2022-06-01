package c01_Schleifen;

import java.util.Scanner;

public class Passwort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String benutzer = " ";
		String passwort = " ";
		
		
		
		do {
			System.out.print("Benutzername:\t");
			benutzer = sc.next();
			System.out.print("Passwort:\t");
			passwort = sc.next();
			
		} while (!benutzer.equals("gast") || !passwort.equals("hgs"));
		
		System.out.println("Anmeldung erfolgreich");
		sc.close();

	}

}

