package com.Leetcode.easy.palindrome;

public class Palindrome {
    public int[] getArray(int x){
        int[] array = new int[11];
        for(int i = 0;i < 11;i++){
            if((x % Math.pow(10,i)) != x){
                if(i == 0){
                    array[i] = x % 10;
                }
                else {
                    array[i] = (int)(x % Math.pow(10,i+1)/Math.pow(10,i));
                }
            }else{
                array[10] = i;
                break;
            }
        }
        return array;
    }
    public boolean isPalindrome(int x){
        if(x > 0){
            int[] array = getArray(x);
            for(int i  = 0;i < (array[10])/2+1;i++){
                if(array[i] != array[(array[10])-i-1]){
                    return false;
                }
            }
            return true;
        }else if(x == 0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String args[]){
        System.out.println(new Palindrome().isPalindrome(12221));
    }
}
