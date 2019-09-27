package com.algorithm.easy.searchInsert;

import java.util.Arrays;

class SearchInsert{
	private int indexOf = -0;
	public int searchInsert(int[] nums,int target){
		if(nums.length == 0){
			return 0;
		}else if(nums.length == 1){
			return target <= nums[0]?indexOf:indexOf+1;
		}else {
			int halfLength = nums.length / 2;
			if(target == nums[halfLength] || (target > nums[halfLength -1] && target < nums[halfLength])){
				return indexOf +halfLength;
			}else if(target < nums[halfLength]){
				return searchInsert(Arrays.copyOfRange(nums,0,halfLength-1),target);
			}else {
				indexOf += halfLength;
				return searchInsert(Arrays.copyOfRange(nums,halfLength,nums.length),target);
			}
		}
	}
	public static void main(String[] args){
		System.out.println(new SearchInsert().searchInsert(new int[]{1,3},-1));
	}
}
