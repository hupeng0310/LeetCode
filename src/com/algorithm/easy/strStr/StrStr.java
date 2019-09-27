package com.algorithm.easy.strStr;

public class StrStr {
    public int strStr(String haystack, String needl){
        for(int i = 0;i <= haystack.length() - needl.length();i++){
            if(haystack.substring(i, i + needl.length()).equals(needl)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println(new StrStr().strStr("Hello World","World"));
    }
}
