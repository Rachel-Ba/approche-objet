package fr.algorithmie;
import java.util.Arrays;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int [] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 };
		int [] arrayTest = new int [array1.length];
		int [] arrayFinal = new int [array1.length];
		
		for (int i = 0; i < array2.length; i++) 
		{
			arrayTest[i] = array2[i];
		}
		
		for (int i = 0; i < array1.length; i++) 
		{
			arrayFinal[i] = array1[i] + arrayTest[i];
		}
		
		System.out.print(Arrays.toString(arrayFinal));

	}

}
