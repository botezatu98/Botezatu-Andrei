package Interfete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.sun.xml.internal.messaging.saaj.util.CharReader;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Automat(1) sau Manual (2) ?");
		int a1 = scanner.nextInt();
		//
		if (a1 == 1) {
			List<Shape> shape = new ArrayList<>();
			shape.add(new Patrat(3, "#f5f6f5", 3));
			shape.add(new Dreptunghi(6, 4, "#f5f6f5", 2));
			shape.add(new Cerc(6, "#f5f6f5", 2));
			for (Shape shapes : shape)
			{
				System.out.println("Nume shape");
				System.out.println(shapes.getName());
				System.out.println("aria :");
				System.out.print(shapes.getArea());

				System.out.println("\n BorderWidth:  ");
				System.out.println(shapes.getBorderWidth());
				System.out.println("\n HexFillColor");

				System.out.print(shapes.getHexFillColor());

				System.out.println();
				shapes.draw();
				System.out.println();

			}


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
