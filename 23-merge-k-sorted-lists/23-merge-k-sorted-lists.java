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
    public ListNode mergeKLists(ListNode[] arr) {
        
       
        ListNode dummy=new ListNode(-1);
     ListNode head=dummy;
     PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);
    for(ListNode l:arr)
    {
        if(l!=null)
        {
        pq.add(l);
        }
    }
     while(pq.size()>0)
     {
        ListNode temp=pq.remove();
          head.next=temp;
          head=head.next;
          temp=temp.next;
         if(temp!=null)
         {
            
             pq.add(temp);
         }
         
     }
     return dummy.next;
    }
    }
