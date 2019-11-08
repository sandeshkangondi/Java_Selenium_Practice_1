// Program to multiply array elements excluding the reference and placing the result in a different array at the same reference position

package Sandesh_Program_Practice.Sandesh_Program_Practice;

import java.util.Arrays;

public class multiplyElementsInArray {

	public static void main (String [] args){
		
		Integer [] orig = {4,2,6,9,7,3};
		Integer [] outputAarray = multipliedArray(orig);
		System.out.println("The output array is: "+ Arrays.asList(outputAarray));
	}
	
	public static Integer[] multipliedArray (Integer [] inputArray){
		Integer totalValue = 1;
		Integer [] outputArray = new Integer[inputArray.length];
		
		for(int i=0;i<inputArray.length;i++)
			totalValue =  totalValue*inputArray[i];

		System.out.println("The total value is: "+ totalValue);
		
		for(int j=0;j<inputArray.length;j++)
			outputArray[j] = totalValue/inputArray[j];			
		
		return outputArray;
		
		
		
		
	}
	
}
