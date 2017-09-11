
public class JumpGame55 {
	public static void main(String[] args) {
		System.out.println(canJump(new int[] { 3, 2, 1, 1, 4 }));
	}

	public static boolean canJump(int[] nums) {

		int i = 0;
		
		while(i < nums.length) {
			if(nums[i] == 0) break;
			
			i += nums[i];
		}

		return i >= nums.length - 1;
		//		return jumpRec(nums, 0);

	}

	private static boolean jumpRec(int[] nums, int cur) {

		if (cur >= nums.length - 1)
			return true;

		if (nums[cur] == 0)
			return false;

		boolean res = false;

		int i = 1;
		while(!res && i < nums[cur]) {
			res = jumpRec(nums, cur + i);
		}
		
		if (!res)
			nums[cur] = 0;

		return res;
	}
}
