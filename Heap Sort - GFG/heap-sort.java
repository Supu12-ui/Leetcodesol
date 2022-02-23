// { Driver Code Starts
import java.util.*;
class Heap_Sort
{
    void printArray(int arr[],int n)
    {
        //int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        Heap_Sort hs = new Heap_Sort();
        int arr[] = new int[1000000];
        int T = sc.nextInt();
        while(T>0)
        {
            int n = sc.nextInt();
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
                
            Solution ob=new Solution();
            ob.heapSort(arr,n);
            hs.printArray(arr,n);
            T--;
        }
    }
    
}


// } Driver Code Ends


class Solution
{
    //Function to build a Heap from array.
    void buildHeap(int nums[], int n)
    {
       int st=(n/2)-1;
        for(int i=st;i>=0;i--)
        {
            heapify(nums,n,i);
        }
    }
 
    //Heapify function to maintain heap property.
    void heapify(int nums[], int n, int i)
    {
         int parent=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<n && nums[left]>nums[parent])
        {
            parent=left;
        }
        if(right<n && nums[right]>nums[parent])
        {
            parent=right;
        }
        if(parent!=i)
        {
            int temp=nums[i];
            nums[i]=nums[parent];
            nums[parent]=temp;
            heapify(nums,n,parent);
        }
    }
    
    //Function to sort an array using Heap Sort.
    public void heapSort(int nums[], int n)
    {
      buildHeap(nums,n);
      for(int i=n-1;i>0;i--)
        {
            
            int temp=nums[0];
            nums[0]=nums[i];
            nums[i]=temp;
            heapify(nums,i,0);
         
           
        }
  
    }
 }
 
 
