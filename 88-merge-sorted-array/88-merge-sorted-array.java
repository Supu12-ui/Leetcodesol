class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp=nums1.length;
        int i=0;
        int j=0;
        while(i<m && j<n)
        {
            if(nums1[i]>nums2[j])
            {
                int temps=nums1[i];
                nums1[i]=nums2[j];
                nums2[j]=temps;
                Arrays.sort(nums2);
            }
           
            i++;
        }
        for(i=m;i<temp;i++)
        {
            nums1[i]=nums2[j];
            j++;
        }
            
        }
    
}