// { Driver Code Starts
import java.util.*;



class Get_Min_From_Stack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			GfG g = new GfG();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
					//System.out.println(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
		
	}
}


// } Driver Code Ends


class GfG
{
    int minEle;
    Stack<Integer> s;

    /*returns min element from stack*/
    public GfG()
    {
        this.s=new Stack<>();
    }
    int getMin()
    {
       if(s.size()==0)
       {
           return -1;
       }
       return minEle;
       
     }
    
    /*returns poped element from stack*/
    int pop()
    {
        
      if(s.size()==0)
      {
          return -1;
      }
      int ans=s.pop();
      if(minEle>ans)
      {
          int val=minEle;
         int ans1=2*minEle-ans;
         minEle=ans1;
        return val;
      }
      else
      {
	 return ans;
      }
	
	
    }

    /*push element x into the stack*/
    void push(int x)
    {
     if(s.size()==0)
     {
         s.push(x);
         minEle=x;
     }
     else if(x<minEle)
     {
         int ans=x*2-minEle;
         minEle=x;
         s.push(ans);
     }
     else
     {
        s.push(x); 
     }
    }	
}

