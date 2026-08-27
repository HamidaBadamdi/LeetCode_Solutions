/**
 * Problem: Find All Maximum Frequency Characters in a String
 *
 * Objective:
 * To identify and display all characters that have the highest
 * frequency in a given string.
 *
 * Concepts Used:
 * - Frequency array
 * - Boolean visited array
 * - String traversal
 *
 * Outcome:
 * Successfully found all characters with the maximum frequency
 * and displayed them along with their occurrence count.
 */

package placement_prep;

public class AllMaximumCharacters {

	public static void main(String[] args) {
		
		String str = "Programming".toLowerCase();
		int[] frequency = new int[26];
		boolean[] visited = new boolean[26];
		
		for(int i=0; i<str.length(); i++)
		{
			frequency[str.charAt(i) - 'a']++;
		}
		
		int maxFrequency = 0;
		
		for(int value : frequency)
		{
			if(value > maxFrequency)
				maxFrequency = value;
		}
	
		System.out.println("String : " + str + "\n");
		System.out.print("Characters : ");
		
		for(int i=0; i<str.length(); i++)
		{
			if(frequency[str.charAt(i) - 'a'] == maxFrequency && !visited[str.charAt(i) - 'a'])
			{
				System.out.print(str.charAt(i) + " ");
				visited[str.charAt(i) - 'a'] = true;
			}
		}
		
		System.out.println("\nMaximum Frequency : " + maxFrequency);
	}

}
