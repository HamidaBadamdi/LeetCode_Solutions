/**
 * Problem: Find All Minimum Frequency Characters in a String
 *
 * Objective:
 * To identify and display all characters that have the minimum
 * frequency in a given string.
 *
 * Concepts Used:
 * - Frequency array
 * - Boolean visited array
 * - String traversal
 *
 * Outcome:
 * Successfully found all characters with the minimum frequency
 * and displayed them along with their occurrence count.
 */

package placement_prep;

public class AllMinimumCharacters {

	public static void main(String[] args) {
		
		String str = "Programming".toLowerCase();
		int[] frequency = new int[26];
		boolean[] visited = new boolean[26];
		
		for(int i=0; i<str.length(); i++)
		{
			frequency[str.charAt(i) - 'a']++;
		}
		
		int minFrequency = Integer.MAX_VALUE;
		
		for(int value : frequency)
		{
			if(value > 0 && value < minFrequency)
			{
				minFrequency = value;
			}
		}
		System.out.println("String : " + str + "\n");
		System.out.print("Charactes : ");
		for(int i=0; i<str.length(); i++)
		{
			if(frequency[str.charAt(i) - 'a'] == minFrequency && !visited[str.charAt(i) - 'a'])
			{
				System.out.print(str.charAt(i) + " ");
				visited[str.charAt(i) - 'a'] = true;
			}
		}

		System.out.println("\nMinimum Frequency : " + minFrequency);
	}

}
