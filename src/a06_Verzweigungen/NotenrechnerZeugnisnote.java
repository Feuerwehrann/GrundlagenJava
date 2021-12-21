package a06_Verzweigungen;

import java.util.Scanner;

public class NotenrechnerZeugnisnote {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double erreichtePunkte, maximalePunkte, note;
		System.out.print("Maximale punkte:\t");
		maximalePunkte = sc.nextDouble();
		System.out.print("Erreichte Punkte:\t");
		erreichtePunkte = sc.nextDouble();
		note = 6-5*erreichtePunkte/maximalePunkte;
		System.out.println("Note:\t\t\t"+note);
		note = note+0.5;
		note=(int)note;
		System.out.println("Zeugnisnote:\t\t"+note);
		sc.close();
	}

}
