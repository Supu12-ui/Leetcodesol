// { Driver Code Starts
import java.util.*;
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
} 

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int a = sc.nextInt();
            Node head = new Node(a);
            Node tail = head;
            
            for (int i=0; i<n-1; i++)
            {
                a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }
            
            int k = sc.nextInt();
            
            Solution ob = new Solution();
            head = ob.rotate(head,k);
            printList(head);
        }
    }
    
    public static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
}
// } Driver Code Ends


/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        Node dummy;
        int h=height(head);
        if(k>=h||k==0)
        {
            return head;
        }
        else
        {
            k=k-1;
            Node temp=head;
            while(k!=0)
            {
                temp=temp.next;
                k--;
            }
            
            Node cur=temp.next;
            dummy=new Node(cur.data);
            cur=cur.next;
            Node prev=dummy;
            while(cur!=null)
            {
              prev.next=new Node(cur.data);
              cur=cur.next;
              prev=prev.next;
            }
            Node temp1=head;
            while(temp1!=temp.next)
            {
                prev.next=new Node(temp1.data);
                prev=prev.next;
                temp1=temp1.next;
            }
        }
        return dummy;
    }
    public int height(Node head)
    {
       if(head==null)
       {
           return 0;
       }
      
       int rec=height(head.next);
       rec=rec+1;
       return rec;
       
    }
}
