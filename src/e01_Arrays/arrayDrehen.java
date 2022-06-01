package e01_Arrays;

public class arrayDrehen {

	public static void main(String[] args) {
		int [][] tabelle = {
				{3,5,7},
				{1,9,12},
				{2,6,0}
		};
		for (int i = 0; i < tabelle.length; i++) {
			for (int j = 0; j < tabelle.length; j++) {
				System.out.print(tabelle[i][j] + "  ");
				
			}
			System.out.println();
			
		}
		System.out.println("-------");
		
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
		for (int i = 0; i < rotiert.length; i++) {
			for (int j = 0; j < rotiert.length; j++) {
				System.out.print(rotiert[i][j] + "  ");
				
			}
			System.out.println();
			
		}
		}



}


