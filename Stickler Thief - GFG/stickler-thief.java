//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	  
	  //taking input using Scanner class
	  Scanner sc = new Scanner(System.in);
	  
	  //taking count of testcases
	  int t = sc.nextInt();
	  while(t-- > 0){
	      
	      //taking count of houses
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      //inserting money present in 
	      //each house in the array
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
  	      
  	      //calling method FindMaxSum() of class solve
  	      System.out.println(new Solution().FindMaxSum(arr, n));
	 }
   }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum money the thief can get.
    int res(int n,int arr[],int[] dp){
        if(n==0)return arr[0];
        if(n<0) return 0;
        if(dp[n]!=0) return dp[n];
        int pick=arr[n]+res(n-2,arr,dp);
        int not=0+res(n-1,arr,dp);
        return dp[n]=Math.max(pick,not);
    }
    public int FindMaxSum(int arr[], int n)
    {
        int dp[]=new int[n];
        return res(n-1,arr,dp);
    }
}