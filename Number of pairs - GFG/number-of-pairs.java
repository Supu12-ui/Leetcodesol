// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Main 
{
    	public static void main (String[] args) throws Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int g = 0;g < t;g++)
        {
            String[] str = (br.readLine()).trim().split(" ");
            int M = Integer.parseInt(str[0]);
            int N = Integer.parseInt(str[1]);
            
            int[] x = new int[M];
            str = (br.readLine()).trim().split(" ");
            for(int i = 0;i< M;i++)
                x[i] = Integer.parseInt(str[i]);
                
            str = (br.readLine()).trim().split(" ");
            int[] y = new int[N];
            for(int i = 0;i< N;i++)
            {
                y[i] = Integer.parseInt(str[i]);
                
            }
            System.out.println(new Solution().countPairs(x, y, M, N));
           
        }
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    // x[], y[]: input array elements
    // M, N: size of arrays x[] and y[] respectively
    //Function to count number of pairs such that x^y is greater than y^x.
    static long countPairs(int x[], int y[], int M, int N)
    {
        //count the number of 0 to 5 in y 
        int noofy[]=new int[5];
        for(int i=0;i<N;i++ )
        {
            if(y[i]<5)
            {
                noofy[y[i]]=noofy[y[i]]+1;
            }
        }
        Arrays.sort(y);
        long total=0;
        for(int i=0;i<M;i++)
        {
            total=total+count(x[i],y,N,noofy);
        }
        return total;
    }
    static int count(int x, int Y[], int n, int NoOfY[])
    {
        // If x is 0, then there cannot be any value in Y
        // such that x^Y[i] > Y[i]^x
        if (x == 0)
            return 0;
 
        // If x is 1, then the number of pairs is equal to
        // number of zeroes in Y[]
        if (x == 1)
            return NoOfY[0];
 
        // Find number of elements in Y[] with values
        // greater than x getting upperbound of x with
        // binary search
        int idx = Arrays.binarySearch(Y, x);
        int ans;
        if (idx < 0) {
            idx = Math.abs(idx + 1);
            ans = Y.length - idx;
        }
        else {
            while (idx < n && Y[idx] == x) {
                idx++;
            }
            ans = Y.length - idx;
        }
 
        // If we have reached here, then x must be greater
        // than 1, increase number of pairs for y=0 and y=1
        ans += (NoOfY[0] + NoOfY[1]);
 
        // Decrease number of pairs for x=2 and (y=4 or y=3)
        if (x == 2)
            ans -= (NoOfY[3] + NoOfY[4]);
 
        // Increase number of pairs for x=3 and y=2
        if (x == 3)
            ans += NoOfY[2];
 
        return ans;
    }
    static long count1(int x,int y[],int m,int noofy[])
    {
        if(x==0)
        {
            return 0;
        }
        if(x==1)
        {
            return noofy[0];
        }
        int idx=Arrays.binarySearch(y,x);
        int ans;
        if(idx<0) //if idx is less than 0 
        {
            idx=Math.abs(idx+1);
           ans=y.length-idx; 
        
        }
        else{
            while(idx<m && y[idx]==x)//keep incrementing the idx
            { //it doex't become greater
                idx++;
            }
            ans=y.length-idx;
        }
         ans+=noofy[0]+noofy[1];
        
        if(x==2)
        {
            ans-=noofy[3]+noofy[4];
        }
        if(x==3)
        {
            ans+=noofy[2];
        }
        return ans;
    }
}