package e01_Arrays;

public class drehenVersuchZwei {

	public static void main(String[] args) {

		int[][] tabelle = { { 3, 5, 7 }, { 1, 9, 12 }, { 2, 6, 0 } };
		
		int[][] tabelle = initTabelle();
		ausgabe(tabelle);
		
		tabelle = rotiere(tabelle);
		ausgabe(tabelle);

	}

	private static int[][] rotiere(int[][] tabelle) {
		int [][]rotiert = new int [3][3];
		int xn;
		int yn;
		xn=0;
		for (int yv = 0; yv <rotiert.length; yv++) {
			yn=2;
			for (int xv = 0; xv < rotiert.length;xv++) {
				rotiert[yv][xv] = tabelle [yn][xn];
				yn--;
				}
			xn++;
			
		}

		return null;
	}

	private static void ausgabe(int[][] tabelle) {

		
	}

	private static int[][] initTabelle() {
		int [][] tabelle = {
				{3,5,7},
				{1,9,12},
				{2,6,0}
		};

		return null;
	}

	

}
