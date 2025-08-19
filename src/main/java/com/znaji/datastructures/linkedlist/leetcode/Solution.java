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

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = dummy;
        ListNode current = head;
        while (current != null) {
            if (current.val == val) {
                p.next = current.next;
                ListNode next = current.next;
                current.next = null;
                current = next;
            } else {
                p = current;
                current = current.next;
            }
        }
        return dummy.next;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null)? l1.val : 0;
            int val2 = (l2 != null)? l2.val : 0;
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dummy.next;
    }

        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            int sizeA = getListSIze(headA);
            int sizeB = getListSIze(headB);
            int diff  = sizeA - sizeB;
            if (diff > 0) {
                headA = advance(headA, diff);
            } else {
                headB = advance(headB, -diff);
            }
            while (headA != null) {
                if (headA == headB) return headA;
                headA = headA.next;
                headB = headB.next;
            }
            return null;
        }

        private ListNode advance(ListNode head, int diff) {
            for (int i = 0; i < diff; i++) {
                head = head.next;
            }
            return head;
        }

        private int getListSIze(ListNode head) {
            int size = 0;
            while (head != null) {
                size++;
                head = head.next;
            }
            return size;
        }

}
