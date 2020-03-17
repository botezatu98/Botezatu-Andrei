import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

/*Fie un sir nr de n numere, sa se printeze numarul
maxim.

Nr = [23,13,56,12,-12,34,57,-2]

Rezultat: 57
*/
public class Main 
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		int n;
		 System.out.print ("Introduceti numarul de elemente n = ");
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 n = Integer.valueOf(reader.readLine());
		 int nr[] = new int[n];
		 int i;
		 for(i = 0;i < n; i++)
		 {
		 System.out.print("NR["+i+"]=");
		 nr[i]=Integer.valueOf(reader.readLine());
		 }
		 int max = nr[0];
		 for(i = 1;i < n; i++)
		 if(max < nr[i]) 
			 max = nr[i];
		 System.out.println("Numarul maxim este = " + max);
		
	
		
	

	}
}


