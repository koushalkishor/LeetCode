class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int num = nums1[i];
            int j = 0;
            int flag = 0;
            while(nums2[j] != num) j++;
            for(int k = j; k<nums2.length; k++){
                if(nums2[k] > num) {
                    ans[i] = nums2[k];
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) ans[i] = -1;
        }
        return ans;
    }
    
}