//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S[] = read.readLine().split(" ");
            int R = Integer.parseInt(S[0]);
            int C = Integer.parseInt(S[1]);
            int matrix[][] = new int[R][C];
            int c = 0;
            for(int i = 0; i < R; i++){
                String line[]=read.readLine().trim().split(" ");
                for(int j = 0; j < C; j++){
                    matrix[i][j] = Integer.parseInt(line[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix, R, C);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int median(int matrix[][], int r, int c) {
        int low = 1;
        int high = 2000;
        
        int half = (r * c) / 2;
        
        while (low <= high) {
            int mid = (high + low) / 2;
            int cnt = helper(matrix, r, c, mid);

            if (cnt <= half) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return low;
    }
    
    int helper(int[][] matrix, int r, int c, int target) {
        
        int ans = 0;
        
        for (int i = 0; i < r; i++) {
            int low = 0;
            int high = c - 1;
            while (low <= high) {
                int mid = (high + low) / 2;
                if (matrix[i][mid] <= target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            ans += low;
        }
        
        return ans;
    }
}