/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
         if (node == null || node.next == null) {
        throw new IllegalArgumentException("Can't delete the last node or null node this way.");
    }

    node.val = node.next.val;
    node.next = node.next.next;

        
    }
}