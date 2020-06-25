package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in) ;
		int nbUtilisateur = scanner.nextInt();
		int a = 0;
	
		for (int i = 1; i<=nbUtilisateur; i++)
		{
			a = a + i;
		}
		
		System.out.println(a);

	}

}
