/**
 * Problem: Find Minimum Frequency Character in a String
 *
 * Objective:
 * To find the character that appears the minimum number of times
 * in a given string using frequency counting in Java.
 *
 * Concepts Used:
 * - Frequency array
 * - Character indexing
 * - String traversal
 *
 * Outcome:
 * Successfully identified the character with the minimum frequency
 * and displayed its occurrence count.
 */

package placement_prep;

public class MinimumFrequencyCharacter {

	public static void main(String[] args) {
		
		String str = "Banana".toLowerCase();
		int[] frequency = new int[26];
		
		for(int i=0; i<str.length(); i++)
		{
			frequency[str.charAt(i) - 'a']++;
		}
		
		char  minChar = ' ';
		int minFrequency = Integer.MAX_VALUE;
		
		for(int i=0; i<str.length(); i++)
		{
			if(frequency[str.charAt(i) - 'a'] < minFrequency)
			{
				minFrequency = frequency[str.charAt(i) - 'a'];
				minChar = str.charAt(i);
			}
		}
		
		System.out.println("String : " + str + "\n");
		System.out.println("Mininum Character : " + minChar);
		System.out.println("Frequency : " + minFrequency);
	}

}
