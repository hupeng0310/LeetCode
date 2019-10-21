package com.algorithm.middle.lengthOfLongestSubstring;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String str){
        int strLength =str.length();
        if(strLength <= 1){
            return strLength;
        }else {
            int left = 0;
            int right = 0;
            int maxLength = 0;
            while(right < strLength){
                for(int i = left;i< right;i++){
                    if(str.charAt(i) == str.charAt(right)){
                        left = i + 1;
                    }

                }
                if(right - left > maxLength){
                    maxLength = right - left;
                }
                right++;
            }
            return maxLength + 1;
        }
    }
    public static void main(String[] args){
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
        System.out.println(lengthOfLongestSubstring.lengthOfLongestSubstring("abba"));
    }
}
