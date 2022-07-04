class Solution {
    public boolean isPalindrome(int x) {
        
        int n,sum=0;
        int y=x;
        while(x>0){
            n=x%10;
            sum=(sum*10)+n;
            x=x/10;
        }
        if(y==sum){
            return true;
        }
        return false;
    }
}