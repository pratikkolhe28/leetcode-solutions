/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode temp = head;
        int length = 0;

        while(temp != null) {
            length++;
            temp = temp.next;
        }

        ListNode slow = head;
        ListNode fast = head;

        k = k % length;

        if (k == 0) {
            return head;
        }

        while(k > 0) {
            fast = fast.next;
            k--;
        }

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode newHead = slow.next;
        slow.next = null;

        fast.next = head;
        return newHead;

    }
}