class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] A = new int[triangle.size() + 1];

        for (int i = triangle.size() - 1; i >= 0; i --) {
            for ( int j = 0; j < triangle.get(i).size(); j++) {
                A[j] = Math.min(A[j], A[j + 1]) + triangle.get(i).get(j);
            }
        }

        return A[0];
    }
}

/*
复制了三角形最后一行，作为用来更新的一位数组。然后逐个遍历这个DP数组，对于每个数字，
和它之后的元素比较选择较小的再加上上面一行相邻位置的元素做为新的元素，然后一层一层的向上扫描,
最后一个值就变成A[0]

比如：

            2
          3   4
        6   5   7
      4   1   8   3

最后一层左右两个数字最小值+上第三的数字
DP； 7 6 10 3   /这层 + 第二层
DP： 9 10 10 3  / 这层 + 第一层
DP:  11 10 10 3  / 11 是最小值   
*/
