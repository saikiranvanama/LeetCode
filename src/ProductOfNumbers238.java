
public class ProductOfNumbers238 {

	public static void main(String[] args) {

	}

	public int[] productExceptSelf(int[] nums) {
		
		boolean isZero = false;
		int product = 1;
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != 0) product *= nums[i];
			else isZero = true;
		}
		
		for (int i = 0; i < nums.length; i++) {
			if(isZero) {
				if(nums[i] != 0) nums[i] = 0;
				else nums[i] = product;
			} else {
				nums[i] = product / nums[i];
			}
		}
		return nums;
	}

}
