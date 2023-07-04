//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        int ans=-1;
        int arr[]=new int[256];int cnt=0;
        int n=s.length();int j=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            arr[c]++;
            if(arr[c]==1)
            cnt++;
            while(cnt>k){
                char c1=s.charAt(j);
                arr[c1]--;
                if(arr[c1]==0)cnt--;
                j++;
            }
            if(cnt==k)
            ans=Math.max(i-j+1,ans);
        }
        return ans;
    }
}