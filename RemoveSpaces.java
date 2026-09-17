/**
 * Problem: Remove Spaces from a String
 *
 * Objective:
 * To remove all spaces from a given string using character traversal.
 *
 * Concepts Used:
 * - String traversal
 * - Character comparison
 * - Conditional statements
 *
 * Outcome:
 * Successfully removed all spaces from the input string.
 */
package placement_prep;

public class RemoveSpaces {

	public static void main(String[] args) {
		
		String str = "  I Love java Programming  ";
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) != ' ')
			{
				System.out.print(str.charAt(i));
			}
			
		}

	}

}
