
package Map;

import java.awt.geom.Arc2D.Double;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {

	public static void main(String[] args) {
		double[] notemate;
		notemate = new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		double[] noterom = new double[] { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
		// Create a HashMap object called catalog
		studentdetails elev1 = new studentdetails("Botezatu", "Andrei", noterom[0], notemate[9]);
		studentdetails elev2 = new studentdetails("Popescu", "Andrei", noterom[1], notemate[8]);
		studentdetails elev3 = new studentdetails("Gheorghe", "Andrei", noterom[2], notemate[7]);
		studentdetails elev4 = new studentdetails("Petrescu", "Andrei", noterom[3], notemate[6]);
		studentdetails elev5 = new studentdetails("Vasile", "Andrei", noterom[4], notemate[5]);
		studentdetails elev6 = new studentdetails("Vlad", "Andrei", noterom[5], notemate[4]);
		studentdetails elev7 = new studentdetails("Radu", "Andrei", noterom[6], notemate[3]);
		studentdetails elev8 = new studentdetails("Liviu", "Andrei", noterom[7], notemate[2]);
		studentdetails elev9 = new studentdetails("Sebi", "Andrei", noterom[8], notemate[1]);
		studentdetails elev10 = new studentdetails("Andrei", "Andrei", noterom[9], notemate[0]);

		HashMap<String, studentdetails> catalog = new HashMap<String, studentdetails>();

		// Add keys and values (CNP,Name)
		catalog.put("1a", elev1);
		catalog.put("2b", elev2);
		catalog.put("3c", elev3);
		catalog.put("4d", elev4);
		catalog.put("5a", elev5);
		catalog.put("6a", elev6);
		catalog.put("7c", elev7);
		catalog.put("8f", elev8);
		catalog.put("9z", elev9);
		catalog.put("15", elev10);
		// System.out.println(catalog);
		System.out.println(catalog.get("15"));
		// for(String getkey:catalog.keySet())
		// {
		// System.out.println(getkey);
		// }
		System.out.println("\n" + "LinkedHashMap!!!!!!!!!!!!!!!!!!" + "\n");

		LinkedHashMap<String, studentdetails> catalog1 = new LinkedHashMap<String, studentdetails>();
		catalog1.put("19f", elev1);
		catalog1.put("1fjsdg", elev2);
		catalog1.put("4ff", elev3);
		catalog1.put("9z", elev4);
		catalog1.put("adf", elev5);
		catalog1.put("555", elev6);
		catalog1.put("5547h", elev7);
		catalog1.put("88", elev8);
		catalog1.put("098", elev9);
		catalog1.put("abcd", elev10);
		// for(String getkeys:catalog1.keySet())
		// {
		// System.out.println(getkeys);
		// }
		System.out.println(catalog1.get("9z"));
	}

}
