class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));
        }while(slow!=fast);
        
        if(fast==1){
            return true;
        }
        return false;
    }
    public int findSquare(int num){
        int ans=0;
        while(num>0){
             int rem=num%10;
            ans+=rem*rem;
            num=num/10;
        }
        return ans;
        }
}