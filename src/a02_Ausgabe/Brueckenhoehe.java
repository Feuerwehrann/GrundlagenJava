package a02_Ausgabe;

public class Brueckenhoehe {

	public static void main(String[] args) {
		
		double g = 9.81;
		double t = 2.5;
		
		System.out.println("Die einer Bruecke wird berechnet mit s = 0,5*gt² \n");
		System.out.println("Wenn gilt: \t" + "g = 9,81 m/s\t\t\n" + "\t\tt = 2,5 s \n");
		System.out.print("Ergibt sich: ");
		System.out.println("\ts = "+(0.5*(g*t*t))+"m");
		
	}

}
