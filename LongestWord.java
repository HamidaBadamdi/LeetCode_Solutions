/**
 * Problem: Find the Longest Word in a String
 *
 * Objective:
 * To identify the longest word present in a sentence and display
 * its length using string traversal in Java.
 *
 * Concepts Used:
 * - String traversal
 * - Word extraction
 * - Conditional statements
 *
 * Outcome:
 * Successfully found the longest word in the given sentence
 * and displayed its length.
 */

package placement_prep;

public class LongestWord {

	public static void main(String[] args) {
		
		String str = "I Love Java Programming Language";
		String currentWord = "";
		String longestWord = "";
		
		
		for(int i=0; i<=str.length(); i++)
		{
			
			if(i == str.length() || str.charAt(i) == ' ')
			{
				if(currentWord.length() > 0)
				{
					if(currentWord.length() >  longestWord.length())
					{
						longestWord = currentWord;
					}
					
					currentWord="";
				}
			}
			else
			{
				currentWord+=str.charAt(i);
				
			}
				
				
		}
		
		
		System.out.println("String : " + str + "\n");
		System.out.println("Longest Word : " + longestWord);
		System.out.println("Length : " + longestWord.length());
		
	}

}
