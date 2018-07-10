class Solution {
    public int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        Arrays.fill(candies, 1);
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        int sum = candies[ratings.length - 1];
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
            sum += candies[i];
        }
        return sum;
    }
}

/*
题意：一群孩子排成队，并且分发糖果根据他们的评分
但是要确保以下2个条件：
1. 每个孩子至少能分到一颗糖
2. 当评分比他左右都高时，多分一颗

问最少要发几颗糖

思路:
1. 开辟一个新数组，并赋值每个元素为1
2. 从左边遍历过来，发现大就 + 1
3. 然后再从右边遍历，进行比值确定是否之前加过，加过就不需要加，没有就再 + 1

例子：
起始数值
rating   4 5 1 1 3 7
candies  1 1 1 1 1 1
左边遍历
rating   4 5 1 1 3 7
candies  1 2 1 1 2 3
右边遍历
rating   4 5 1 1 3 7
candies  1 2 1 1 2 3

Time: O(n)    Space: O(n)
*/
