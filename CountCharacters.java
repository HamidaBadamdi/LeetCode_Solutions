/**
 * Problem: Count Different Types of Characters in a String
 *
 * Objective:
 * To count uppercase letters, lowercase letters, digits, spaces,
 * and special characters present in a given string.
 *
 * Concepts Used:
 * - String traversal
 * - Character comparison
 * - Conditional statements
 *
 * Outcome:
 * Successfully counted and displayed the number of uppercase letters,
 * lowercase letters, digits, spaces, and special characters in the string.
 */

package placement_prep;

public class CountCharacters {

	public static void main(String[] args) {
		
		String str =  "Hello World@123 !";
		
		int uppercase = 0, lowercase = 0, digits = 0, spaces = 0, special = 0;
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
			{
				uppercase++;
			}
			else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				lowercase++;
			}
			else if(str.charAt(i) >='0' && str.charAt(i) <= '9')
			{
				digits++;
			}
			else if(str.charAt(i) == ' ')
			{
				spaces++;
			}
			else
			{
				special++;
			}
		}

		System.out.println("String : " + str + "\n");
		
		System.out.println("Total Uppecase Letters : " + uppercase);
		System.out.println("Total Lowercase Letters : " + lowercase);
		System.out.println("Total Digits : " + digits);
		System.out.println("Total Spaces : " + spaces);
		System.out.println("Total Special Charactes : " + special);
	}

}
