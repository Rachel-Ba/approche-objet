package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Affichez tous les nombres de 1 � 10
		for (int i=1; i<=10; i++) 
		{
			System.out.print(i + ",");
		}
		
		System.out.println("");
		
		// Affichez 20 fois votre nom et votre pr�nom
		for (int i=1; i<=20; i++) 
		{
			System.out.print("BANDIERA Rachel,");
		}
		
			System.out.println("");
			
		// Affichez les �l�ments pairs de 2 � 100	
		for (int i=2; i<=200; i++) 
		{
			if (i%2 == 0)
			{
				System.out.print(i + ",");
			}	
		}
		
		System.out.println("");
		
		//Affichez les �l�ments impairs de 1 � 99	
		for (int i=1; i<=99; i++) 
		{
			if (i%2 != 0)
			{
				System.out.print(i + ",");
			}	
		}
				
				System.out.println("");	
		
	}

}
