class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0, remain = 0, debt = 0;

        for (int i = 0; i < gas.length; i++) {
            remain += gas[i] - cost[i];
            if (remain < 0) {
                start = i + 1;
                debt += remain;
                remain = 0;
            }
        }
        return debt + remain < 0 ? -1 : start;
    }
}


/*
题意：一辆人从某个环形车站点加油gas[i]后出发，前去下一个站点并花费cost[i]油。
问这车能不能有足够油环绕一圈回到起点。如果能，就找出那个起点，否则 -1

思路：
1. 首先把所有加油站油量总数相加，并减去每站去下站的耗油量
2. 如果当值为负数，说明那个开始起点不是我们所要找的，从下一个开始
3. 判断总数如果大于 0，说明能绕环转，并返回起点值
Time: O(n)   Space: O(1)
*/
