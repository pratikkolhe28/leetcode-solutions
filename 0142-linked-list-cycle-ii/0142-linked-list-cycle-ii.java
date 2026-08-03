/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if(head == null || head.next == null) {
            return null;
        }

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                slow = head;

                while(slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;
            }
        }

        return null;
    }
}


// ListNode temp = head;
//         Map<ListNode, Integer> map = new HashMap<>();

//         while(temp != null) {
//             if(map.containsKey(temp)) {
//                 return temp;
//             }

//             map.put(temp, 1);
//             temp = temp.next;
//         }
        
//         return null;