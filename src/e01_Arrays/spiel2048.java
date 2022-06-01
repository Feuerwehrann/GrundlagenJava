package e01_Arrays;

public class spiel2048 {
	public static final int ANZAHL_ZEILE_SPALTE = 4;

	public static void main(String[] args) {
		newGame();
		//Neues Objekt erzeugen
		Gui dieGui = new Gui();
		
		//Sichtbarmachen des Fensters
		dieGui.setVisible(true);

	}

	private static void newGame() {
		// Spielfeld generieren
		int[][] sf = new int[ANZAHL_ZEILE_SPALTE][ANZAHL_ZEILE_SPALTE];

		// Ermittle Maximum im Spielfeld
		int max = getMax(sf);

		// Ziehe zufällig eine 2er Potenz mit Max als Höchstwert 2,4,8...
		int wert = calcWert(max);

		// ermittle zufällige Position von 0-ANZAHL_SPALTE-1
		int xIndex = getIndexFirstField();
		int yIndex = getIndexFirstField();

		// Setze den ersten Wert an die zufällig bestimmte Position
		sf[xIndex][yIndex] = wert;

		// Spielfeld anzeigen
		ausgabe(sf);
	}

	private static void ausgabe(int[][] sf) {
		for (int y = 0; y < sf.length; y++) {
			for (int x = 0; x < sf.length; x++) {
				System.out.print(sf[x][y] + "\t");

			}
			System.out.println();

		}

	}

	/**
	 * Ermittle einen zufälligen Index des Spiels mit dem ersten besetzten Feld
	 * 
	 * @param anzahlZeileSpalte
	 * @return
	 */
	private static int getIndexFirstField() {

		return (int) (Math.random() * ANZAHL_ZEILE_SPALTE);
	}

	/**
	 * Die Methode erzeugt eine 2er Potenz ab der Zahl 2 bis zum übergebenem Maximum
	 * Bsp.: Max=8. Mögliche Ergebnisse sind 2,4,8 Bsp.: Max=32. Mögliche Ergebnisse
	 * sind 2,4,8,16,32 Bsp.: Max=0. Ergebnis ist 2
	 * 
	 * @param max
	 * @return zz
	 */

	private static int calcWert(int max) {
		int n = 0;
		if (max > 0) {
			n = (int) (Math.log(max) / Math.log(2));
		}
		// Zufallszahl erzeugen
		int zz = (int) (Math.random() * n + 1);
		// Wert als 2er Potenz erzeugen
		int wert = (int) Math.pow(2, zz);

		return wert;
	}

	private static int getMax(int[][] sf) {
		int maxFound = 0;
		for (int i = 0; i < sf.length; i++) {
			for (int j = 0; j < sf.length; j++) {
				if (maxFound < sf[i][j]) {
					maxFound = sf[i][j];

				}
			}

		}

		return maxFound;
	}

}
