class Solution {
    public boolean isPowerOfFour(int num) {
        if ( num > 1) {
            while ( num % 4 == 0) {
                num /= 4;
            }
        }
        return num == 1;
    }
}


TC: O(n)
SC: O(1)