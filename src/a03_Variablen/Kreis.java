package a03_Variablen;

public class Kreis {

	public static void main(String[] args) {
		//Eingabe
		double kreisFlaeche, kreisUmfang;
		double radius = 1.35;
		
		//VERARBEITUNG
		kreisUmfang = 2* Math.PI * radius;
		kreisFlaeche = Math.PI * Math.pow(radius, 2);
		
		//AUSGABE
		System.out.println("Radius: \t"+ radius+"cm");
		System.out.println("Umfang: \t"+ kreisUmfang +"cm");
		System.out.println("Flaeche: \t"+ kreisFlaeche+"cm²");
		
	}
}
