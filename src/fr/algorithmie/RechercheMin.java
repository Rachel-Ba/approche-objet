package fr.algorithmie;

import java.util.Arrays;

public class RechercheMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int min = Arrays.stream(array).min().getAsInt();
		System.out.println(min);

	}

}
