package com.algorithm.easy.plusOne;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] arr){
        //进位指示器
        boolean carry = true;
        //扩容指示器
        boolean expansion = false;
        for(int i = arr.length - 1;i >= 0 && carry;i--){
            if (arr[i] == 9) {
                if(i == 0){
                    expansion = true;
                }
                arr[i] = 0;
            } else {
                arr[i]++;
                carry = false;
            }
        }
        if(expansion){
            int [] arrCopy = new int[arr.length+1];
            for(int i = 0;i < arr.length;i++){
                arrCopy[i+1] = arr[i];
            }
            arrCopy[0] = 1;
            return arrCopy;
        }else {
            return arr;
        }
    }
    public static void main(String[] args){
        int[] arr = new int[]{9,5};
        System.out.println(Arrays.toString(new PlusOne().plusOne(arr)));
    }
}
