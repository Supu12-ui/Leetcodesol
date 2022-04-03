// { Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class ReverseInSize
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail =tail.next;
            }
            
            int k = sc.nextInt();
            Solution ob = new Solution();
            Node res = ob.reverse(head, k);
            printList(res);
            System.out.println();
        }
    }
    
    public static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
}

// } Driver Code Ends


/*node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution
{
    public static Node reverse(Node node, int k)
    {
        //Your code here
        Node dummy=rev(node,k);
        return dummy;
    }
   static Node rev(Node root,int k)
    {
        if(root==null)
        {
            return null;
        }
        Node prev=null;
        Node cur=root;
        Node temp1=null;
       int count=0;
        
        while(count<k&&cur!=null)
        {
           temp1=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp1;
            count++;
        }
        if(temp1!=null)
        {
            root.next=rev(temp1,k);
        }
        return prev;
         
      
    }
    static int height(Node node)
    {
        Node cur=node;
        int count=0;
        while(cur!=null)
        {
            cur=cur.next;
            count++;
        }
        return count;
    }
}

