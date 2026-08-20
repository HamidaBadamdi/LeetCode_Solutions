/**
 * Problem: Count Vowels and Consonants in a String
 *
 * Objective:
 * To identify, count, and display all vowels and consonants present
 * in a given string using character traversal in Java.
 *
 * Concepts Used:
 * - String manipulation
 * - Character comparison
 * - StringBuilder
 * - Loops and conditional statements
 *
 * Outcome:
 * Successfully counted and displayed the list of vowels and consonants
 * from the input string.
 */

package placement_prep;

public class Vowels_Consonants {
	
	 public static void main(String[] args) {
		
		 String str = "Hello World!";
		 str = str.toLowerCase();
		 
		 System.out.println("String : " + str);
		 int vowel =0 , consonant = 0;
		 StringBuilder vowelsList = new StringBuilder();
		 StringBuilder consonantsList = new StringBuilder();
		 
		 for(int i=0; i<str.length(); i++)
		 {
			 if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			 {
				 if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
						 || str.charAt(i) == 'o' || str.charAt(i) == 'u')
				 {
					 vowelsList.append(str.charAt(i));
					 vowel++;
				 }
				 else
				 {
					 consonantsList.append(str.charAt(i));
					 consonant++;
				 }
					 
			 }
			 
			 
		 }
		 
		 System.out.println("Vowels : " + vowelsList);
		 System.out.println("Total No. of Vowels: " + vowel);
		 
		 System.out.println("\nConsonats List: " + consonantsList);
		 System.out.println("Total No. of Consonants: " + consonant);
		
		
	}

}
