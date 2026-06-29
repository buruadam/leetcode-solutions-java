package easy;

import common.ListNode;

public class ReverseLinkedList {
    // 1. Iterative solution
    public ListNode reverseListIterative(ListNode head) {
        ListNode prevNode = null;

        while (head != null) {
            ListNode nextNode = head.next;
            head.next = prevNode;
            prevNode = head;
            head = nextNode;
        }
        return prevNode;
    }

    // 2. Recursive solution
    public ListNode reverseListRecursive(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
