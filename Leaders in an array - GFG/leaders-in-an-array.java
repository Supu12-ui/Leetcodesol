// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Array {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		
		while(t-->0){
		    
		    //input size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //inserting elements in the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    StringBuffer str = new StringBuffer();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		  
		    //calling leaders() function
		    res = obj.leaders(arr, n);
		    
		    //appending result to a String
		    for(int i=0; i<res.size(); i++){
		        str.append(res.get(i)+" ");
		    }
		    
		    //printing the String
		    System.out.println(str);
		}
		
	}
}
// } Driver Code Ends


class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        Stack<Integer> st=new Stack<Integer>();
        int a[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            if(st.size()==0)
            {
              a[i]=-1;
              st.push(arr[i]);
            }
            else if(st.size()>0 && arr[i]<st.peek())
            {
                a[i]=st.peek();
               
            }
            else
            {
                while(st.size()>0 && arr[i]>=st.peek())
                {
                    st.pop();
                }
                if(st.size()==0)
                {
                    a[i]=-1;
                }
                else
                {
                    a[i]=st.peek();
                }
            }
            st.push(arr[i]);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==-1)
            {
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}
