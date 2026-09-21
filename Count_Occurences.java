/**
 * Problem: Count Occurrences of Words in a String
 *
 * Objective:
 * To count the occurrence of specific words in a sentence using
 * a HashMap for efficient frequency tracking.
 *
 * Concepts Used:
 * - HashMap
 * - String split()
 * - Word frequency counting
 * - getOrDefault()
 *
 * Outcome:
 * Successfully counted and displayed the occurrence of each target word,
 * including words that are not present in the sentence.
 */
package placement_prep;

import java.util.HashMap;

public class Count_Occurences {

	public static void main(String[] args) {
		
		String text = "java is easy java is powerful java programming is fun".toLowerCase();
		
		String[] words = {"java", "is", "programming", "python"};
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		String[] text_word = text.split(" ");
		
		
		for(String word : text_word)
		{
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
			
		for(String word: words)
		{
			System.out.println(word + " -> " + map.getOrDefault(word,0));
		}
		

	}

}
