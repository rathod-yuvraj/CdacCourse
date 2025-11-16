package com.yuvraj.demo.arrays;

public class MaxSubArray {
	public static int KadaneAlogrith(int[] nums) {
		if(nums.length==0) return 0;
		int maxEnd=nums[0];
		int maxSoFar=nums[0];
		
		for(int i=1; i<nums.length; i++) {
			maxEnd=Math.max(nums[i],maxEnd+nums[i]);
			maxSoFar=Math.max(maxSoFar, maxEnd);
			
		}
		return maxSoFar;
		
	}
	public static void main(String[] args) {
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(KadaneAlogrith(arr));
		
	}

}
