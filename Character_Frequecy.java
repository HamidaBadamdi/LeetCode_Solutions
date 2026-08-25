/**
 * Problem: Count Character Frequency in a String
 *
 * Objective:
 * To count and display the frequency of each character in a string
 * using different approaches in Java.
 *
 * Concepts Used:
 * - Frequency array
 * - Boolean visited array
 * - Character indexing
 * - String traversal
 *
 * Outcome:
 * Successfully counted and displayed the frequency of each character
 * while avoiding duplicate output.
 */

package placement_prep;

import java.util.HashMap;
import java.util.Map;

public class Character_Frequecy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Programming";
		str = str.toLowerCase();
		
		int[] frequency = new int[26];
		boolean[] visited = new boolean[26];
	
		// Count Frequency...
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				// 'p' - 'a' -> 112 - 97 = 15 = 'p'
				// Frequecy[15] = 1
				frequency[str.charAt(i) - 'a']++;   
			}
		}
		
		// Print Frequency
		
		// Approach : 1
//		for(int i=0; i<26; i++)
//		{
//			if(frequency[i] > 0)
//			{
//				char ch = (char) ('a' + i);
//				System.out.println(ch + " -> " + frequency[i]);
//				
//			}
//		}
		
		
		// Approach : 2 
		
		for(int i=0; i<str.length(); i++)
		{
			int index = str.charAt(i) - 'a';
			
			if(!visited[index])
			{	
				System.out.println(str.charAt(i) + " -> " + frequency[index]);
				visited[index] = true;
			}
			
		}
		
		}
	

}


