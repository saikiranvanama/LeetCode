package ArraysAndStrings;

import java.util.Arrays;

public class UniqueCharactersInString {
	public static void main(String args[]) {
		String value = "abcd";
		
		isUniqueUsingSorting(value);
	}
	
	public static boolean isUniqueUsingConstantArray(String value) {
		char [] keys = new char[256];
		
		for (char c : value.toCharArray()) {
			keys[c]++;
			if(keys[c] > 1) return false;
		}
		return true;
	}
public static boolean isUniqueUsingSorting(String value) {
		char [] ch = value.toCharArray();
		Arrays.sort(ch);
		
		char prev = ch[0];
		
		for (int i = 1; i < ch.length; i++) {
			if(prev == ch[i]) {
				return false;
			}
		}
		
		return true;
	}
}
