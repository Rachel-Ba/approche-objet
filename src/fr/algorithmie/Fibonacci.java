package fr.algorithmie;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		
		System.out.print("Votre chiffre :");
		Scanner scanner = new Scanner(System.in);
		int nbUtilisateur = scanner.nextInt();
		
		for(int i = 2; i<nbUtilisateur; i++)
		{
			n3 = n1 + n2;
			System.out.print("0 1 "+n3);
			n1 = n2;
			n2 = n3;
		}


	}

}
