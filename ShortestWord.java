/**
 * Problem: Find the Shortest Word in a String
 *
 * Objective:
 * To identify the shortest word present in a sentence and display
 * its length using string traversal in Java.
 *
 * Concepts Used:
 * - String traversal
 * - Word extraction
 * - Conditional statements
 *
 * Outcome:
 * Successfully found the shortest word in the given sentence
 * and displayed its length.
 */

package placement_prep;

public class ShortestWord {

	public static void main(String[] args) {

		String str = "I Love Java Programming Language";
		
		String currentWord = "";
		String shortestWord = "";
		
		
		for(int i=0; i<=str.length(); i++)
		{
			if(i == str.length()||str.charAt(i) == ' ')
			{
				if(currentWord.length() > 0)
				{
					if(shortestWord.length() == 0 || currentWord.length() < shortestWord.length())
					{
						shortestWord = currentWord;
					}
					
					currentWord ="";
				}
			}
			else
			{
				currentWord+= str.charAt(i);
			}
		}
		
		System.out.println("String : " + str + "\n");
		System.out.println("Shoretst Word : " + shortestWord);
		System.out.println("Length : " + shortestWord.length());
	}

}
