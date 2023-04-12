class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        for(int i=0;i<path.length();i++)
        {
           if(path.charAt(i)!='/')
           {
               int a=i;
               while(i<path.length()&& path.charAt(i)!='/')
               {
                   i++;
               }
               String check=path.substring(a,i);
               if(st.size()>0 &&check.equals(".."))
               {
                   st.pop();
               }
               else if(!check.equals("..") && !check.equals("."))
               {
                   st.push(check);
               }
           }
        }
        String ans="";
        if(st.size()==0){return "/"; }
        while(st.size()!=0)
        {
            ans="/"+st.pop()+ans;
        }
        return ans;
        
    }
}