class Solution {
    public boolean isPerfectSquare(int num) {
        long x = num;
        while (x * x > num) {
            x = (x + num / x) >> 1;   //这里就是取两个数的中间值
        }
        return x * x == num;
    }
}

/*
Newton Method
Time: O(logn)   Space: O(1)
*/
