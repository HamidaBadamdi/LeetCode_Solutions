/**
 * Problem: Remove Duplicate Characters from a String
 *
 * Objective:
 * To remove duplicate characters from a string while preserving the
 * order of their first occurrence.
 *
 * Concepts Used:
 * - StringBuilder
 * - Boolean array (visited)
 * - Character traversal
 *
 * Outcome:
 * Successfully removed duplicate characters and preserved the original
 * character order in the resulting string.
 */

package placement_prep;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {

		String str = "Programming".toLowerCase();
		
		boolean visited[] = new boolean[26];
		StringBuilder result = new StringBuilder();
		
		for(int i=0;  i<str.length(); i++)
		{
			if(!visited[str.charAt(i)-'a'])
			{
				result.append(str.charAt(i));
				visited[str.charAt(i)-'a'] = true;
			}
		}
		System.out.println("Original String: " + str);
		System.out.println("After removing duplicate charcaters: " + result);
		

	}

}
