// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int ans[]=new int[2];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            max=Math.max(arr[i],max);
            min=Math.min(arr[i],min);
        }
        if(max-min==0)
        {
          ans[0]=max;
          if(min==1)
          {
              ans[1]=2;
          }
          else
          {
              ans[1]=max-1;
          }
          return ans;
        }
        int temp[]=new int[max-min+1];
        for(int i=0;i<n;i++)
        {
            int index=arr[i]-min;
            temp[index]=temp[index]+1;
        }
        
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i]==0)
            {
                ans[1]=i+1;
                break;
            }
           
        }
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i]>1)
            {
                ans[0]=min+i;
                break;
            }
           
        }
        if(min-1==0 &&ans[1]==0)
        {
            ans[1]=n;
        }
        else if(min-1!=0&&ans[1]==0)
        {
            ans[1]=min-1;
        }
        
        return ans;
    }
}