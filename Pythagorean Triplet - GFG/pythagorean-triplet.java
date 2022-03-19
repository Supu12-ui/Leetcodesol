// { Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            boolean ans = new Solution().checkTriplet(arr, n);
            System.out.println(ans ? "Yes" : "No");
        }
    }
}// } Driver Code Ends


//User function Template for Java



class Solution {
    boolean checkTriplet(int[] arr, int n) {
       Arrays.sort(arr);
       
      for(int i=n-1; i>1; i--){
          int r = i-1;
          int l = 0;
          
          int num = arr[i]*arr[i];
          
          while(l < r){
              int sum = arr[l]*arr[l] + arr[r]*arr[r];
              
              if(sum == num){
                  return true;
              }else if(sum > num){
                  r--;
              }else{
                  l++;
              }
          }
      }
      
      return false;
      
      
    }
}