/**
 * Problem: Replace Spaces in a String
 *
 * Objective:
 * To replace all spaces in a string with a specified character
 * while preserving the remaining characters.
 *
 * Concepts Used:
 * - String traversal
 * - Conditional statements
 * - String manipulation
 *
 * Outcome:
 * Successfully replaced every space in the string with the '*'
 * character and generated the updated string.
 */

package placement_prep;

public class ReplaceSpaces {

	public static void main(String[] args) {
		
		String str = "I Love Java Programming";
		String result = "";
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) == ' ')
			{
				result+= "*";
			}
			else
			{
				result+=str.charAt(i);
			}
		}
		
		System.out.println("Original String : " + str);
		System.out.println("Result : " + result);

	}

}
