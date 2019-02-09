class Solution {
    public int mySqrt(int x) {
        if (x <= 0) return 0;
        int low = 1, high = x;
        
        while (low <= high) {
            long mid = (high - low) / 2 + low;
            if (mid * mid == x) {
                return (int)mid;
            } else if (mid * mid < x) {
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }
        if (high * high < x) {
            return (int) high;
        } else {
            return (int) low;
        }
    }
}

O(nlogn)
O(1)