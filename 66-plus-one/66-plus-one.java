class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1;
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(carry==0){
                break;
            }
            int tmp=digits[i]+carry;
            if(tmp>=10){
                carry=1;
                digits[i]=tmp%10;
            }
            else{
                carry=0;
                digits[i]=tmp;
            }
        }
        
        if(carry!=0){
           int[]  newDigits=new int[n+1];
            newDigits[0]=1;
            for(int j=0;j<n;j++){
                newDigits[j+1]=digits[j];
            }
            return newDigits;
        }
        return digits;
    }
}