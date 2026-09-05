/**
 * LeetCode 520: Detect Capital
 *
 * Objective:
 * To verify whether a word uses capital letters correctly according
 * to the valid capitalization rules.
 *
 * Concepts Used:
 * - String traversal
 * - Character comparison
 * - Conditional statements
 *
 * Outcome:
 * Successfully validated correct capitalization for a given word.
 */

package placement_prep;

public class DetectCapital {

	// Problem 520
	 public static boolean detectCapitalUse(String word)
	 {
		 
		 int count = 0;
		 
		 for(int i=0; i<word.length(); i++)
		 {
			 if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')
			 {
				 count++;
			 }
		 }
		 
		 // Case 1 : All Uppercase
		 
		 if(count == word.length())
		 {
			 return true;
		 }
		 
		// Case 2 : All Lowercase
		if(count == 0)
		{
			return true;
		}
		
		// Case 3 : Only first letter Uppercase
		if(count == 1 && word.charAt(0) >= 'A' &&  word.charAt(0) <= 'Z')
		{
			return true;
		}
		 
		return false;
	   
	 }
	 
	 
		public static void main(String[] args) {

		String word = "INDiA";
		System.out.println(detectCapitalUse(word));
		
		

	}

}
