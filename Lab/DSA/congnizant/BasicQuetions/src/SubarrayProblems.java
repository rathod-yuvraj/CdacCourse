
public class SubarrayProblems {
	
//	1. Find minimum subArray sum
	public static int minSubarraySum(int[] nums) {
		if(nums.length==0) {
			return 0;

		}
		int minEnd=nums[0];
		int minSoFar=nums[0];
		for(int i=1;i<nums.length;i++) {
			minEnd=Math.min(nums[i],minEnd+nums[i]);
			minSoFar=Math.min(minSoFar, minEnd);
		}
		
		return minSoFar;
	}

	public static void main(String[] args) {
		

	}

}
