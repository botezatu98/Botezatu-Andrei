package ro.unitbv.javadatatype;

import java.util.Scanner;

public class Exercitiu1 {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		//int nr1,nr2;
		System.out.println("Introdu nr 1:");
		int nr1 = scanner.nextInt();
		System.out.println("Numarul 1 citi este :" +nr1);
		System.out.println("Introdu nr 2:");
		int nr2 = scanner.nextInt();
		System.out.println("Numarul 2 citi este :" +nr1);
		// TODO Auto-generated method stub
		System.out.println("Suma este="+(nr1+nr2));
		System.out.println("Diferenta este="+(nr1-nr2));
		System.out.println("Inmultirea  este="+(nr1*nr2));
		float media=(nr1+nr2)/2;
		System.out.println("Media="+media);
		if(nr1>nr2)
		System.out.println("Distance este="+((nr1-nr2)));
		else
			System.out.println("distanta este="+(nr2-nr1));
		if(nr1>nr2)
			System.out.println("Numarul maxime="+nr1);
		else
			System.out.println("Numarul maxim="+nr2);
		double  impartire;
		impartire=(double)nr1/(double)nr2;
		System.out.println("Impartirea este="+impartire);
		
	}

}
