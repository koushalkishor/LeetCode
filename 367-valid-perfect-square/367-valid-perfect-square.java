class Solution {
    public boolean isPerfectSquare(int num) {
        long left = 1, right = num;
         
        while (left <= right)
        {
            long mid = (left + right) / 2;
           
            // Check if mid is perfect square
            if (mid * mid == num)
            {
                return true;
            }
            
            // Mid is small -> go right to increase mid
            if (mid * mid < num)
            {
                left = mid + 1;
            }
           
            // Mid is large -> to left to decrease mid
            else
            {
                right = mid - 1;
            }
        }
        return false;
    }
}