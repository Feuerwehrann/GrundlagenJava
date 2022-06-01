package e01_Arrays;

import java.util.Scanner;

public class Suchen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] zahlen = {3,4,1,6,4,2,7,2,10,900};
		int min = getMinimum(zahlen);
		System.out.println("Minimum:\t" + min);
		int max = getMaximum(zahlen);
		System.out.println("Maximum:\t" + max);
		double average = GetAverage(zahlen);
		System.out.println("Durchschnitt:\t" + average);
		System.out.print("Welche Zahl soll gesucht werden? ");
		int x = sc.nextInt();
		int one = foundX(zahlen, x);
		System.out.println(x + " an Stelle:\t" + one+"\n");
		int[] sortierterArray= getSortedArray(zahlen);
		int indexOf = binaereSuche(sortierterArray,x);
		System.out.println(indexOf);
		sc.close();

	}
	private static int binaereSuche(int[] a, int x) {
		int i = 0;
		int j = (a.length - 1);
		int k;
		System.out.println("Die Zahl "+x+" befindet sich an folgendem Index.");
		while (i<=j) {
			k=(i+j)/2;
			if (a[k]==x) {
				return k;

			}
			if (x < a[k]) {
				j=k-1;

			} else
				i=k+1;
		}

		return -1;
	}

	private static int[] getSortedArray(int[] pZahl) {
		int [] pZahlSorted = new int [pZahl.length];
		System.out.println("Sortierter Array:");
		for (int i = 0; i < pZahlSorted.length; i++) {
			pZahlSorted[i]=getMinimum(pZahl);
			int x= foundX(pZahl, pZahlSorted[i]);
			pZahl[x]=getMaximum(pZahl)+1;
			System.out.println(pZahlSorted[i]);
			
			
		}
		return pZahlSorted;
			
			
			
		}

	private static int getMinimum(int[] pZahl) {
		int minimumFound = pZahl[0];
		for (int i = 0; i < pZahl.length; i++) {
			if (minimumFound > pZahl[i]) {
				minimumFound = pZahl[i];
			}
		}
		return minimumFound;
	}

	private static int getMaximum(int[] pZahl) {
		int maximumFound = pZahl[0];
		for (int i = 0; i < pZahl.length; i++) {
			if (maximumFound < pZahl[i]) {
				maximumFound = pZahl[i];
			}
		}
		return maximumFound;
	}

	private static double GetAverage(int[] pZahl) {
		double averageCalc = 0;
		for (int i = 0; i < pZahl.length; i++) {
			averageCalc = averageCalc + pZahl [i];
			
		}
		averageCalc = averageCalc /pZahl.length;
		return averageCalc;
		}

	private static int foundX(int[] pZahl, int x) {
		int one = -1;
		for (int i = 0; i < pZahl.length; i++) {
			if (pZahl[i] == x) {
				one = i;
				return one;
				
			}
			
		}
		return one;
	}

}
