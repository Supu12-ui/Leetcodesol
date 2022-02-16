// { Driver Code Starts
// Initial Template for c++

#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
// User function Template for C++

class Solution{
public:
    int t[1001][1001];
    
    bool isPalindrome(string str, int a, int b){
        if(a == b){
            return true;
        }
        if(a > b){
            return true;
        }
        
        while(a<b){
            if(str[a]!=str[b]){ 
                return false;
                
            }
            a++;
            b--;
        }
        return true;
    }
    
    int solve(string s,int i,int j){
        int a,b;
        if(i>=j){
            return 0;
        }
        if(isPalindrome(s,i,j) == true){
            return 0;
        }
    
        
        if(t[i][j] != -1){
            return t[i][j];
        }
        
        int mn = INT_MAX;
        for(int k=i;k<=j-1;k++){
            if(isPalindrome(s,i,k)){
                a = solve(s,i,k);
                b = solve(s,k+1,j);
                int temp = a + b + 1;
                mn = min(mn,temp);
            }
        }
    
        return t[i][j] = mn;
    }
    
    int palindromicPartition(string str)
    {
        // code here
        int ans=0;
        int i = 0;
        memset(t,-1,sizeof(t));
        int n = str.size();
        ans = solve(str,i,n-1);
        return ans;
    }
};

// { Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        string str;
        cin>>str;
        
        Solution ob;
        cout<<ob.palindromicPartition(str)<<"\n";
    }
    return 0;
}  // } Driver Code Ends