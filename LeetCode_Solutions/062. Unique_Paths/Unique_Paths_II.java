class Solution {
    public int uniquePaths(int m, int n) {
        int[] result = new int[n];
        result[0] = 1;
        for(int i = 0; i < m; i++){
            for(int j = 1; j < n; j++){
                result[j] = result[j] + result[j - 1];
            }
        }
        return result[n - 1];
    }
}

/*
for example: m = 3 n = 3
m = 0    result [1,1,1]
m = 1    result [1,2,3]
m = 2    result [1,3,6]


Time: O(m * n)  Space: O(n)
*/
