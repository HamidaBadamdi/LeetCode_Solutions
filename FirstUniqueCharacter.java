/**
 * LeetCode 387: First Unique Character in a String
 *
 * Objective:
 * To find the index of the first non-repeating character in a string.
 *
 * Concepts Used:
 * - Frequency array
 * - String traversal
 * - Character indexing
 *
 * Outcome:
 * Successfully returned the index of the first unique character,
 * or -1 if no unique character exists.
 */
package placement_prep;

public class FirstUniqueCharacter {

	public static int firstUniqChar(String str)
	{
		str = str.toLowerCase();
		 int[]  frequency = new int[26];
		 
		 
		 for(int i=0; i<str.length(); i++)
		 {
			 frequency[str.charAt(i) - 'a']++;
		 }
		 
		 for(int i=0; i<str.length(); i++)
		 {
			 if(frequency[str.charAt(i) - 'a'] == 1)
			 {
				 return i;
			 }
		 }
		 
		 return -1;
	}
	
	public static void main(String[] args) {
		
		String str = "loveleetcode";
		
		System.out.println(firstUniqChar(str));

	}

}
