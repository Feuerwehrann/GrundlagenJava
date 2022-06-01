package e01_Arrays;

public class Lotto2 {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		lotto = zieheLottoZahlen();
		ausgabeLottoZahlen(lotto);

	}

	private static void ausgabeLottoZahlen(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);

		}

	}

	private static int[] zieheLottoZahlen() {
		int lotto2 [] = new int [6];
		int gezogeneZahl;
		boolean[] istZahlSchonGezogen = new boolean[49];
		for (int k = 0; k < istZahlSchonGezogen.length; k++) {
			istZahlSchonGezogen[k] = false;
		}
		
		for (int i = 0; i < lotto2.length; i++) {

			

			do {
				gezogeneZahl = (int) (Math.random() * 49 + 1);

			} while (istZahlSchonGezogen[(gezogeneZahl - 1)] == true);
			lotto2[i] = gezogeneZahl;
			istZahlSchonGezogen[gezogeneZahl - 1] = true;

		}
		
		return lotto2;
	}
}

	


