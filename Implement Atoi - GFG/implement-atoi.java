// { Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			System.out.println(obj.atoi(str));
		t--;
		}
	}
}// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String str) {
	// Your code here
	int digit=0;
		boolean flag=false;
		int start=0;
	if(str.charAt(0)=='-')
	{
	   flag=true; 
	   	start=1;
	}
	str=reverse(str.substring(start,str.length()));
//	System.out.println(str);

	for(int i=str.length()-1;i>=0;i--)
	{
	    char ch=str.charAt(i);
	    //System.out.print(ch);
	    
	     if(ch>='0' && ch<='9')
	    {
	        
	       int val=(int)(ch-'0');
	      // System.out.println(val);
	       digit=digit*10+val;
	        
	       
	     }
	    
	    else
	    {
	        return -1;
	    }
	}
	//System.out.println(digit);
   if(flag==true)
   {
       return 0-digit;
   }
   return digit;
    }
    String reverse(String str)
    {
        int start=0;
        int end=str.length()-1;
        char ch[]=str.toCharArray();
        while(start<end)
        {
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
        String ans=String.valueOf(ch);
        return ans;
    }
}
