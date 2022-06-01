package e01_Arrays;

public class lotto {


	public static void main(String[] args) {

		int[] lotto = new int[6];
		int gezogeneZahl;
		boolean[] istZahlSchonGezogen = new boolean[49];

		for (int i = 0; i < istZahlSchonGezogen.length; i++) {
			istZahlSchonGezogen[i] = false;

		}

		for (int i = 0; i < lotto.length; i++) {
			do {
				gezogeneZahl = (int) (Math.random() * 49 + 1);

			} while (istZahlSchonGezogen[(gezogeneZahl - 1)] == true);
			lotto[i] = gezogeneZahl;
			istZahlSchonGezogen[gezogeneZahl - 1] = true;
			System.out.println(lotto[i]);

		}

	}

}
