class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 0, r = num;
        while (l <= r) {
            long mid = l + (r - l) / 2; //overflow (mid * mid)
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                l = (int)(mid + 1);
            } else {
                r = (int)(mid - 1);
            }
        }
        return false;
    }
}

/*
Binary Search
using long to prevent from overflow (mid * mid)
Time: O(logn) Space: O(1)
*/
