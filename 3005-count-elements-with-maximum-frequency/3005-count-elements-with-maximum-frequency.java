class Solution {
    public int maxFrequencyElements(int[] nums) {
        int freq[]=new int[101];
        int maxi=0,ans=0;
        for(int i:nums){
            freq[i]++;
            maxi=Math.max(maxi,freq[i]);
        }
         for(int i:nums){
            if(freq[i]==maxi){
                ans+=freq[i];
                freq[i]=0;
            }
        }
        return ans;
    }
}