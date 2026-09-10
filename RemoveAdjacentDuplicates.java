/**
 * LeetCode 1047: Remove All Adjacent Duplicates in String
 *
 * Objective:
 * To remove all adjacent duplicate characters from a string using
 * a stack-based approach.
 *
 * Concepts Used:
 * - Character array as a stack
 * - Stack pointer (top)
 * - String traversal
 *
 * Outcome:
 * Successfully removed all adjacent duplicate characters and returned
 * the final processed string.
 */

package placement_prep;

public class RemoveAdjacentDuplicates {

	// Problem - 1047
	public static String removeDuplicates(String s) 
	{
		char[] stack = new char[s.length()];
		int top = -1;
		
		for(int i=0; i<s.length(); i++)
		{
			if(top != -1 && stack[top] == s.charAt(i))
			{
				top--;
			}
			else
			{
				top++;
				stack[top] = s.charAt(i);
			}
		}
		
		return new String(stack , 0 , top+1);
	}

	public static void main(String[] args) {
		
		// abbaca
		String s  = "azxxzy"; // Output : ca
		System.out.println(removeDuplicates(s));
		
	}

}
