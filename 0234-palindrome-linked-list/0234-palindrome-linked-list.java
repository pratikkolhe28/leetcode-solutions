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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        ListNode temp = slow;
        ListNode prev = null;

        while(temp != null) {
            ListNode front = temp.next;            
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        ListNode h1 = head;
        ListNode h2 = prev;

        while(h2 != null) {
            if(h1.val != h2.val) {
                return false;
            }

            h1 = h1.next;
            h2 = h2.next;
        }

        return true;
    }
}

// ListNode temp = head;
//         ArrayList<Integer> values = new ArrayList<>();

//         while(temp != null) {
//             values.add(temp.val);
//             temp = temp.next;
//         }

//         int left = 0;
//         int right = values.size() - 1;

//         while(left < right) {
//             if(!values.get(left).equals(values.get(right))) {
//                 return false;
//             }

//             left++;
//             right--;
//         }

//         return true;