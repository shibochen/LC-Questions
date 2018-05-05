public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            n = n & (n - 1);
            count++;
        }
        return count++;
    }
}

/*
使用 n&(n - 1)的方法：n&(n1)的作用：将n的二进制表示中的最低位为 1 的 改为 0

Time: O(1)   Space: O(1)
*/
