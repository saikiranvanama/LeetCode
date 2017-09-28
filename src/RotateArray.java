
public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void rotate(int[] nums, int k) {
		int [] res = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			int offset = (i + k)%nums.length;
			res[offset] = nums[i];
		}
		
		for (int i = 0; i < res.length; i++) {
			nums[i] = res[i];
		}
	}
}
