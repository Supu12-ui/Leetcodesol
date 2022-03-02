// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

public class DriverClass
{
	public static void main(String args[]) 
	{
	   Scanner sc = new Scanner(System.in);
	   int t = sc.nextInt();
	   int range[];
	   while(t-- >0)
	   {
	     int n = sc.nextInt();
	     int k = sc.nextInt();
	     int arr[][] = new int[k][n];
	       for(int i = 0; i < k; i++)
	       {
	        for(int j = 0; j < n; j++)
	               arr[i][j] = sc.nextInt();
	       }
	       range = new Solution().findSmallestRange(arr, n, k);
	       System.out.println(range[0] + " " + range[1]);
	   }
	}
}
// } Driver Code Ends

class pair implements Comparable <pair>{
    int idx;
    int numidx;
    int val;
    pair(){}
    pair(int idx,int numidx,int val)
    {
        this.idx=idx;
        this.numidx=numidx;
        this.val=val;
    }
    public int compareTo(pair p)
    {
        return this.val-p.val;
    }
}

class Solution
{
	static int[] findSmallestRange(int[][] nums,int n,int k)
	{
	    PriorityQueue<pair> pq1=new PriorityQueue<>(); //min
        PriorityQueue<pair> pq2=new PriorityQueue<>(Collections.reverseOrder()); //max
        int low=0;
        int high=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            pair temp=new pair(i,0,nums[i][0]);
            pq1.add(temp);
            pq2.add(temp);
        }
        while(pq1.size()!=0)
        {
            pair temp1=pq1.remove();
            int min_val=temp1.val;
            pair temp2=pq2.peek();
            int max_val=temp2.val;
             int check=max_val-min_val;
            if(check<min)
            {
                min=check;
                low=min_val;
                high=max_val;
            }
            int new_idx=temp1.idx;
            int nidx=temp1.numidx;
            nidx=nidx+1;
            if(nidx<nums[new_idx].length)
            {
                int value=nums[new_idx][nidx];
                pair temp=new pair(new_idx,nidx,value);
                pq1.add(temp);
                pq2.add(temp);
            }
            else
            {
                break;
            }
            
            
        }
        int ar[]=new int[2];
        ar[0]=low;
        ar[1]=high;
        return ar;
        
    }
	}
