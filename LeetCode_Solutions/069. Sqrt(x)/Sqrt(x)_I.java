class Solution {
      public int mySqrt(int x) {
        int left = 1;
        int right = x;
        while(left <= right) {
            int mid = (right - left) / 2 + left;
            if(mid == x/mid) {
                return mid;
            } else if (mid > x/mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}

/*
Method: binary search
prvent integer overflow
int mid = (right - left)/2 + left;

Time: O(logn)  space:O(1)
*/
