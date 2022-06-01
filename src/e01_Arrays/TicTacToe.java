package e01_Arrays;

import java.util.Scanner;

public class TicTacToe {
	// Konstanten
	public static final int SPIELER_1 = 1;
	public static final int SPIELER_2 = -1;
	public static final int FREI = 0;
	public static final int ANZ_ZEILE_SPALTE = 3;
	// Klassenvariable
	public static int[][] sf = new int[ANZ_ZEILE_SPALTE][ANZ_ZEILE_SPALTE];
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Variablen
		int aktuellerSpieler = SPIELER_1;
		initSpielfeld();
		ausgabeSpielfeld();
		
		do {
			eingabe(aktuellerSpieler);
			ausgabeSpielfeld();
			//Prüfen ob gewonnen wurde
			//Spieler wechsel
			aktuellerSpieler = aktuellerSpieler*-1;
			
		} while (!pruefeObGewonnen());
		System.out.println(aktuellerSpieler*-1 + " hat gewonnen!");

		
		sc.close();
	}

	private static void eingabe(int aktuellerSpieler ) {
		int ziffer;
		do {
			ziffer = -1;
			System.out.println("Spieler: " + aktuellerSpieler);
			//Einlesen der Ziffer vom Ziffernblock
			ziffer = sc.nextInt();
			
		} while (!setzeFeld(ziffer,aktuellerSpieler));

		
	
		
	}

	private static boolean pruefeObGewonnen() {
		int [] summe = new int [8];
		summe[0]=sf[0][0]+sf[0][1]+sf[0][2];
		summe[1]=sf[1][0]+sf[1][1]+sf[1][2];
		summe[2]=sf[2][0]+sf[2][1]+sf[2][2];
		summe[3]=sf[0][0]+sf[1][0]+sf[2][0];
		summe[4]=sf[0][1]+sf[1][1]+sf[2][1];
		summe[5]=sf[0][2]+sf[1][2]+sf[2][2];
		summe[6]=sf[0][0]+sf[1][1]+sf[2][2];
		summe[7]=sf[2][0]+sf[1][1]+sf[0][2];
		
		for (int i = 0; i < summe.length; i++) {
			if (Math.abs(summe[i])==ANZ_ZEILE_SPALTE) {
				return true;
				
			}
			
		}

		return false;
	}
	
	private static boolean setzeFeld (int ziffer, int aktuellerSpieler) {
		boolean setzenOK = false;
		int y = -1;
		int x = -1;
		switch (ziffer) {
		case 7: y = 0; x = 0; break;
		case 8: y = 0; x = 1; break;
		case 9: y = 0; x = 2; break;
		case 4: y = 1; x = 0; break;
		case 5: y = 1; x = 1; break;
		case 6: y = 1; x = 2; break;
		case 1: y = 2; x = 0; break;
		case 2: y = 2; x = 1; break;
		case 3: y = 2; x = 2; break;
		
		

		default:System.out.println("Bitte gültige Zahl eingeben");
			break;}
		if (sf[y][x]==FREI) {
			setzenOK=true;
			sf[y][x] = aktuellerSpieler;
			
			
		}
		return setzenOK;
		
	}

	private static void ausgabeSpielfeld() {
		char spielerZeichen;
		for (int y = 0; y < sf.length; y++) {
			for (int x = 0; x < sf.length; x++) {
				if (sf[y][x] == SPIELER_1) {
					spielerZeichen = 'X';
					
				}
				else if (sf[y][x] == SPIELER_2) {
					spielerZeichen = 'O';
					
				}
				else {
					spielerZeichen = ' ';
				}
				System.out.print(spielerZeichen + " ");

			}
			System.out.println();
		}
		System.out.println("----------");
	}

	/**
	 * setzt alle Spielfelder auf den Wert 0
	 * 
	 * @author a.manegold
	 */
	private static void initSpielfeld() {
		for (int y = 0; y < sf.length; y++) {
			for (int x = 0; x < sf[0].length; x++) {
				sf[y][x] = FREI;

			}
		}
	}

}
