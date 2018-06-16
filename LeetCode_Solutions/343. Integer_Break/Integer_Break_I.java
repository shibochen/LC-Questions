class Solution {
    public int integerBreak(int n) {
        if (n == 2 || n == 3) return n - 1;

        int product = 1;

        while (n > 4) {
            product *= 3;
            n -= 3;
        }

        return product * n;
    }
}

/*
number   sum    product
2      1 + 1      1
3      2 + 1      2
4      2 + 2      4
5      3 + 2      6
6      3 + 3      9
7      3 + 4      12
8      3 + 3 + 2   18
9      3 + 3 + 3   27
10     3 + 3 + 4   36

从第五个数开始可以看出来，每个数都要先拆除所有3，一直
拆除剩一个 2 或者 4。 4 不用拆，拆成3 + 1 比 4小，拆成
2 + 2 没什么用。

*/
