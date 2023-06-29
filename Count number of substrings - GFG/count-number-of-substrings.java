//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
            int k = sc.nextInt();
    		System.out.println (new Solution().substrCount (s, k));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    long solve(String c,int k){
        char s[]=c.toCharArray();
         int arr[]=new int[26];
         long count=0;int distinct=0;
         int left=0;
        for(int i=0;i<c.length();i++){
            arr[s[i]-'a']++;
            if(arr[s[i]-'a'] == 1)
                distinct++;
            while(distinct>k){
                arr[s[left]-'a']--;
                if(arr[s[left]-'a']==0)
                distinct--;
                left++;
            }
            count+=i-left+1;
        }
        return count;
    }
    long substrCount (String s, int k) {
         return solve(s,k)-solve(s,k-1);//atmost:k minus atmost:k-1 -> exact k
    }
}