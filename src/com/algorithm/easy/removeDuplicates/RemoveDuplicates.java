package com.algorithm.easy.removeDuplicates;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i :nums){
            set.add(i);
        }
        Integer[] array = new Integer[set.size()];
        array = set.toArray(array);
        Arrays.sort(array);
        for(int i = 0;i < array.length; i++){
            nums[i] = array[i];
        }
        return set.size();
    }
    public static void main(String[] args){
        int[] nums = new int[]{-3,-1,0,0,0,3,3,0,0};
        System.out.println(new RemoveDuplicates().removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
