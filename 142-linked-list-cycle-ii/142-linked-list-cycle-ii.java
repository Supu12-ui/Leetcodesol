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
        if(head==null||head.next==null)
        {
            return null;
        }
        
        ListNode slow=head;
        ListNode fast=head;
        while(slow!=null && fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                break;
            }
            
        }
        System.out.println(slow.val);
        if(fast==null||slow==null)
        {
            return null;
        }
       ListNode temp=fast;
        fast=head;
        while(slow!=null && fast!=null)
        {
            if(slow==fast)
            {
                return slow;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return null;
        
    }
}