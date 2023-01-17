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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        HashMap<Integer,ListNode> hm=new HashMap<>();
        while(temp!=null)
        {
            if(hm.containsKey(temp.val))
            {
              ListNode temp1=hm.get(temp.val);
              temp1.next=temp.next;
                temp=temp1.next;
            }
            else
            {
                hm.put(temp.val,temp);
                temp=temp.next;
            }
        }
        return head;
    }
}