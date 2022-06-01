package e01_Arrays;

public class BinareSuche {

	public static void main(String[] args) {
		int[] zahlen = { 1, 2, 3, 4, 5, 6, 7, 8, 9,900};
		int indexOf = getIndexOf(zahlen);
		System.out.println(indexOf);
	}

	private static int getIndexOf(int[] a) {
		int x = 900;
		int i = 0;
		int j = (a.length - 1);
		int k;
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
}
