/**
 * Problem: Reverse a String
 *
 * Objective:
 * To reverse a given string using different approaches and demonstrate
 * efficient string manipulation techniques in Java.
 *
 * Approaches:
 * 1. Two Pointers with Character Array - O(n) time, O(n) space
 * 2. For Loop - O(n²) time due to String concatenation
 *
 * Outcome:
 * Successfully reversed the given string using multiple approaches.
 */

package placement_prep;

public class ReverseString {

	// Approach 1 : Using 2 pointers
	public static String revString(String str)
	{
		char[] arr = str.toCharArray();
		
		int left = 0;
		int right = str.length()-1;
		
		while(left < right)
		{
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
		}
		
		
		
		return new String(arr);
	}
	
	// Approach 2 : For loop
	
	public static String revString2(String str)
	{
		String revStr="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			revStr+=str.charAt(i);
		}
		
		return revStr;
	}
	
	public static void main(String[] args) {
		
		
		String str = "Hello";
		
		System.out.println("Original String : " + str);
		
		// System.out.println("Reverse String : " + revString(str));
		
		System.out.println("Reverse String : " + revString2(str));
		

	}

}
