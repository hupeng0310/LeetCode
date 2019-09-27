package com.algorithm.middle.addTwoNumber;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int val){
        this.val = val;
    }
    public ListNode(int val,ListNode listNode){
        this.val = val;
        this.next = listNode;
    }
    public String toString(){
        String str = "";
        ListNode copy = this;
        while(copy!= null){
            str += copy.val;
            copy= copy.next;
        }
        return str;
    }
}
