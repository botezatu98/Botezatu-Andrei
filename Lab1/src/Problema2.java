import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*Fie o matrice patratica nxn, sa se calculeze suma de
pe diagonala principala.

|3 1 1 |

|1 5 1 |

|1 1 8 |

Rezultat: 16
*/
public class Main 
{

	public static void main(String[] args) 
	{
		int n ;
		 
		 System.out.print ("Introduceti numarul de coloane x nr lini : ");
		 Scanner scanner = new Scanner(System.in);
		 n = scanner.nextInt();
		 int a[][]=new int[n][n];
		 for(int i=0;i<n;i++)
			 for(int j=0;j<n;j++) 
			 {
				System.out.println("a["+i+"]["+j+"]=");
				a[i][j]=scanner.nextInt();
			
			 }
	for(int i=0;i<n;i++) 
	{
		for(int j=0;j<n;j++)
			System.out.println(a[i][j]+" "+"\n");
	}
	int s = 0;
	 for (int i = 0; i < n; i++)
		 for(int j=0;j<n;j++)
			 if(i==j)
	      s = s + a[i][j];
	 System.out.println("suma este : "+s);
	}
			 }
	


