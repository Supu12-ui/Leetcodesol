// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long merge(long arr[],int l,int mid,long r){
        long inversionCtn=0;
        long[]left=Arrays.copyOfRange(arr,l,mid+1);
        long[]right=Arrays.copyOfRange(arr,mid+1,(int)r+1);
        int i=0,j=0,k=l;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                arr[k]=left[i++];
            }
            else{
                arr[k]=right[j++];
                inversionCtn+=left.length-i;
            } 
            k++;
        }
        
        while(i<left.length) arr[k++]=left[i++];
        
        while(j<right.length) arr[k++]=right[j++];
        
        return inversionCtn;
    }
    static long merge_sort(long arr[],int l,long r){
        long inversionCtn=0;
        if(l<r){
            int mid=(l+(int)r)/2;
            inversionCtn+=merge_sort(arr,l,mid);
            inversionCtn+=merge_sort(arr,mid+1,r);
            inversionCtn+=merge(arr,l,mid,r);
        }
        return inversionCtn;
    }
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        return merge_sort(arr,0,N-1);
    }
}