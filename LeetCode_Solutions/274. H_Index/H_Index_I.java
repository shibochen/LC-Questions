class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] buckets = new int[n + 1];
        for (int c : citations) {
            if (c >= n) {
                buckets[n]++;
            } else {
                buckets[c]++;
            }
        }
        int count = 0;
        for (int i = n; i >= 0; i--) {
            count += buckets[i];
            if (count >= i) {
                return i;
            }
        }
        return 0;
    }
}

/*
bucket sort ? counting sort?
Example : input [3,0,6,1,5]

buckets  1 1 0 1 0 2
index    0 1 2 3 4 5
output : 3

代码 5 - 11 结果都显示在在line27，注意当 citation数组里的值大于长度，都在新开辟
数组最后一位加 1
line 13 - 18 从右往左扫，找出最大h-index
*/
