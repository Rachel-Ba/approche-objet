package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in) ;
		int nbUtilisateur = scanner.nextInt();
	
		for (int i = 1; i<=10; i++)
		{
			System.out.println(nbUtilisateur+i);
		}
	}

}
