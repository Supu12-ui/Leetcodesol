// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args)throws IOException
	{

// 		Scanner in = new Scanner(System.in);
        
// 		int t = in.nextInt();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
         //testcases
        int t = Integer.parseInt(read.readLine());
		
		while(t-- >0)
		{
		    //size of array
		    int n = Integer.parseInt(read.readLine());
		    long[] arr= new long[n];
		    
		    String str[] = read.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0;i<n;i++)
		        arr[i] = Long.parseLong(str[i]);
		    
		    // StringBuffer sb = new StringBuffer();
		    
		    Solution ob = new Solution();
		    
		    //calling rearrange() function
		    ob.rearrange(arr, n);
		    StringBuffer sb = new StringBuffer();
		    
		    //appending and printing the elements
		    for(int i =0; i < n; i++)
		     sb.append(arr[i] + " ");
		    System.out.println(sb);
		}
	}
}



// } Driver Code Ends


class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
     long max_idx=n-1; //time complexity
     long min_idx=0;
     long max_ele=arr[n-1]+1;
     for(int i=0;i<n;i++)
     {
         if(i%2==0)
         {
             arr[i]=arr[i]+(arr[(int)max_idx]%max_ele)*max_ele;
             max_idx--;
         }
         else
         {
             arr[i]=arr[i]+(arr[(int)min_idx]%max_ele)*max_ele;
             min_idx++;
         }
        // System.out.println(arr[i]);
     }
     for(int i=0;i<n;i++)
     {
         arr[i]=arr[i]/max_ele;
     }
    }
    
}
// time complexity - o(n)
//space complexity - o(n)
//  public static void rearrange(long arr[], int n){
        
//       long ans[]=new long[n];
//       int start=0;
//       int end=n-1;
//       int i=0;
//       while(start<=end &&i<n)
//       {
//          ans[i]=arr[end];
//           end--;
//           i++;
//           if(i<arr.length)
//           {
//          ans[i]=arr[start];
//           start++;
//           i++;
//           }
//       }
//       for(int k=0;k<n;k++)
//       {
//           arr[k]=ans[k];
//       }
        
//     }
    


