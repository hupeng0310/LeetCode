package com.algorithm.easy.removeElement;

import java.util.Arrays;

public class RemoveElement {
    //慢指针
    int i = 0;
    public int removeElement(int[] nums,int val){
        //j为快指针，不断移动，i指针会在停留在i == val的位置
        for(int j = 0;j<nums.length;j++){
            System.out.println("loop");
            if(nums[j] != val){
                if(i != j) {
                    nums[i] = nums[j];
                }
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args){
        int []nums = new int[]{1,2,3,3,4,5,4};
        System.out.println(new RemoveElement().removeElement(nums,3));
        System.out.println(Arrays.toString(nums));
    }
}
