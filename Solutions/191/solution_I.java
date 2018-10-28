public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>= 1;
        }
        return result;
    }
}

TC: O(1)
SC: O(1)
M: Bit Manipulation