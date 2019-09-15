package com.Leetcode.twosum;

import java.util.Arrays;

public class TwoSum {
    public static int[] towsum(int[] nums,int target){
        for(int i = 0;i < nums.length;i++){
            for(int j = i+1;j < nums.length;j++){
                if(nums[i] + nums [j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String args[]){
        System.out.println(Arrays.toString(towsum(new int[]{1,2,3,4,5},4)));
    }
}
