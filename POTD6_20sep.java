Factorials of large numbers 
Medium Accuracy: 51.61% Submissions: 23972 Points: 4
Given an integer N, find its factorial.

Example 1:

Input: N = 5
Output: 120
Explanation : 5! = 1*2*3*4*5 = 120
Example 2:

Input: N = 10
Output: 3628800
Explanation :
10! = 1*2*3*4*5*6*7*8*9*10 = 3628800

*******************************************************************

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val: ans) 
                System.out.print(val); 
            System.out.println();
        }   
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
   static ArrayList<Integer> factorial(int N){
      //ArrayList to contain the result 
       ArrayList<Integer> result=new ArrayList<>();
      // Adding 1 at 0th index
       result.add(1);
       int carry=0;
      // Declare a variable to traverse numbers from 2 to n
       int val=2;
       while(val<=N){
            // Traverse array list from right to left
            for(int i=result.size()-1;i>=0;i--){
               // Store the last digit at index and add remaining to carry
                int temp=result.get(i)*val+carry;
                result.set(i,temp%10);
                carry=temp/10;
            }
            // insert carry digit by digit to the begining of the ArrayList
            while(carry!=0){
                result.add(0,carry%10);
                carry=carry/10;
            }
            val++;
            
        }
        return result;    
   }
}