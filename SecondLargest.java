package placement_prep;

import java.util.Arrays;

public class SecondLargest {

	//Approach 1: Brute Force O(n log n)
	public static int secondLargest(int arr[])
	{
		Arrays.sort(arr);
		int largest = arr[arr.length-1]; //last element is large after sorting
		
		for(int i=arr.length-2; i>=0; i--)
		{
			
			if(arr[i] != largest)
			{
				return arr[i];
			}
		}
		
		
		return -1;
		
	}
	
	// Approach 2 : Single Traversal - Optimal Solution
	
	public static int findSecondLargest(int arr[])
	{
		int largest = arr[0];
		int secondlargest = Integer.MIN_VALUE;
		
		if(arr == null || arr.length < 2)
		{
			return -1;
		}

		
		
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i] > largest)
			{
				largest = arr[i];
				secondlargest = largest;
			}
			else if(arr[i] > secondlargest &&  arr[i] != largest)
			{
				secondlargest = arr[i];
				
			}
			
		}
		
		if (secondlargest == Integer.MIN_VALUE )
		{
			return -1;
		}
			
		
		return secondlargest;
	}
	public static void main(String[] args) {
		
		int arr[] = {12,35,1,10,34,1,38};
		
		//inr arr[] = {5,5,5};
		//int arr[] = {1};
		System.out.println(secondLargest(arr));
		
		//System.out.println(findSecondLargest(arr));

	}

}
