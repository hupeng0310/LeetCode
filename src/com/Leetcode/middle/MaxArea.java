package com.Leetcode.middle;

public class MaxArea {
    public int maxArea(int []height){
        int maxArea = 0;
        for(int i = 0;i < height.length -1;i++){
            for(int j = i+1;j < height.length;j++){
                int result = Integer.min(height[i],height[j])*(j-i);
                if(result > maxArea){
                    maxArea = result;
                }

            }
        }
        return maxArea;
    }
    public static void main(String args[]){
        System.out.println(new MaxArea().maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
