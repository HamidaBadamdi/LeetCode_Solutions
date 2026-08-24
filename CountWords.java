/**
 * Problem: Count Words in a String
 *
 * Objective:
 * To count the total number of words in a string by identifying
 * the beginning of each word while ignoring extra spaces.
 *
 * Concepts Used:
 * - String traversal
 * - Character comparison
 * - Conditional statements
 *
 * Outcome:
 * Successfully counted the number of words in a string, including
 * strings with leading, trailing, and multiple spaces.
 */
package placement_prep;

public class CountWords {

	public static void main(String[] args) {
		
		String str = "  I Love Java Language  ";
		int word_count = 0;
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) != ' ' && 
					(i == 0 || str.charAt(i-1) == ' '))
			{
				word_count++;
			}
		}

		System.out.println("String : " + str);
		System.out.println("Total No. of Words : " + word_count);
	}

}
