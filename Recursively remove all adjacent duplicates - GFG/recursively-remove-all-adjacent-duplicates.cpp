// { Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
//User function template for C++

class Solution{
public:
    string remove(string s){
        // code here
        
        string res="";
        int i=0;
        int n=s.length();
        while(i<n)
        {
            char c=s[i];
            int freq=0;
            while(i<n && c==s[i])
            {
                i++;
                freq++;
            }
            if(freq==1)
            {
               res+=c; 
            }
        }
        if(res==s)
        {
            return res;
        }
        return remove(res);
    }
};

// { Driver Code Starts.

int main() {
    int t;
    string tc;
    getline(cin, tc);
    t = stoi(tc);
    while (t--) {
        string s;
        getline(cin, s);
        Solution ob;
        cout << ob.remove(s) << "\n";
    }
    return 0;
}  // } Driver Code Ends