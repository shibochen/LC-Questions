class Solution {
    public int findNthDigit(int n) {
        int len = 1, start = 1;
        long count = 9;

        while (n > len * count) {
            n -= len * count;
            len += 1;
            count *= 10;
            start *= 10;
        }

        start += (n - 1) / len;
        String s = Integer.toString(start);
        return s.charAt((n - 1) % len) - '0';
    }
}

/*
1 - 9   9个数  9 * 1 = 9 digit
10 - 99  90个数  90 * 2 = 180  digit
100 - 999 900个数 900 * 3 = 2700 digit
。。。。

题意： 一开始不理解题意， 简单说就是找到第Nth 位置上的数
列入 11th  return 0
1 2 3 4 5 6 7 8 9 10 11 12.。
这里return 0 是因为  10 算作两个数字1 和 0

思路：可以分三步来做：
１．找出给定的n落在几位数的范围内
２．找到具体落在哪个数字
３．找出具体在哪一位上
*/
