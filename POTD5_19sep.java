Median of 2 Sorted Arrays of Different Sizes 
Hard Accuracy: 50.0% Submissions: 18959 Points: 8
Given two sorted arrays array1 and array2 of size m and n respectively. Find the median of the two sorted arrays.

Example 1:

Input:
m = 3, n = 4
array1[] = {1,5,9}
array2[] = {2,3,6,7}
Output: 5
Explanation: The middle element for
{1,2,3,5,6,7,9} is 5
Example 2:

Input:
m = 2, n = 4
array1[] = {4,6}
array2[] = {1,2,3,5}
Output: 3.5
Your Task:
The task is to complete the function MedianOfArrays() that takes array1 and array2 as input and returns their median. 

Can you solve the problem in expected time complexity?

Expected Time Complexity: O(min(log n, log m)).
Expected Auxiliary Space: O((n+m)/2)


**********************************************************************************************************

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[])
    {
        
        int t[]=new int [(n+m)];
        int c=0,i=0,j=0;
        while(i<n && j<m)
        {
            if(a[i]<b[j]){
                t[c++]=a[i];
                i++;
            }
            else
            {
                t[c++]=b[j];
                j++;
            }
        }
            for(int k=i;k<n;k++)
            t[c++]=a[k];
            for(int k=j;k<m;k++)
            t[c++]=b[k];
            
            if((n+m)%2!=0)
            return t[(m+n)/2];
            double x=(t[(m+n)/2]+t[(m+n)/2-1])/2.0;
            return x;
    }
}