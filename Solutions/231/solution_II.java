class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 0) return false;
        while( n % 2 == 0) n /= 2;
        return n == 1;
    }
}

TC: O(logn);
SC: O(1);
Method: Brutal Force