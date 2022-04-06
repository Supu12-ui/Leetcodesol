// { Driver Code Starts
import java.util.*;

class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class Is_LinkedList_Palindrom
{
	 Node head;  
	 Node tail;
	
	/* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
 
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) 
	{

		if (head == null) 
		{
			head = node;
			tail = node;
		} else 
		{
		    tail.next = node;
		    tail = node;
		}
    }
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		 
		while(t>0)
        {
			int n = sc.nextInt();
			//int k = sc.nextInt();
			Is_LinkedList_Palindrom llist = new Is_LinkedList_Palindrom();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node head= new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
			    tail.next = new Node(a);
			    tail = tail.next;
			}
			
			Solution g = new Solution();
			if(g.isPalindrome(head) == true)
			    System.out.println(1);
		    else
			    System.out.println(0);
			t--;
		}
		
	}
}



// } Driver Code Ends


/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        if(head==null||head.next==null)
        {
            return true;
        }
        //Your code here
        int size=height(head);
        if(size%2==0)
        {
           Node slow=mid(head);
           Node dummy=reverse(slow);
           Node cur1=head;
           Node cur2=dummy;
           while(cur1!=null && cur2!=null)
           {
               if(cur1.data!=cur2.data)
               {
                   return false;
               }
               cur1=cur1.next;
               cur2=cur2.next;
           }
          
            
        }
        else
        {
          Node slow=mid(head);
          slow=slow.next;
         Node dummy= reverse(slow);
         Node cur1=head;
         Node cur2=dummy;
         while(cur1!=slow && cur2!=null)
         {
             if(cur1.data!=cur2.data)
             {
                 return false;
             }
             cur1=cur1.next;
             cur2=cur2.next;
         }
        }
        return true;
        
    }  
    
    Node mid(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(slow!=null && fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    int height(Node head)
    {
        int count=0;
        Node cur=head;
        while(cur!=null)
        {
            count++;
            cur=cur.next;
        }
        return count;
    }
    Node reverse(Node head)
    {
        if(head==null | head.next==null)
        {
            return head;
        }
        Node cur=head.next;
        Node prev=head;
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

