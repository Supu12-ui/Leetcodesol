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
    public ListNode reverseList(ListNode head) {
     ListNode prev=null;
        ListNode second = head;
        while(second!=null)
        {
         ListNode temp=second.next;
        second.next=prev;
            prev=second;
         second=temp;
           
        }
        head=prev;
      return head;  
    }
}