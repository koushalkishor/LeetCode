class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        int i,j;
        int max=0;
        for(i=0;i<n;i++){
            dp[i]=1;
        }
        
        for(i=1;i<n;i++){
            for(j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                    //max++;
                }
            }
            //max=0;
        }
        for(i=0;i<n;i++){
            if(max<dp[i]){
                max=dp[i];
            }
        }
        
        return max;
    }
}