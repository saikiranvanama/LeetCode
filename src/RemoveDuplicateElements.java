
public class RemoveDuplicateElements {

	public static void main(String[] args) {

	}

	public int removeDuplicates(int[] nums) {

		int count = nums.length > 0 ? 1 : 0;
		int bptr = 1;
		for (int i = 1; i < nums.length; i++) {
			if ((nums[i - 1] ^ nums[i]) != 0) {
				count++;
				nums[bptr++] = nums[i];
			}
		}

		return count;
	}

	public int removeElement(int[] nums, int val) {
		
		int bptr = 0;
		for (int i = 0; i < nums.length; i++) {
			
			if(nums[i] != val) {
				nums[bptr++] = nums[i];
			}
			
		}
		
		return bptr;
	}
}
