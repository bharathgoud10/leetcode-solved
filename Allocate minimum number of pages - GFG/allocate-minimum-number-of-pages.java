//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    static boolean solve(int arr[],int mid,int m){
        int sum=0,stu=1;
        for(int i:arr){
            if(sum+i<=mid)
            sum+=i;
            else{
                stu++;
                sum=i;
            }
        }
        return stu<=m;
    }
    public static int findPages(int[]a,int n,int m)
    {
        //Your code here
        if(m>n)
        return -1;
        int si=0,ei=0;
        for(int i:a){
            si=Math.max(si,i);
            ei+=i;
        }
        int res=0;
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(solve(a,mid,m)){
                res=mid;
                ei=mid-1;
            }
            else
            si=mid+1;
        }
        return res;
    }
};