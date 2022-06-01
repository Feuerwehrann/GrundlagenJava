package e01_Arrays;

public class groessterGemeinsamerNenner {

	public static void main(String[] args) {
		int zahl1 = 3;
		int zahl2 = 9;
		int teiler1 = 1;
		int teiler2 = 1;
		int feld1 = -1;
		int feld2 = -1;
		int anzahlFelder2 = 1;
		int[] teilerZ1 = new int[zahl1];
		int[] teilerZ2 = new int[zahl2];
		teiler1 = zahl1;
		teiler2 = zahl2;
		/*while (zahl1 >= 1) {
			if (zahl1 % teiler1 == 0) {
				feld1++;
				teilerZ1[feld1] = zahl1 / teiler1;
			}
			teiler1--;
		}*/
		int anzahlteiler = teiler2;
		teiler2=0;
		while (zahl2 <= teiler2) {
			if (zahl2 % teiler2 == 0) {
				feld2++;
				teilerZ2[feld2] = zahl2 / teiler2;
			}
			teiler2++;
			anzahlFelder2 = feld2;
		}
		while (feld1 >= 0) {
			feld2 = anzahlFelder2;
			while (feld2 <= 0) {
				if (teilerZ1[feld1] == teilerZ2[feld2]) {
					System.out.println(teilerZ1[feld1]);
				}
				feld2++;

			}
			feld1--;

		}

	}

}
