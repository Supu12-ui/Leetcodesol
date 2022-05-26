class Solution {
public:
    int hammingWeight(uint32_t n) {
        string str=to_string(n);
        int intdata;
        stringstream obj;  
        obj << str; // insert data into obj  
        obj >> intdata; 
        //cout<<intdata<<" ";
        int count=0;
        while(n>0)
        {
            int rem=n%2;
            n=n/2;
            if(rem==1)
            {
                count++;
            }
        }
        return count;
    }
};