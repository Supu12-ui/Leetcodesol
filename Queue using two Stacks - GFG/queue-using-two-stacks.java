// { Driver Code Starts
import java.util.*;
import java.util.Stack;
import java.util.LinkedList;



class GfG
{
	public static void main(String args[])
	{
	    //Taking input using class Scanner
		Scanner sc = new Scanner(System.in);
		
		//Taking input the number of testcases
		int t = sc.nextInt();
		while(t>0)
		{
		    //Creating a new object of class StackQueue
			StackQueue g = new StackQueue();
			
			//Taking input the total number of Queries
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryTyoe = sc.nextInt();
				
				//If QueryTyoe is 1 then
				//we call the Push method
				//of class StackQueue
				//else we call the Pop method
				if(QueryTyoe == 1)
				{
					int a = sc.nextInt();
					g.Push(a);
				}else
				if(QueryTyoe == 2)
				System.out.print(g.Pop()+" ");
			q--;
				
			}
			System.out.println();
		t--;
		}
	}
}

// } Driver Code Ends


class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
	  if(s1.size()==0)
	  {
	      s1.push(x);
	  }
	  else
	  {
	      while(s1.size()>0)
	      {
	          int val=s1.pop();
	          s2.push(val);
	          
	      }
	      s1.push(x);
	      while(s2.size()>0)
	      {
	          int val=s2.pop();
	          s1.push(val);
	      }
	  }
	  
    }
	
    
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
	   if(s1.size()==0)
	   {
	       return -1;
	   }
	   else
	   {
	     int val=s1.pop();
	     return val;
	   }
    }
}
