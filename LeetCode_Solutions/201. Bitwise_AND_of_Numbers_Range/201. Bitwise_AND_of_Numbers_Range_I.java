class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int i = 0;
        while (m != n) {
            m >>= 1;
            n >>= 1;
            i++;
        }
        return m << i;
    }
}

/*
一开始不懂题意
比如： input 【5，7】
首先把他们转化为二进制
101
110
111

返回的答案是 4  变为2进制  也就是  100
从上面我们可以得出来该区间范围的最左边都相同
所以我们首先要找到移动多少位后 m 和 n 相同
然后在把m 移动下我们所招出来的位数  就是 本题答案
*/
