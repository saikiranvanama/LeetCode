import java.util.Arrays;

public class NewFile2 {

	public static void main(String[] args) {

	}

	public static int findUnsortedSubarray(int[] nums) {
		
		int [] dup = Arrays.copyOf(nums, nums.length);
		
		Arrays.sort(nums);
		
		int fptr = 0;
		int bptr = nums.length - 1;
		
		while(nums[fptr] == dup[fptr]) fptr++;
		
		while(nums[bptr] == dup[bptr]) bptr--;
		
		if(bptr < fptr) return 0;
		
		return bptr-fptr + 1;
	}

}
