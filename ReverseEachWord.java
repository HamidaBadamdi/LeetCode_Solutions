/**
 * Problem: Reverse Each Word in a String
 *
 * Objective:
 * To reverse every word in a sentence while keeping the word order unchanged.
 *
 * Concepts Used:
 * - Character array
 * - Two-pointer technique
 * - String traversal
 *
 * Outcome:
 * Successfully reversed each individual word in the sentence without
 * changing the order of the words.
 */

package placement_prep;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		String str = "Java is Easy";
		
		char[] arr = str.toCharArray();
		int start = 0;
		
		for(int i=0; i<=arr.length; i++)
		{
			if(i == arr.length || arr[i] == ' ')
			{
				int left = start;
				int right = i - 1;
				
				while(left < right)
				{
					char temp = arr[left];
					arr[left] = arr[right];
					arr[right] = temp;
					
					
					left++;
					right--;
				}
				
				start = i + 1;
			}
		}
		
		System.out.println(new String(arr));
	
	}

}
