class Solution {
    public int[] sortArray(int[] nums) {
       heapSort(nums,nums.length);
        return nums;
    }
    void buildHeap(int arr[], int n)
    {
        // Your code here
        for(int i=(n/2)-1;i>=0;i--)
        {
            heapify(arr,n,i);
        }
    }
 
    //Heapify function to maintain heap property.
    void heapify(int arr[], int n, int i)
    {
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<n && arr[left]>arr[largest])
        {
            largest=left;
        }
        if(right<n && arr[right]>arr[largest])
        {
            largest=right;
        }
        if(largest!=i)
        {
            int temp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;
            heapify(arr,n,largest);
        }
    }
    void swap(int arr[],int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
    //Function to sort an array using Heap Sort.
    public void heapSort(int arr[], int n)
    {
        buildHeap(arr,n);
      for(int i=n-1;i>0;i--)
      {
        swap(arr,i,0);
      heapify(arr,i,0);
        
      }
    }
 }
    
