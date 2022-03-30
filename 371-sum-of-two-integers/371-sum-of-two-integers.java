class Solution {
    public int getSum(int a, int b) {
        int XOR=a^b;
        int carry=a&b;
        if(carry==0){
            return XOR;
        }
        else{
            return getSum(XOR,carry<<1);
        }
    }
}