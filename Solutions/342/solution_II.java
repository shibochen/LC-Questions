class Solution {
    public boolean isPowerOfFour(int num) {
        return (Math.log(num) / Math.log(4)) % 1 == 0;
    }
}


TC: O(n);
SC: O(1)