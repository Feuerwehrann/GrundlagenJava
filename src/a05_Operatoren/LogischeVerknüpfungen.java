package a05_Operatoren;

public class LogischeVerknüpfungen {

	public static void main(String[] args) {
		//Deklaration
		String str_zl, str_z2;
		String lsg_a, lsg_b, lsg_c;
		int z1, z2, a, b, c;
		
		//Binäre Zahlen als Strings
		str_zl = "1100"; 					// entspricht 12
		str_z2 = "0101"; 					// entspricht Zahl 5
		
		//Umwandeln in ganze Zahlen
		z1 = Integer.parseInt(str_zl, 2);
		z2 = Integer.parseInt(str_z2, 2);
		
		//logische Verknüpfung
		a = z1 & z2; 						//12 UND 5 = 4
		b = z1 | z2; 						//12 ODER 5 = 13
		c = z1 ^ z2;  						//12 EX. ODER 5 = 9
		
		//Umwandeln in Binärzahl als String
		lsg_a = Integer.toBinaryString(a);
		lsg_b = Integer.toBinaryString(b);
		lsg_c = Integer.toBinaryString(c);
		
		//Binäre Ausgabe
		System.out.println(lsg_a);			//0100
		System.out.println(lsg_b);			//1101
		System.out.println(lsg_c);			//1001
		
		
		
		

	}

}
