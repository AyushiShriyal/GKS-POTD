// { Driver Code Starts
Repeated String Match 
Medium Accuracy: 49.96% Submissions: 11266 Points: 4
Given two strings A and B, find the minimum number of times A has to be repeated such that B becomes a substring of the repeated A. If B cannot be a substring of A no matter how many times it is repeated, return -1.

Example 1:

Input: A = "abcd", B = "cdabcdab"
Output: 3
Explanation: After repeating A three times, 
we get "abcdabcdabcd".
Example 2:

Input: A = "aa", B = "a"
Output: 1
Explanation: B is already a substring of A.

***********************************************************************

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t > 0){
            String A = sc.nextLine();
            String B = sc.nextLine();
            Solution ob = new Solution();
            System.out.println(ob.repeatedStringMatch(A,B));
            t--;
        }
    } 
} 
        

// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
	static int repeatedStringMatch(String A, String B) 
	{ 
        // Your code goes here
           String s = A;
      for(int i=1;i<100;i++)
      {
          if(s.indexOf(B) >=0)
             return i;
          s+= A;
      }
      return -1;
	} 
} 
