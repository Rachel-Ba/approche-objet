package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tab[] = new int [1];
		int tabTempo [] = new int [tab.length+1];
		int tabTempoTest [] = new int [tab.length+1];
		System.out.println("Sélectionnez votre menu :\r\n" + 
				"1. Ajouter un nombre\r\n" + 
				"2. Afficher les nombres existants. \r\n" + 
				"3. Exit" );
		
		Scanner scanner = new Scanner(System.in);
		int nbUtilisateur = scanner.nextInt();
		
		while(nbUtilisateur !=3)
		{
		
			if (nbUtilisateur == 1)
			{
				System.out.println("Entrez vos valeur :");
				
				Scanner scanner2 = new Scanner(System.in);
				
				for (int i=0; i<10; i++)
				{
					int newValue = scanner2.nextInt();
					
					tab[i] = newValue;
					tabTempo[i] = newValue;
					
					tabTempoTest = tabTempo;
					tabTempo = new int [tabTempoTest.length+1];
					tab = new int [tabTempoTest.length+1];
					
					tabTempo[i] = tabTempoTest [i];
					System.out.println(Arrays.toString(tabTempoTest));
				}

				
			}
			
			else if (nbUtilisateur == 2)
			{		
				System.out.print(Arrays.toString(tab));
			}
		}
		

	}

}
