class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int ans=0;
        int start=0;
        int end=people.length-1;
        while(start<=end)
        {
            if((people[start]+people[end])<=limit)
            {
                ans++;
                start++;
                end--;
            }
            else 
            {
                ans++;
                end--;
            }
                
        }
        return ans;
    }
}