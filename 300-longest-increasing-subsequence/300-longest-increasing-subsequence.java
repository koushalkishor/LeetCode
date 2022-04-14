class Solution {
    public int lengthOfLIS(int[] nums) {
        //one approach
//         int n=nums.length;
//         int[] dp=new int[n];
//         int i,j; // where i is called leading pointer and j is called trailing pointer
//         int max=0;
//         for(i=0;i<n;i++){
//             dp[i]=1;
//         }
        
//         for(i=1;i<n;i++){
//             for(j=0;j<i;j++){
//                 if(nums[j]<nums[i]){
//                     dp[i]=Math.max(dp[i],dp[j]+1);
//                     //max++;
//                 }
//             }
//             //max=0;
//         }
//         for(i=0;i<n;i++){
//             if(max<dp[i]){
//                 max=dp[i];
//             }
//         }
        
//         return max;
        int n=nums.length;
        int[] dp=new int[n];
        int i,j;
        dp[0]=1;
        
        int ans=1;
        for(i=1;i<n;i++){
            int max=0;
            for(j=0;j<=i;j++){
                if(nums[j]<nums[i]){
                    max=Math.max(max,dp[j]);
                }
            }
            dp[i]=max+1;
            ans=Math.max(ans,dp[i]);
            }
        return ans;
        }
    }
