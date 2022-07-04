class Solution {
    public int trailingZeroes(int n) {
        // if(n<5) 
        // {
        //     return 0;
        // }
        // return n/5 + trailingZeroes(n/5);
        
        // another method
        int count=0;
        while(n>0){
            n=n/5;
            count+=n;
            
        }
        return count;
    }
}