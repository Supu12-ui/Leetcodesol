class Solution {
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