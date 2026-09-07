/**
 * Problem: Check if a String Contains Only Digits
 *
 * Objective:
 * To verify whether a given string contains only numeric digits
 * by checking each character individually.
 *
 * Concepts Used:
 * - String traversal
 * - Character comparison
 * - Conditional statements
 *
 * Outcome:
 * Successfully determined whether the input string contains only
 * digits or includes non-numeric characters.
 */

package placement_prep;

public class OnlyDigits {

	public static void main(String[] args) {
		
		//String str = "1234564837";
		String str = "123a456b789";
		
		boolean onlyDigit = true;
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) < '0' || str.charAt(i) > '9')
			{
				onlyDigit = false;
				break;
			}
			
		}
		
		if(onlyDigit)
		{
			System.out.println(str + " : Contains only digits.");
		}
		else
		{
			System.out.println(str + " : does not Contains only digits.");
		}

	}

}
