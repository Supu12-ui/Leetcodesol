// { Driver Code Starts
import java.util.*;


 // } Driver Code Ends


class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        if(size==1)
        {
            return 1;
        }
        
        int max=0;
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<size;i++)
        {
            if(arr[i]>0)
            {
                max=Math.max(arr[i],max);
                min=Math.min(arr[i],min);
            }
        }
        if(min>1)
        {
            return 1;
        }
        int temp[]=new int[max-min+1];
        for(int i=0;i<size;i++)
        {
            if(arr[i]>0)
            {
                int index=arr[i]-min;
                temp[index]=temp[index]+1;
            }
        }
        
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i]==0)
            {
                return min+i;
            }
        }
        return max+1;
    }
}


// { Driver Code Starts.

class Main
{   
    public static void main (String[] args) 
    {

		Scanner sc=new Scanner(System.in);
		
        //taking testcases
		int t=sc.nextInt();
		while(t-->0){
		    
		    //input number n
			int n=sc.nextInt();
			int[] arr=new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
				
			Solution obj = new Solution();
			
			//calling missingNumber()
			int missing = obj.missingNumber(arr,n);
			System.out.println(missing);
		}
    }
}

  // } Driver Code Ends