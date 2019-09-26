package com.Leetcode.easy.valid;

import java.util.Stack;

public class Valid {
    private char getTargetChar(char c){
        switch (c){
            case '(' :
                return ')';
            case ')' :
                return '(';
            case '[' :
                return ']';
            case ']' :
                return '[';
            case '{' :
                return '}';
            case '}' :
                return '{';
            default:
                return ' ';
        }
    }

    public boolean isValid(String s){
        if(s.length()%2!=0){
            return false;
        }else if(s.length() == 0){
            return true;
        }else {
            Stack<Integer> target = new Stack<Integer>();
            for(int i = 0;i < s.length();i++){
                if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                    target.push(i);
                }else {
                    if(target.empty()){
                        return false;
                    }else if(s.charAt(i) == getTargetChar(s.charAt(target.peek()))) {
                        target.pop();
                    }
                }
            }
            return target.empty();
        }
    }
    public static void main(String[] args){
        System.out.println(new Valid().isValid("{}{{}}"));
    }
}
