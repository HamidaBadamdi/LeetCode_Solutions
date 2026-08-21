/**
 * Problem: Check Anagram Strings
 *
 * Objective:
 * To determine whether two strings are anagrams using multiple approaches
 * in Java and compare their efficiency.
 *
 * Approaches:
 * 1. Sorting both strings and comparing them.
 * 2. Frequency count using an integer array.
 *
 * Concepts Used:
 * - Arrays.sort()
 * - Character frequency array
 * - String manipulation
 *
 * Outcome:
 * Successfully checked whether two strings are anagrams using both sorting
 * and frequency count approaches.
 */

package placement_prep;

import java.util.Arrays;

public class AnagramString {

	public static boolean isAnagramString(String s1 , String s2)
	{
		// Approach : 1 Using Sorting...
				char[] ar1 = s1.toCharArray();
				char[] ar2 = s2.toCharArray();
				
				Arrays.sort(ar1);
				Arrays.sort(ar2);
				
				if(Arrays.equals(ar1, ar2))
				{
					return true;
				
				}
				
		return false;

	}
	
	//Approach : 2 Using Frequency Count...
			
	public static boolean isAnagram(String s1, String s2)
	{
		int[]  frequecy = new int[26];
		for(int i=0;  i<s1.length(); i++)
		{
			
			frequecy[s1.charAt(i) - 'a']++;
		}
		
		for(int i=0; i<s2.length(); i++)
		{
			frequecy[s2.charAt(i) - 'a']--;
		}
		
		for(int i=0; i < 26; i++)
		{
			if(frequecy[i] != 0)
			{
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		
		String s1 = "Listen".toLowerCase();
		String s2 = "Silent".toLowerCase();
		
		if(s1.length() != s2.length())
		{
			System.out.println("Not Anagram!");
			return;
		}
		
		//System.out.println("Anagram String ? : " + isAnagramString(s1, s2));
		System.out.println("Anagram String ? : " + isAnagram(s1, s2));
		
		
	}

}
