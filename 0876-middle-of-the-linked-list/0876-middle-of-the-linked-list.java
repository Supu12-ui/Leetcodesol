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
    public ListNode middleNode(ListNode head) {
       ListNode start=head;
        ListNode end=head;
        if(head==null)
        {
            return null;
        }
        while(end!=null && end.next!=null)
        {
            start=start.next;
            end=end.next.next;
        }
        return start;
    }
}