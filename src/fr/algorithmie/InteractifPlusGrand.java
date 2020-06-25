package fr.algorithmie;
import java.util.Arrays;
import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Entrez 10 nombres");
		System.out.print(" ");
		Scanner scanner = new Scanner(System.in);
		int [] tab = new int [10];
	
		for (int i=0; i<10; i++)
		{
			int nbUtilisateur = scanner.nextInt();
			tab[i] = nbUtilisateur;
		}
		int max = Arrays.stream(tab).max().getAsInt();
		
		System.out.print(max);
		
		

	}

}
