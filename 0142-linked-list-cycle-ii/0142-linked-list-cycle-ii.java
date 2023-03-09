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
    if(head==null || head.next==null)
    {
        return null;
    }
    ListNode slow=head;
    ListNode fast=head;
    while(slow!=null&&fast!=null&&fast.next!=null)
    {
        fast=fast.next.next;
        slow=slow.next;
        if(slow==fast)
        {
            break;
        }
    }
    if(slow==null||fast==null)
    {
        return null;
    }
    fast=head;
    while(fast!=null&&slow!=null)
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