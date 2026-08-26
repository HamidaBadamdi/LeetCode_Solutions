/**
 * Problem: Find Maximum Frequency Character in a String
 *
 * Objective:
 * To find the character that appears the maximum number of times
 * in a given string using frequency counting in Java.
 *
 * Concepts Used:
 * - Frequency array
 * - Character indexing
 * - String traversal
 *
 * Outcome:
 * Successfully identified the character with the highest frequency
 * and displayed its occurrence count.
 */

package placement_prep;

public class MaximumFrequencyCharacter {

	public static void main(String[] args) {
		
		String str = "Banana".toLowerCase();
		
		int[] frequency = new int[26];
		
		// Count the frequency...
		for(int i=0; i<str.length(); i++)
		{
			frequency[str.charAt(i) - 'a']++;
		}

		char maxChar = ' ';
		int maxFrequency = 0;
		
		for(int i=0; i<str.length(); i++)
		{
		
			if(frequency[str.charAt(i) - 'a'] > maxFrequency)
			{
				maxFrequency = frequency[str.charAt(i) - 'a'];
				maxChar = str.charAt(i);
				
			}
		}
	
		System.out.println("String : " + str + "\n");
		System.out.println("Maximum Frequency Character : " + maxChar);
		System.out.println("Frequency : " + maxFrequency);
	}

}
