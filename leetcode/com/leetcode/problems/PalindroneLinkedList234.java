package com.leetcode.problems;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution234 {
    public boolean isPalindrome(ListNode head) {

        if(head==null)
        {
            return true;
        }
        ListNode tail = new ListNode();
        ListNode p = head;
        tail.val = head.val;
        tail.next = null;
        while (p.next != null)
        {
            p = p.next;
            ListNode q = new ListNode(p.val, p.next);
            q.next = tail;
            tail = q;
        }



        p = head;
        while (tail!=null&&p!=null)
        {
            if(p.val!=tail.val)
            {
                return false;
            }
            tail = tail.next;
            p = p.next;
        }
        return true;
    }
}

public class PalindroneLinkedList234 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode p1 = new ListNode(2);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(1);

        head.next = p1;
        p1.next = p2;
        p2.next = p3;


        Solution234 s = new Solution234();
        boolean palindrome = s.isPalindrome(head);
        System.out.println(palindrome);
    }
}
