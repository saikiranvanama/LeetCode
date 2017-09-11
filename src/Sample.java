import java.util.LinkedList;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sai");
	}

	public int[] plusOne(int[] digits) {
		LinkedList<Integer> list = new LinkedList<>();
		int carry = 1;
		
		for (int i = digits.length - 1; i >= 0; i--) {
			int sum = digits[i] + carry;
			list.addFirst(sum%10);
			carry = sum / 10;
		}
		
		if(carry != 0) list.addFirst(carry);
		
		int [] result = list.stream().mapToInt(x -> x).toArray();
		return result;
		
	}
	
	public int[] plusOne1(int[] digits) {
		int carry = 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			digits[i] += carry;
			
			if(digits[i] == 10) {
				digits[i] = 0;
				carry = 1;
			} else {
				carry = 0;
			}
		}
		
		if(carry == 1) {
			int [] result = new int[digits.length + 1];
			result[0] = 1;
			
			for (int i = 1; i < result.length; i++) {
				result[i] = digits[i-1];
			}
			
			return result;
		}
		return digits;
		
	}
}
