package fr.algorithmie;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int min = 1;
		int max = 100;
		int result = r.nextInt(max-min) + min;
		
//		System.out.println(result);
		
		System.out.println("Devinez le bon nombre :");
		System.out.println(" ");
		Scanner scanner = new Scanner(System.in);
		int nbUtilisateur = scanner.nextInt();
		int cmt = 0;
		
		while (nbUtilisateur != result)
		{

			if (nbUtilisateur > result)
			{
				System.out.println("Trop grand");
				nbUtilisateur = scanner.nextInt();
				cmt++;
			}
			else if (nbUtilisateur < result)
			{
				System.out.println("Trop petit");
				nbUtilisateur = scanner.nextInt();
				cmt++;
			}
		}
		System.out.println("Bien joué ! Trouver en " + (cmt+1) + " coups");

	}

}
