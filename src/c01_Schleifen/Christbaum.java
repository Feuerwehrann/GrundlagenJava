package c01_Schleifen;

public class Christbaum {

	public static void main(String[] args) {
		
		/*System.out.println("      *");
		System.out.println("     ***");
		System.out.println("    *****");
		System.out.println("   *******");
		System.out.println("  *********");
		System.out.println(" ***********");
		System.out.println("*************");*/
	
		
		
		
		
		int anzahlZeilen = 71;
		for (int z = anzahlZeilen; z >0; z--) {

			for (int leerzeichen = z-1; leerzeichen >0; leerzeichen--) {
				System.out.print(" ");
				}
			for (int sterne = 0; sterne <=(2*anzahlZeilen)-(2*z); sterne++) {
				System.out.print("*");
				}
			System.out.println();
			}
		
	}

}
