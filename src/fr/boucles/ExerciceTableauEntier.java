package fr.boucles;
import java.util.Arrays;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Affichez tous les nombres de 1 � 10		
		int[] a = new int[10]; 
		for (int i=0; i<10; i++) 
		{
			a[i]=i+1;			
		}
			System.out.print(Arrays.toString(a));
			
			System.out.println("");
		// Affichez le premier �l�ment du tableau
			System.out.print(a[0]);
			
			System.out.println("");
		//Affichez la longueur du tableau en utilisant la propri�t� length
			System.out.print(a.length);
			
			System.out.println("");
		//Affichez le dernier �l�ment du tableau en utilisant la propri�t� length
			System.out.print(a[a.length - 1]);
			
			System.out.println("");
		//Modifiez la valeur de l��l�ment d�index 4 et donnez lui la valeur 8
			a[4] = 8; 
			System.out.print(Arrays.toString(a));

				
		
		
		
		
		

	}

}
