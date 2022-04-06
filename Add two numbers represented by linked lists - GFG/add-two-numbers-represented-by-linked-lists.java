// { Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}
// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        first =reverse(first);
       second= reverse(second);
        Node dummy=new Node(-1);
        Node temp1=first;
        Node temp2=second;
        Node temp3=dummy;
        int carry=0;
        while(temp1!=null && temp2!=null)
        {
            int sum=temp1.data+temp2.data+carry;
            carry=sum/10;
            sum=sum%10;
            Node node=new Node(sum);
            temp3.next=node;
            temp3=temp3.next;
            temp1=temp1.next;
            temp2=temp2.next;
            
            
        }
        while(temp1!=null)
        {
            int sum=temp1.data+carry;
            carry=sum/10;
            sum=sum%10;
            Node node=new Node(sum);
            temp3.next=node;
            temp3=temp3.next;
            temp1=temp1.next;
            
        }
        while(temp2!=null)
        {
           int sum=temp2.data+carry;
            carry=sum/10;
            sum=sum%10;
            Node node=new Node(sum);
            temp3.next=node;
            temp3=temp3.next;
            temp2=temp2.next;  
        }
        if(carry==1)
        {
            Node node=new Node(carry);
            temp3.next=node;
            temp3=temp3.next;
        }
       dummy= reverse(dummy.next);
        return dummy;
    }
    static Node reverse(Node head)
    {
        if(head==null && head.next==null)
        {
            return head;
        }
        Node prev=head;
        Node cur=head.next;
        while(cur!=null)
        {
            Node temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        head.next=null;
        head=prev;
   
        
        return head;
        
    }
}