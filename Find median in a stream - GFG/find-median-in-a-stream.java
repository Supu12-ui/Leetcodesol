// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;


class GFG
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        int n;
        while(t-- > 0){
            n = sc.nextInt();
    
            Solution obj = new Solution();
            for(int i = 1; i <= n; i++)
            {
                int x =sc.nextInt();
                obj.insertHeap(x);
                System.out.println((int)Math.floor(obj.getMedian()));
            }
        }
        
        
    }
}

// } Driver Code Ends


class Solution
{
    //Function to insert heap.
 static   PriorityQueue<Integer> max=new PriorityQueue<>(Comparator.reverseOrder());
  static   PriorityQueue<Integer> min=new PriorityQueue<>(); 
    public static void insertHeap(int num)
    {
       if(max.size()==0)
        {
            max.add(num);
        }
        else if(max.peek()>=num)
        {
            max.add(num);
            if((max.size()+min.size())%2==0)
            {
               int val=max.remove();
                min.add(val);
            }
        }
        else if(max.peek()<num)
        {
            min.add(num);
            if(max.size()<min.size())
            {
                int val1=min.remove();
                max.add(val1);
            }
            
        }
    }
    
    //Function to balance heaps.
    public static void balanceHeaps()
    {
       // add your code here
       
    }
    
    //Function to return Median.
    public static double getMedian()
    {
         if(max.size()==1 && min.size()==0)
        {
            return max.peek();
        }
        if((max.size()+min.size())%2==0)
        {
            int sum1=max.peek();
            int sum2=min.peek();
           // System.out.println(sum1+" "+sum2);
            double val=sum1+sum2;
            return val/2;
        }
        else 
        {
            return max.peek();
        }
            
    }
    
}