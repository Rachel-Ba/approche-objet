package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in) ;
		int nbUtilisateur;
		
		do
		{			
			nbUtilisateur = scanner.nextInt();
		} while (nbUtilisateur<1 || nbUtilisateur>10);
		
		for (int i = 0; i<=10; i++)
		{
			
			System.out.println(nbUtilisateur + " x " + i + " = " + (nbUtilisateur*i));
		}

	}

}
