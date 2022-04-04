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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode cur=head;
        int size=height(head);
         if(size<k)
         {
             return null;
         }
        ListNode left=search(cur,k-1);
        ListNode right=search(cur,size-k);
        int temp=left.val;
        left.val=right.val;
        right.val=temp;
        return head;
        
    }
    ListNode search(ListNode head,int k)
    {
        ListNode temp=head;
        while(k!=0&&temp!=null)
        {
            k--;
            temp=temp.next;
            
        }
        return temp;
    }
    int height(ListNode head)
    {
        int count=0;
        ListNode cur=head;
        while(cur!=null)
        {
            count++;
            cur=cur.next;
        }
        return count;
    }
}