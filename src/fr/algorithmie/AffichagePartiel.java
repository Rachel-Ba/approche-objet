package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		// Combiner une boucle et un test de mani�re � n�afficher que les entiers sup�rieurs � 3 
				for (int i = 0; i < array.length; i++) 
				{
					if (array[i]>3)
					{
						System.out.print(array[i] + " ");
					}
				}
				
				System.out.println("");
				// Combiner une boucle et un test de mani�re � n�afficher que les entiers pairs
				for (int i = 0; i < array.length; i++) 
				{
					if (array[i]%2==0)
					{
						System.out.print(array[i] + " ");
					}	
				}
				
				System.out.println("");
				// Combiner une boucle et un test de mani�re � n�afficher que valeurs des index pairs 
				for (int i = 0; i < array.length; i++) 
				{
					if (i%2==0)
					{
						System.out.print(array[i] + " ");
					}	
				}
				
				System.out.println("");
				// Combiner une boucle et un test de mani�re � n�afficher que les entiers impairs
				for (int i = 0; i < array.length; i++) 
				{
					if (array[i]%2!=0)
					{
						System.out.print(array[i] + " ");
					}	
				}

	}

}
