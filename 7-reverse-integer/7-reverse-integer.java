import java.util.*;
class Solution {
    public int reverse(int x) {
        int result=0;
        while(x!=0){
            int r=x%10;
            if((result < Integer.MIN_VALUE/10) || (result > Integer.MAX_VALUE/10)){
                return 0;
            }
            result=(result*10)+r;
            x=x/10;
        }
        return result;
    }
}