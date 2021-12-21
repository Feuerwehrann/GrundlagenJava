package a04_Eingabe;
import java.util.Scanner;
public class Laengenrechner implements Laengeneinheiten {

	public static void main(String[] args) {
		
		//Eingabe
		Scanner sc = new Scanner(System.in);  
		double messwertm;
		
		System.out.print("Messwert in m: \t\t");
		messwertm = sc.nextDouble();
		
		//VERARBEITUNG
		double messwertkm = messwertm * METER_IN_KILOMETER;
		double messwertcm = messwertm * METER_IN_ZENTIMETER;
		double messwertmm = messwertm* METER_IN_MILLIMETER;
		double messwertInch = messwertm * METER_IN_INCH;
		double messwertYard = messwertm * METER_IN_YARD;
		double messwertFoot = messwertm * METER_IN_FOOT;
		double messwertMeile = messwertm * METER_IN_MILE;
		double messwertSeemeile = messwertm * METER_IN_SEEMEILE;
		
		//AUSGABE
		System.out.println("----------------------");
		System.out.println("Messwert in Meter:\t" + messwertm + " m");
		System.out.println("Messwert in km:\t\t" + messwertkm + " km");
		System.out.println("Messwert in cm:\t\t" + messwertcm + " cm");
		System.out.println("Messwert in mm:\t\t" + messwertmm + " mm");
		System.out.println("Messwert in Inch:\t" + messwertInch + " Inch");
		System.out.println("Messwert in Yard:\t" + messwertYard + " Yard");
		System.out.println("Messwert in Foot:\t" + messwertFoot + " Foot");
		System.out.println("Messwert in Meile:\t" + messwertMeile + " Meilen");
		System.out.println("Messwert in Seemeile:\t" + messwertSeemeile + " Seemeilen");
		
		sc.close();
				
	}

}
