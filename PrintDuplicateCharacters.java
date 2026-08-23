/**
 * Problem: Print Duplicate Characters in a String
 *
 * Objective:
 * To identify and print duplicate characters from a string only once
 * using character frequency counting in Java.
 *
 * Concepts Used:
 * - Frequency array
 * - Boolean visited array
 * - String traversal
 *
 * Outcome:
 * Successfully identified duplicate characters and printed each duplicate
 * character only once.
 */
package placement_prep;

public class PrintDuplicateCharacters {

	public static void main(String[] args) {
		
		String str = "Programming".toLowerCase();
		
		int[] frequency = new int[26];
		boolean[] visited = new boolean[26];
		
		// Count Frequency...
		for(int i=0; i<str.length(); i++)
		{
			frequency[str.charAt(i) - 'a']++;
			
		}
		
		// Print duplicate character only once...
		System.out.println("Duplicate Characters...");
		for(int i=0; i<str.length(); i++)
		{
			if(frequency[str.charAt(i) - 'a'] > 1 && !visited[str.charAt(i) - 'a'])
			{
				System.out.println(str.charAt(i));
				visited[str.charAt(i) - 'a'] = true;
				
			}
		}

	}

}
