package com.algorithm.middle.addTwoNumber;

public class AddTwoNumber {
    //carry表示值相加之后的进位
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode l0 = new ListNode(0);
        ListNode carry = l0,copy = l0;
        l0.val = l1.val +l2.val;
        if(l1.next != null && l2.next != null){
            l0.next = addTwoNumbers(l1.next,l2.next);
        }
        if(l1.next == null && l2.next != null){
            l1.next = new ListNode(0);
            l0.next = addTwoNumbers(l1.next,l2.next);
        }
        if(l1.next != null && l2.next ==null){
            l2.next = new ListNode(0);
            l0.next = addTwoNumbers(l1.next,l2.next);
        }
        while (carry != null){
            if(carry.val >9){
                if(carry.next == null){
                    carry.next = new ListNode(0);
                }
                carry.next.val += carry.val /10;
                carry.val %= 10;
            }
            carry = carry.next;
        }
        return copy;
    }
    public static void main(String[] args){
        ListNode listNode = new ListNode(2,new ListNode(4,new ListNode(3)));
        ListNode listNode1 = new ListNode(5,new ListNode(6,new ListNode(4)));
        ListNode listNode2 = new ListNode(5,new ListNode(1));
        ListNode listNode3 = new ListNode(5);
        System.out.println(listNode.toString());
        System.out.println(listNode1.toString());
        ListNode result = new AddTwoNumber().addTwoNumbers(listNode,listNode1);
        System.out.println(result.toString());
    }
}
