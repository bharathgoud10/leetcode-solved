//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long a[], int n, int k)
    {
        long res[]=new long[n-k+1];
        ArrayDeque<Long> dq=new ArrayDeque<>();
        int i=0,j=0;
        while(i<n){
             while(!dq.isEmpty() && dq.peekLast()>0)
             dq.pollLast();
	        dq.addLast(a[i]);
	        if(i-j+1<k)
	        i++;
	        else if(i-j+1==k){
	            if(dq.peekFirst()<0)
	            res[j]=dq.peekFirst();
	            else
	            res[j]=0;
	            if(dq.peekFirst()==a[j])
	            dq.pollFirst();
	            i++;
	            j++;
	        }
        }
        return res;
    }
}