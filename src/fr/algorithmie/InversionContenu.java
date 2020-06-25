package fr.algorithmie;
import java.util.Arrays;


public class InversionContenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] arrayCopy = new int [array.length];
		int a = 0;
		// Afficher l’ensemble des éléments dans l’ordre inverse du tableau
        for (int i = array.length-1; i >= 0; i--) 
        {
        	//Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy mais dans l’ordre inverse.
            arrayCopy[a] = array[i];
            a++;
            
        }
        
        //Afficher l’ensemble des éléments des 2 tableaux
        System.out.print(Arrays.toString(array));
        System.out.println("");
        System.out.print(Arrays.toString(arrayCopy));

	}

}
