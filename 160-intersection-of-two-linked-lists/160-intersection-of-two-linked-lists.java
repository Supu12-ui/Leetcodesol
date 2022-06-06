/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;
        while(tempA!=tempB)
        {
            if(tempA.next==null && tempB.next!=null)
            {
                tempA=headB;
                tempB=tempB.next;
            }
            else if(tempB.next==null&&tempA.next!=null)
            {
                tempB=headA;
                tempA=tempA.next;
            }
            else
            {
                tempB=tempB.next;
                tempA=tempA.next;
            }
        }
        return tempA;
    }
}