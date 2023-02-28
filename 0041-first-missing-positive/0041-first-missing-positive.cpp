class Solution {
public:
    int firstMissingPositive(vector<int>& arr) {
        int N=arr.size();
      for(int i=0;i<N;i++)
    {
        while(arr[i]>0 && arr[i]<=N && arr[i]!=arr[arr[i]-1])
        {
            swap(arr[i],arr[arr[i]-1]);
        }
    }
    
    for(int i=0;i<N;i++)
    {
        if(arr[i]!=i+1)
        {
            return i+1;
        }
    }
    
    return N+1;  
    }
};