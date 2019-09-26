package com.Leetcode.easy.twosum;

import java.util.Arrays;

public class TwoSum {
    //beginIndex表示二分后的数组[0]在原数组中的位置
    public static int[] towsum(int num,int []nums,int target,int beginIndex){
        int[] result;
        if(nums.length == 0){
            return new int[]{};
        }else {
            int half = nums.length/2;
            if (num + nums[half] == target) {
                return new int[]{num, beginIndex + half};
            } else if (num + nums[half] > target) {
                result = towsum(num, Arrays.copyOfRange(nums, 0, half), target, beginIndex);
            } else {
                result = towsum(num, Arrays.copyOfRange(nums, half + 1, nums.length), target, beginIndex + half + 1);
            }
        }
        return result;
    }
    public static int[] towsum(int[] nums,int target){
        Arrays.sort(nums);
        int[] result;
        for(int i = 0;i<nums.length;i++){
            if(i == nums.length-1){
                return new int[]{};
            }
            result = towsum(nums[i],Arrays.copyOfRange(nums,i+1,nums.length),target,i+1);
            if(result.length==0){
                continue;
            }else {
                return new int[] {i,result[1]};
            }
        }
        return new int[]{};
    }
    public static void main(String args[]) {
        System.out.println(Arrays.toString(towsum(new int[]{1,2,3,4,5,6},4)));
    }
}
