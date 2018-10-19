class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }
}

TC: O(1)
SC: O(1)
Method: Bit Manipulation