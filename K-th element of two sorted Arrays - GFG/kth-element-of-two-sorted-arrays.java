//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            int k = Integer.parseInt(stt.nextToken());
            int a[] = new int[(int)(n)];
            int b[] = new int[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            System.out.println(obj.kthElement( a, b, n, m, k));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {
     private int i=0,j=0;
    long getMin(int[] a,int[] b,int n,int m){
       
        if(i<n && j<m){
            if(a[i]<b[j])
            return (long)a[i++];
            else
            return (long)b[j++];
        }
        else if(i<n)
        return (long)a[i++];
        else if(j<m)
        return (long)b[j++];
        return -1;
    }
    public long kthElement(int arr1[], int arr2[], int n, int m, int k) {
        long res=-1;
        for(int i=0;i<k;i++){
            res=getMin(arr1,arr2,n,m);
        }
        return res;
    }
}