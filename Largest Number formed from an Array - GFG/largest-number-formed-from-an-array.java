// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            String[] arr = br.readLine().trim().split(" ");

            String ans = new Solution().printLargest(arr);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    String printLargest(String[] arr) {
        // code here
         PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        String s1 = String.valueOf(o1);
        String s2 = String.valueOf(o2);
        String XY = s1 + s2;
        String YX = s2 + s1;
        return XY.compareTo(YX) > 0 ? -1 : 1;
      }
    });
    for(int i=0;i<arr.length;i++)
    {
        pq.add(Integer.valueOf(arr[i]));
    }
    StringBuilder sb = new StringBuilder();
    while (!pq.isEmpty()) {
      sb.append(pq.poll());
    }
    return sb.charAt(0) == '0' ? "0" :sb.toString();
    
    }
}