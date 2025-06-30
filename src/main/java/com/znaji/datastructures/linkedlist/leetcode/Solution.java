package com.znaji.datastructures.linkedlist.leetcode;

public class Solution {

    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode start = head;
        ListNode reverse = reverse(slow);
        while (reverse != null) {
            if (reverse.val != start.val) return false;
            reverse = reverse.next;
            start = start.next;
        }
        return true;
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null ) return head;
        ListNode ode = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;

        while (even != null && even.next != null) {
            ode.next = even.next;
            ode = ode.next;
            even.next = ode.next;
            even = even.next;
        }
        ode.next = evenHead;
        return head;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

}
