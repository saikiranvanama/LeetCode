import java.util.Arrays;

public class MaximumAverageSubarrayI {

	public static void main(String[] args) {
		double res = findMaxAverage(new int[] { 7, 0, 6, 4, 9, 6 }, 4);
		 res = maximumProduct(new int[] { 7, 0, 6, 4, 9, 6 });
		System.out.println(res);
	}

	public static int maximumProduct(int[] nums) {

		Arrays.sort(nums);
		int val1 = nums[nums.length - 1] * nums[nums.length -2] * nums[nums.length - 3];
		int val2 = nums[nums.length - 1] * nums[0] * nums[1];
		return val1 > val2 ? val1 : val2;
	}

	public static double findMaxAverage(int[] nums, int k) {

		double result = 0;
		double sum = 0;

		for (int i = 0; i < k; i++) {
			sum += nums[i];
		}

		result = sum / k;
		int fptr = k;
		int bptr = 0;

		while (fptr < nums.length) {
			sum -= nums[bptr++];
			sum += nums[fptr++];

			result = result < sum / k ? sum / k : result;
		}

		return result;
	}

}
