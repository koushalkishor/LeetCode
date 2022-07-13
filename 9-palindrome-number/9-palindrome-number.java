class Solution {
    public boolean isPalindrome(int x) {
        if(x==0){
            return true;
        }
        if(x<0 || (x%10)==0){
            return false;
        }
        
        int num=x;
        int sum=0;
        while(num>0){
            int mode=num%10;
            sum=(sum*10)+mode;
            num=num/10;
        }
        if(sum==x){
            return true;
        }
        else{
            return false;
        }
    }
}