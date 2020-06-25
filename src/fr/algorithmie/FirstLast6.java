package fr.algorithmie;
import java.util.Arrays;

public class FirstLast6 {

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
		boolean FirstLast6;
		
		if (randomArray.length>=1 && (randomArray[0] == 6 || randomArray[randomArray.length] == 6))
		{
			FirstLast6 = true;
		}
		else
		{
			FirstLast6 = false;
		}
		
		System.out.print(FirstLast6);
			
		
	}
}
