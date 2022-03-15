// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            int n = Integer.parseInt(read.readLine());
            String input[] = read.readLine().split(" ");
            
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.countTriplet(arr, n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int countTriplet(int arr[], int n) {
        // code here
        int start=0;
        Arrays.sort(arr);
         
       // int end=n-1;
        int count=0;
        for(int end=n-1;end>1;end--)
        {
            start=0;
            int cur=end-1;
            while(start<cur)
            {
                int sum=arr[start]+arr[cur];
                if((sum-arr[end])==0)
                {
                  count++; 
                  start++;
                 cur--;
                }
                else if(sum<arr[end])
                {
                    start++;
                }
                else
                {
                    cur--;
                }
                
            }
        }
        return count;
    }
}