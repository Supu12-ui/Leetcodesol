// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> ans=new ArrayList<>();
        int index=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
            if(arr[i]==s)
            {
               ans.add(i+1);
                ans.add(i+1); 
                return ans;
            }
            while(sum>s && index<i-1)
            {
                sum=sum-arr[index];
                
                index++;
            }
            if(sum==s)
            {
                ans.add(index+1);
                ans.add(i+1);
                return ans;
            }
            
               
        }
        ans.add(-1);
        return ans;
        
        
        
        
        
        
        
        
        
        
        
        // Your code here
        // ArrayList<Integer> ans=new ArrayList<Integer>();
        // for(int i=0;i<n;i++)
        // {
        //     int sum=0;
            
        //   for(int j=i;j<n;j++)
        //   {
        //       sum=sum+arr[j];
        //       if(sum==s)
        //       {
        //           ans.add(i+1);
        //           ans.add(j+1);
        //           return ans;
        //       }
        //       else if(sum>s)
        //       {
        //           break;
        //       }
        //   }
        // }
        // ans.add(-1);
        // return ans;
    }
}