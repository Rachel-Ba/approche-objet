package fr.algorithmie;
import java.util.Arrays;
import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in) ;
		int nbUtilisateur;
		
		do
		{			
			nbUtilisateur = scanner.nextInt();
		} while (nbUtilisateur<1 || nbUtilisateur>10);
		
		System.out.print(nbUtilisateur);

	}

}
