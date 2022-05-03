class Solution {
    public int findUnsortedSubarray(int[] nums) {
       Stack<Integer> st=new Stack<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(st.size()==0)
            {
                st.push(i);
            }
            else if(nums[st.peek()]<=nums[i])
            {
                st.push(i);
            }
            else
            {
                while(st.size()!=0 && nums[st.peek()]>nums[i])
                {
                   
              
                    min=Math.min(min,st.peek());
                     st.pop();
                }
                st.push(i);
            }
        
        }
        st.clear();
        for(int i=n-1;i>=0;i--)
        {
           if(st.size()==0)
           {
               st.push(i);
           }
            else if(nums[st.peek()]>=nums[i])
            {
                st.push(i);
            }
            else
            {
               while(st.size()!=0 && nums[st.peek()]<nums[i])
                {
                  max=Math.max(max,st.peek());
                   st.pop();
                }
                st.push(i); 
            }
        }
        if(max==Integer.MIN_VALUE && min==Integer.MAX_VALUE)
        {
            return 0;
        }
        return (max-min)+1;
    }
}
class solution {
    public int findUnsortedSubarray(int[] nums) {
        int n=nums.length;
        int a[]=new int[nums.length];
        for(int i=0;i<n;i++)
        {
            a[i]=nums[i];
        }
        Arrays.sort(a);
        int i=0;
        int j=n-1;
        boolean check=false;
        while(i<j)
        {
            if(nums[i]==a[i])
            {
                i++;
            }
            else if(nums[j]==a[j])
            {
                j--;
            }
            else
            {
                check=true;
                break;
            }
           
        }
        if(check==false)
        {
            return 0;
        }
        System.out.println(i+" "+j);
        return (j-i)+1;
        
    }
}