// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

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

class Driverclass
{
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().segregate(head);
		     printList(head);
		    System.out.println();
        }
    }
    
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}



// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        Node zero=new Node(-1);
        Node temp1=zero;
        Node one=new Node(-1);
        Node temp2=one;
        Node two=new Node(-1);
        Node temp3=two;
        Node cur=head;
        while(cur!=null)
        {
            if(cur.data==0)
            {
                Node node=new Node(0);
                temp1.next=node;
                temp1=temp1.next;
            }
            else if(cur.data==1)
            {
                 Node node=new Node(1);
                temp2.next=node;
                temp2=temp2.next;
            }
            else
            {
                 Node node=new Node(2);
                temp3.next=node;
                temp3=temp3.next;
            }
            cur=cur.next;
        }
        Node zero1=zero;
        while(zero1.next!=null)
        {
            zero1=zero1.next;
        }
        if(one.next!=null)
        {
        zero1.next=one.next;
        zero1=zero1.next;
         one.next=null;
        }
        while(zero1.next!=null)
        {
            zero1=zero1.next;
        }
         if(two.next!=null)
        {
           zero1.next=two.next;
           zero1=zero1.next;
           two.next=null;
        }
       return zero.next;
        
        
        
    }
}


