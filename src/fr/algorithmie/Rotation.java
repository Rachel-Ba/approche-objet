package fr.algorithmie;
import java.util.Arrays;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {4, 1, 2, 3} ;
		int[] arrayRotation = new int [array.length];
		// on veut avoir 3 0 1 2

		for (int i = 0; i < array.length-1; i++) 
		{
			arrayRotation[i] = array [i + 1];
		}
		
		arrayRotation[array.length-1] = array[0];
		
		System.out.print(Arrays.toString(arrayRotation));
	}

}
