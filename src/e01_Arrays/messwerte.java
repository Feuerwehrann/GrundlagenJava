package e01_Arrays;

public class messwerte {

	public static void main(String[] args) {
		int [] messwerte = {0,1,2,3,4,5};
		
		ausgabeArray(messwerte);
		messwerte = initMesswerte(0, messwerte);
		ausgabeArray(messwerte);

	
	}

	private static void ausgabeArray(int[]messwerte) {
		for (int i = 0; i < messwerte.length; i++) {
			System.out.println(messwerte [i]);
			
		}
		
	}

	private static int[] initMesswerte(int initValue, int[] pArray) {
		int [] kopie = pArray.clone();
		for (int i = 0; i < kopie.length; i++) {
			kopie [i] = initValue;
			
			
		}
		System.out.println("-----");
		
		return kopie;
	}

}
