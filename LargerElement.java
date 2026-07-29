package placement_prep;

import java.util.Arrays;

public class LargerElement {

	//Approach 1: Brute Force - TC (n log n)
	
	public static int larget(int arr[])
	{
		Arrays.sort(arr);
		
		return arr[arr.length-1];
		
	}
	
	//Approach 2: Optimal (Single Traversal)
	
	public static int largestElement(int arr[])
	{
		int max = arr[0];
		
		
		if(arr == null || arr.length == 0)
		{
			 throw new IllegalArgumentException("Array is empty!");
		}
		if(arr.length == 1)
		{
			return arr[0];
		}
		
		for(int i=1; i<arr.length; i++)
		{
			
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		
		int arr[] = {12, 45, 7, 89, 23 , 100};
		//int arr[] = {-5, -2, -10};
		//int arr[] = {10, 10, 10, 10};
		
		//System.out.println("Larget Element : " + larget(arr));
		System.out.println("Larget Element : " + largestElement(arr));
		

	}

}
