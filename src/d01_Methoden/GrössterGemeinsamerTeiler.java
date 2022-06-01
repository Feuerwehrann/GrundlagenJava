package d01_Methoden;

public class GrössterGemeinsamerTeiler {

	public static void main(String[] args) {
		int fakultaetErgebnis = fakultaet(5);
		System.out.println(fakultaetErgebnis);

	}
	public static int fakultaet (int z) {
		int fakultaetErgebnis = 1;
		if (z != 0) {
			while (z>0) {
				fakultaetErgebnis = fakultaetErgebnis * z;
				z--;
				
			}
			
		}

		
		return fakultaetErgebnis;
		
	}
	

}
