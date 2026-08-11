package com.exercises;

public class CountTheNumberOfVowelStringsInRange2586 {

	public int vowelStrings(String[] words, int left, int right) {
		int count = 0;
		for (int i = left; i <= right; i++) {
			if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))) {
				count++;
			}
		} return count;
	}

	private boolean isVowel(char s) {
		String c =  String.valueOf(s);
		return c.toLowerCase().charAt(0) == 'a' || c.toLowerCase().charAt(0) == 'e' || c.toLowerCase().charAt(0) == 'i'
				|| c.toLowerCase().charAt(0) == 'o' || c.toLowerCase().charAt(0) == 'u';
	}
}
