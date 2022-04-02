class Solution {
    public boolean validPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        int count=0;
        while(start<=end)
        {
            if(s.charAt(start)==s.charAt(end))
            {
                start++;
                end--;
            }
            else if(s.charAt(start)!=s.charAt(end))
            {
                boolean check1=palindrome(s,start+1,end);
                boolean check2=palindrome(s,start,end-1);
                if(check1==false&&check2==false)
                {
                    return false;
                }
                break;
            }
           
        }
        return true;
        
    }
    boolean palindrome(String s,int start,int end)
    {
        
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            start++;
                end--;
        }
        return true;
    }
}