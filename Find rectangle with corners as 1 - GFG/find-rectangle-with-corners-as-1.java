// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.HashMap; 
import java.util.HashSet; 

class GFG{
	public static void main(String args[]) throws IOException { 
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
       		int rows=sc.nextInt();
       		int columns=sc.nextInt();
			
			int matrix[][]=new int[rows][columns];
          
        	for(int i=0; i<rows;i++){            
            	for(int j=0; j<columns;j++){
                	matrix[i][j]=sc.nextInt();
            	}
         	}

			Solution x = new Solution();
			if (x.ValidCorner(matrix)) 
				System.out.println("Yes"); 
			else
				System.out.println("No"); 
			t--;
		}
	} 
}
	


// } Driver Code Ends


//User function Template for Java

public class Solution { 
	static boolean ValidCorner(int matrix[][]) 
	{ 
	   int r=matrix.length,c=matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==1){
                    int right,down;
                    for(right=j+1;right<c;right++){
                        if(matrix[i][right]==1){
                            for(down = i+1;down<r;down++){
                                if(matrix[down][right]==1){
                                    if(matrix[down][j]==1)return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
	}
}