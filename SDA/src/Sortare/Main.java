package Sortare;

//MergeSort
class Main {
	void merge(int sir[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for (int i = 0; i < n1; ++i)
			L[i] = sir[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = sir[m + 1 + j];
		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				sir[k] = L[i];
				i++;
			} else {
				sir[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			sir[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			sir[k] = R[j];
			j++;
			k++;
		}
	}
	void sort(int sir[], int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			sort(sir, l, m);
			sort(sir, m + 1, r);
			merge(sir, l, m, r);
		}
	}

	public static void main(String args[]) {
		int sir[] = {0,6,1,4,8,3,5};
		System.out.println("Sirul initial");
		for(int i=0;i<sir.length;i++)
			System.out.print(sir[i]+" ");
		Main sirs = new Main();
		sirs.sort(sir, 0, sir.length - 1);
		System.out.println("\nSirul sortat");
		for(int i=0;i<sir.length;i++)
			System.out.print(sir[i]+" ");
	}
}
