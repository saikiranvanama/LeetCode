package ArraysAndStrings;

/*
 * Assuming that there will be enough spaces in the end to fill up the blanks with %02
 */
public class URLIfy {

	public static void main(String[] args) {
		String result = makeTheChanges("Mr John Smith    ", 13);
		
		System.out.println(result);
	}	

	public static String makeTheChanges(String value, int actualLength) {
		char[] string = value.toCharArray();
		int totalSpaces = 0;
		//Find the total number spaces in the actual array;
		for (int i = 0; i < actualLength; i++) {
			if(string[i] == ' ') totalSpaces ++;
		}
		
		int totalLength = totalSpaces*2 + actualLength;
		
		int backPtr = totalLength - 1;
		
		for (int fwdPtr =  actualLength - 1; fwdPtr < backPtr; --fwdPtr) {
			
			if(string[fwdPtr] != ' ') {
				string[backPtr] = string[fwdPtr];
				-- backPtr;
			} else {
				string[backPtr    ] = '2';
				string[-- backPtr] = '0';
				string[-- backPtr] = '%';
				-- backPtr;
			}
		}
		
		return String.valueOf(string);
	}

}
