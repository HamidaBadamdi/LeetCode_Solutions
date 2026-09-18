/*
* Description:
* Finds the first uppercase character in a given string.
*
* Approach:
* Traverse the string and check each character for uppercase.
* Print the first uppercase character found and stop the search.
*
* Complexity: O(n) time, O(1) space.
*/

package placement_prep;

public class FirstUpperCase {

	public static void main(String[] args) {
		
		String str = "java is Easy";
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
			{
				System.out.println("First Uppercase : "  + str.charAt(i));
				return;
			}
		}

	}

}
