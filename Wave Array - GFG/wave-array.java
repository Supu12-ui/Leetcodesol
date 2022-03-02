// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		
		while(t-->0)
		{
		    int n = Integer.parseInt(br.readLine().trim());// taking size of array
		    int arr[] = new int[n]; // declaring array of size n
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i]=Integer.parseInt(inputLine[i]); // input elements of array
		    }
		    
		    Solution obj = new Solution();
		    
		    
		    obj.convertToWave(arr, n);
		    
		    StringBuffer sb = new StringBuffer(); 
            for (int i = 0; i < n; i++) 
                sb.append(arr[i] + " "); 
                
		    System.out.println(sb); // print array
		}
	}
}


 // } Driver Code Ends
class Solution{

    
    // arr: input array
    // n: size of the array
    //Function to sort the array into a wave-like array.
    public static void convertToWave(int arr[], int n){
        Arrays.sort(arr);
        int start=0;
        int cur=1;
        for(int i=cur;i<n;i++)
        {
            if(i%2!=0)
            {
                if(arr[i]>arr[start])
                {
                   swap(arr,i,start);
                  
                 }
            }
            else
            {
                if(arr[i]<arr[start])
                {
                    swap(arr,i,start);
                }
            }
            start++;
        }
        
    }
    static void swap(int a[],int start,int end)
    {
        int temp=a[start];
        a[start]=a[end];
        a[end]=temp;
    }
    
}


// { Driver Code Starts.
  // } Driver Code Ends