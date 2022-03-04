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
    int countTriplet(int a[], int n) {
        // code here
        int count=0;
        Arrays.sort(a);
        for(int i=n-1;i>=0;i--)
        {
            int start=0;
            int end=i-1;
            while(start<end)
            {
                int sum=(a[start]+a[end])-a[i];
                if(sum==0)
                {
                    count++;
                    start++;
                    end--;
                }
                else if((a[start]+a[end])>a[i])
                {
                    end--;
                }
                else
                {
                 start++;
                }
            }
        }
        return count;
    }
}