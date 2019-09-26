package com.algorithm.easy.reverse;

public class Reverse {
    private String reverse(String str){
        StringBuffer buffer = new StringBuffer();
        char []array = str.toCharArray();
        for(int i = array.length-1;i >= 0;i--){
            buffer.append(array[i]);
        }
        return buffer.toString();
    }
    public int reverse(int x){
        long num = x;
        if(num>=0){
            long newNum = Long.parseLong(reverse(Long.toString(num)));
            return newNum > Integer.MAX_VALUE?0:(int)newNum;
        }
        else {
            long result = -Long.parseLong(reverse(Long.toString(num).substring(1)));
            return result<Integer.MIN_VALUE?0:(int)result;
        }
    }

    public static void main(String[] args){
        System.out.println(new Reverse().reverse(-4536));
    }
}
