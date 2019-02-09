class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 1, high = num;
        
        while (low <= high) {
            long mid = (high - low) / 2 + low;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }
        return false;
    }
}

O(nlogn)
O(1)