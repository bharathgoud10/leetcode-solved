//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String txt = br.readLine().trim();
            String pat = br.readLine().trim();

            int ans = new Solution().search(pat, txt);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        // code here
         int arr[]=new int[26];
         int n=pat.length();int cnt=0,ans=0;
        for(int i=0;i<n;i++){
            arr[pat.charAt(i)-'a']++;
        }
        cnt=pat.length();
        int i=0,j=0;
        while(j<txt.length()){
            char c=txt.charAt(j);
            if(arr[c-'a']>0)
            cnt--;
            arr[c-'a']--;
            if(j-i+1<n){
                j++;
            }
            else if(j-i+1==n){
                if(cnt==0)
                ans++;
                char c1=txt.charAt(i);
                arr[c1-'a']++;
                if(arr[c1-'a']>0)
                cnt++;
                i++;
                j++;
            }
        }
        return ans;
    }
}