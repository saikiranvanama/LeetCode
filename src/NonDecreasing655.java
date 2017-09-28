
public class NonDecreasing655 {

	public static void main(String[] args) {
		
		//[4,2,1] [3,4,2,3]
		boolean result = checkPossibility(new int[] { -1, 4, 2, 3 });
		System.out.println(result);
	}

	public static boolean checkPossibility(int[] nums) {

		int count = 0;
		int i;
		for (i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				count++;
				if (nums[i + 1] > nums[i - 1]) nums[i] = nums[i - 1];
			}
		}
		
		if(i == nums.length -1 && i - 1 >= 0 && nums[i - 1] > nums[i]) count++; 

		if (count > 1)
			return false;

		return true;
	}
	
	public boolean checkPossibility1(int[] nums) {
        int n = nums.length, count = 0;
        
        for (int i = 0; i + 1 < n; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
                if (i > 0 && nums[i + 1] < nums[i - 1]) nums[i + 1] = nums[i];
                else nums[i] = nums[i + 1];
            }
        }
            
        return count <= 1;
    }
}
