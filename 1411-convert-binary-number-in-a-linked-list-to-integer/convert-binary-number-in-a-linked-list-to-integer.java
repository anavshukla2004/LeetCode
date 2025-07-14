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
    public int getDecimalValue(ListNode head) {
        int count =0;
        ListNode temp=head;
        while(temp!=null){count++; temp=temp.next;}
        int idx = count-1;
        int result=0;
        for(int i=idx; i>=0; i--){
            result+=head.val * (int)(Math.pow(2,i));
            head=head.next;
        }
        return result;
    }
}