/**
 * Problem: Print ASCII Value of Characters
 *
 * Objective:
 * To print the ASCII value of each character in a string using
 * type casting in Java.
 *
 * Concepts Used:
 * - Character traversal
 * - ASCII values
 * - Type casting (char to int)
 *
 * Outcome:
 * Successfully displayed the ASCII value of each character in the input string.
 */

package placement_prep;

public class AsciiValue {

	public static void main(String[] args) {
		
		String str = "ABC";
		
		//char[] arr = str.toCharArray();
		
		for(int i=0; i<str.length(); i++)
		{
			System.out.println(str.charAt(i) + " - " + (int) str.charAt(i));
		}
		
		
//		for(char ch = 'A'; ch <= 'Z'; ch++)
//		{
//			System.out.println(ch + " - " + (int) ch);
//		}
	}
}
