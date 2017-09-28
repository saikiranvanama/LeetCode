package DynamicProgramming;

public class Fibonacci {

	public static void main(String[] args) {
		
		int result = fibonaccie2(10);
		String sai = "      sai   ";
		System.out.println(sai);
		System.out.println(result);
	}

	private static int fibonaccie(int i) {
		if(i < 2) return i;
		return fibonaccie(i-1) + fibonaccie(i-2);
	}
	
	private static int fibonaccie2(int i) {
		
		int one = 0;
		int two = 1;
		int res = i == 1 ? 0 : i == 2 ? 1 : -1;
		for (int j = 2; j <=  i; j++) {
			res = one + two;
			one = two;
			two = res;
			
			System.out.println(res + " " + j);
		}
		
		return res;
	}
		

	
}
