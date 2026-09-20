/**
 * Problem: Print ASCII Values of Characters in a String
 *
 * Objective:
 * To print the ASCII value of every character in a given string,
 * including letters, digits, and special characters.
 *
 * Concepts Used:
 * - String traversal
 * - Character to ASCII conversion
 * - Type casting (char to int)
 *
 * Outcome:
 * Successfully displayed each character along with its ASCII value.
 */

package placement_prep;

public class PrintASCIIValue {

	public static void main(String[] args) {
		
		String str = "#J@va";
		
		for(int i=0; i<str.length(); i++)
		{
			System.out.println(str.charAt(i) + " -> " + (int)str.charAt(i));
		}
		

	}

}
