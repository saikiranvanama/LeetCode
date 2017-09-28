package ArraysAndStrings;

public class CheckPermutation {

	public static void main(String[] args) {

	}
	
	public static boolean permutationOfEachOther(String str1, String str2) {
		char [] keySet = new char [128];
		
		for (int i = 0; i < str1.length(); i++) {
			keySet[str1.charAt(i)]++;
		}
		
		for (int i = 0; i < str2.length(); i++) {
			keySet[str1.charAt(i)]--;
		}
		
		for (int i = 0; i < keySet.length; i++) {
			if(keySet[i] != 0) return false;
		}
		
		return true;
	}

}
