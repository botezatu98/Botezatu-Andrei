package Lab5Matrici;

import java.util.*;
import java.util.Scanner;

public class Main {

	static final int Fx = 3;
	static final int Fy = 3;

	private static void afisareTablou(String text, int[][] myTab, int n, int m) {
		System.out.println(String.format("\n%s", text));
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(String.format("%3d ", myTab[i][j]));
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		Scanner myInput = new Scanner(System.in);
		int n, m;

		System.out.print("\nIntrodu numarul de linii: ");
		n = myInput.nextInt();
		System.out.print("\nIntrodu numarul de coloane: ");
		m = myInput.nextInt();
		System.out.println();

		int[][] tablou = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				tablou[i][j] = new Random().nextInt(255);
			}
		}
		afisareTablou(String.format("Tabloul '%d x %d' initial este:", m, n), tablou, n, m);

		// aplicare filtru Fx x Fy (3 x 3)
		for (int i = 0; i < n; i = i + Fy) {
			for (int j = 0; j < m; j = j + Fx) {
				int maxFx = Math.min(Fx, m - j);
				int maxFy = Math.min(Fy, n - i);
				int sum = 0;
				for (int k = 0; k < maxFy; k++) {
					for (int l = 0; l < maxFx; l++) {
						sum += tablou[i + k][j + l];
					}
				}
				int media = (int) sum / (maxFx * maxFy);
				for (int k = 0; k < maxFy; k++) {
					for (int l = 0; l < maxFx; l++) {
						tablou[i + k][j + l] = media;
					}
				}

			}
		}

		afisareTablou(String.format("Tabloul '%d x %d' dupa filtru %dx%d este:", m, n, Fx, Fy), tablou, n, m);
	}
}