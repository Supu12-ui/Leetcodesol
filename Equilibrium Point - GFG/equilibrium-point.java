// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}// } Driver Code Ends


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        
       int low=0;
       int high=n-1;
       int left_sum=0;
       int right_sum=0;
        int mid=(low+high)/2;
       for(int i=0;i<mid;i++)
       {
         left_sum+=arr[i];
       }
        for(int i=mid+1;i<n;i++)
       {
         right_sum+=arr[i];
       }
        if(right_sum>left_sum)
        {
            while(right_sum>left_sum && mid<n)
            {
                right_sum-=arr[mid+1];
                left_sum+=arr[mid];
                mid++;
            }
        }
        else
        {
            while(left_sum>right_sum && mid>0)
            {
                left_sum-=arr[mid-1];
                right_sum+=arr[mid];
                mid--;
            }
        }
        if(left_sum==right_sum)
        {
            return mid+1;
        }
        return -1;
    }
}
