package fr.algorithmie;
import java.util.Arrays;

public class FirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long randomArray [] = new long [10];
			for (int i = 0; i < randomArray.length; i++) 
			{
				double x = Math.random();
				randomArray[i] = Math.round(x*10); 
			}
		System.out.print(Arrays.toString(randomArray));
/////////////////////////////////////////////////////////////////////////////////////////////		
		boolean FirstLast;
		
		if (randomArray.length>=1 && (randomArray[0] == randomArray[randomArray.length]))
		{
			FirstLast = true;
		}
		else
		{
			FirstLast = false;
		}
		
		System.out.print(FirstLast);
			
		
	}
}
