class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int mod;
        int sum=0;
        while(x>0){
            mod=x%10;
            sum=(sum*10)+mod;
            x=x/10;
        }
        if(temp==sum){
            return true;
        }
        return false;
    }
}