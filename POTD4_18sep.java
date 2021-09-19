Sum of Query II 
Medium Accuracy: 82.37% Submissions: 3728 Points: 4
You are given an array arr[] of n integers and q queries in an array queries[] of length 2*q containing l, r pair for all q queries. You need to compute the following sum over q queries.

 

Array is 1-Indexed.

Example 1:

Input: n = 4
arr = {1, 2, 3, 4}
q = 2
queries = {1, 4, 2, 3}
Output: 10 5
Explaination: In the first query we need sum 
from 1 to 4 which is 1+2+3+4 = 10. In the 
second query we need sum from 2 to 3 which is 
2 + 3 = 5.


****************************************************************************

// { Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
// User function Template for C++

class Solution{
public:
    vector<int> querySum(int n, int arr[], int q, int queries[])
    {
        vector<int> output;
       int sum;
       
       for(int i=0;i<q || i<2*q;i=i+2){
           sum = 0;

          
           
           for(int j = queries[i] ;j<=queries[i+1];j++){
               
               sum +=arr[j-1];
           }
           output.push_back(sum);
           
       }
       return output;
        // code here
    }
};

// { Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int n, q;
        cin>>n;
        int arr[n];
        for(int i = 0;i < n;i++)
            cin>>arr[i];
        cin>>q;
        int queries[2*q];
        for(int i = 0;i < 2*q;i += 2)
            cin>>queries[i]>>queries[i+1];
        
        Solution ob;
        vector<int> ans = ob.querySum(n, arr, q, queries);
        for(int u: ans)
            cout<<u<<" ";
        cout<<endl;
    }
    return 0;
}  // } Driver Code Ends