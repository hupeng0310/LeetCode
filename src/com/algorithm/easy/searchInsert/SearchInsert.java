package com.algorithm.easy.searchInsert;

class SearchInsert{
	public int searchInsert(int[] nums,int target){
		if(nums.length == 0){
			return -1;
		}
		for(int i = 0;i < nums.length;i++){
			if(nums[i] == target){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		System.out.println(new SearchInsert().searchInsert(new int[]{1,2,3,4,5},3));
	}
}
