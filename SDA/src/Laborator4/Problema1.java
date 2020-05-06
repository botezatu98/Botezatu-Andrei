package Laborator4;

import java.util.Scanner;

public class Problema1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu pozitia :");
		int p = scanner.nextInt();
		System.out.println("Introdu numarul :");
		int val = scanner.nextInt();
		int[] sir = new int[11];
		//sir[0]={ 12, 25, 47, 58, 47, 7, 96, 14, 3, 9};
		sir[0]=12;
		sir[1]=25;
		sir[2]=47;
		sir[3]=58;
		sir[4]=47;
		sir[5]=7;
		sir[6]=96;
		sir[7]=14;
		sir[8]=3;
		sir[9]=9;
		int n=sir.length;
		for(int i = n-2 ; i >= p ; i --)
		
			sir[i+1] = sir[i];
		sir[p] = val;
		
		
		System.out.println(java.util.Arrays.toString(sir));
	}



}
