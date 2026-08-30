/**
 * Problem: Find First Non-Repeating Character in a String
 *
 * Objective:
 * To find the first (and second) non-repeating character in a string
 * using frequency counting in Java.
 *
 * Concepts Used:
 * - Frequency array
 * - String traversal
 * - Character indexing
 *
 * Outcome:
 * Successfully identified the first and second non-repeating characters
 * by counting character occurrences.
 */
package placement_prep;

public class First_Non_Repating_Chracter {

	public static void main(String[] args) {
		
		String str = "Programming".toLowerCase();
		
		int[] frequency = new int[26];
		
		// Count Frequency...
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				frequency[str.charAt(i)-'a']++;
			}
			
		}
		
	     // Find first non-repeating character...
		for(int i=0; i<str.length(); i++)
		{
			if(frequency[str.charAt(i) - 'a'] == 1)
			{
				
				System.out.println("First Non-Repeating Character : " + str.charAt(i));
				// System.out.println(str.charAt(i) + " -> " + frequency[str.charAt(i) - 'a']);
				return;
			}
		}
		
	    // Find second non-repeating character...
		int count = 0;
		
		for(int i=0; i<str.length(); i++)
		{
			if(frequency[str.charAt(i) - 'a'] == 1 )
			{
				count++;
			}
			
			if(count == 2)
			{
				System.out.println("Second Non-Repeating Character : " + str.charAt(i));
				return;
			}
		}
		System.out.println("No Non-Repeating Chatacter...");
		
		

	}

}
