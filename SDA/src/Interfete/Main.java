package Interfete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.sun.xml.internal.messaging.saaj.util.CharReader;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Automat(1) sau Manual (2) ?");
		int a1 = scanner.nextInt();
		int z = 0;
		int i = 0;
		if (a1 == 1) {
			List<Shape> shape = new ArrayList<>();
			shape.add(new Patrat(3, "#010101", 3));
			shape.add(new Dreptunghi(6, 4, "#010101", 2));
			shape.add(new Dreptunghi(6, 4, "#010101", 2));
			shape.add(new Dreptunghi(6, 4, "#010101", 2));
			shape.add(new Dreptunghi(6, 4, "#010101", 2));
			shape.add(new Dreptunghi(6, 4, "#010101", 2));
			shape.add(new Dreptunghi(6, 4, "#010101", 2));
			shape.add(new Dreptunghi(6, 4, "#010101", 2));
			shape.add(new Dreptunghi(6, 4, "#010101", 2));
			shape.add(new Dreptunghi(6, 4, "#010101", 2));
			shape.add(new Cerc(6, "#999AbF", 2));
			shape.add(new Cerc(6, "#022010", 2));
			shape.add(new Cerc(6, "#022010", 2));
			shape.add(new Cerc(6, "#022010", 2));
			shape.add(new Cerc(6, "#123456", 2));
			shape.add(new Dreptunghi(6, 4, "#abcdef", 2));
			shape.add(new Dreptunghi(6, 4, "#abcdef", 2));

			ArrayList<String> count = new ArrayList<String>();
			for (Shape shapess : shape) {
				z++;
			}
			String val[] = new String[z];
			for (Shape shapes : shape) {
				val[i] = shapes.getHexFillColor();
				count.add(shapes.getHexFillColor());
				// System.out.println(val);
				// System.out.println("Nume shape");
				// System.out.println(shapes.getName());
				// System.out.println("aria :");
				// System.out.print(shapes.getArea());

				// System.out.println("\n BorderWidth: ");
				/// System.out.println(shapes.getBorderWidth());
				// System.out.println("\n HexFillColor");
				/// System.out.print(shapes.getHexFillColor());

				// System.out.println();
				// shapes.draw();
				// System.out.println();
				// i++;

			}

			int index = 0;
			Set<String> set = new LinkedHashSet<>();
			set.addAll(count);
			for (String s : set) {
				System.out.println(s + " " + Collections.frequency(count, s));
				index++;
			}
			// int j=0;
			/*
			 * int sum = 0;
			 * 
			 * for (int j = 0; j < val.length-1; j++) { int index1 = 1;
			 * 
			 * if ((val[0].compareTo(val[j+1])) == 0) {
			 * 
			 * 
			 * index1++; sum += index1; // if(sum==val.length) // {
			 * System.out.println("sum=" + sum); System.out.println(val[1] + " " +index1);
			 * 
			 * // } } else System.out.println(val[j]+"  1");
			 * 
			 * // index2++; }
			 * 
			 * // j++;
			 */

		} else if (a1 == 2) {

			System.out.println("Ce doriti sa construiti? \n (p)Patrat ,(d)Dreptunghi,(c)Cerc \n");
			System.out.println();

			char a;
			a = (char) System.in.read();
			if (a == 'p') {
				System.out.println("Ati ales patrat , introduceti dimensiuea patratului)");
				int nr1 = scanner.nextInt();
				Shape patrat2 = new Patrat(nr1, "#f5f6f5", 5);
				patrat2.draw();
			} else if (a == 'd') {
				System.out.println("Ati ales dreptunghi , introduceti latimea si lungimea");
				int nr2 = scanner.nextInt();
				int nr3 = scanner.nextInt();
				Shape dreptunghi = new Dreptunghi(nr2, nr3, "#f5f6f5", 5);
				dreptunghi.draw();
			} else if (a == 'c') {
				System.out.println("ati ales Cerc,introduceti r");
				int nr4 = scanner.nextInt();
				Shape cerc = new Cerc(nr4, "#f5f6f5", 5);
				cerc.draw();

			}
		} else if (a1 != 1 && a1 != 2)
			throw new IllegalArgumentException("Nu ati introdus nici una dintre variante");

	}

}
