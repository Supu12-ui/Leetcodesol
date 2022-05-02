class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int i=0;
        for(int k=0;k<arr.length;k++)
        {
            if(arr[k]%2==0)
            {
                int temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                i++;
            }
        }
        return arr;
    }
}