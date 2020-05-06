package Laborator4;

import java.util.Scanner;

public class Problema2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu pozitia :");
		int p = scanner.nextInt();
		int[] sir = new int[10];
		sir[0] = 12;
		sir[1] = 25;
		sir[2] = 47;
		sir[3] = 58;
		sir[4] = 47;
		sir[5] = 7;
		sir[6] = 96;
		sir[7] = 14;
		sir[8] = 3;
		sir[9] = 9;
		int n = sir.length - 1;
		if (p <= n) {
			for (int i = p; i < n; i++) {
				sir[i] = sir[i + 1];

			}
			sir[n] = 0;
			System.out.println(java.util.Arrays.toString(sir));
		} else
			System.out.println("Numarul introdus este prea mare");

	}

}
