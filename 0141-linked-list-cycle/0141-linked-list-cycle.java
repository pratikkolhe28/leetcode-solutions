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
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if (head == null || head.next == null) {
            return false;
        }
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
            return true;
        }

        return false;
    }
}

// public boolean hasCycle(ListNode head) {
//         ListNode temp = head;
//         Map<ListNode, Integer> map = new HashMap<>();

//         while(temp != null) {
//             if(map.containsKey(temp)) {
//                 return true;
//             }

//             map.put(temp, 1);
//             temp = temp.next;
//         }
//         return false;
//     }