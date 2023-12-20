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
        int arr[]=new int[26];
        int n=s.length();
        int j=0,ans=-1,cnt=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            arr[c-'a']++;
            if(arr[c-'a']==1)
            cnt++;
            while(cnt>k){
               char c1=s.charAt(j);
               arr[c1-'a']--;
               if(arr[c1-'a']==0)
                 cnt--;
                 j++;
            }
            if(cnt==k){
                ans=Math.max(ans,i-j+1);
            }
        }
        return ans;
    }
}