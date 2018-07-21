class Solution {
    public int findKthNumber(int m, int n, int k) {
        int l = 1, r = m * n;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (!enough(mid, m, n, k)) l = mid + 1;
            else r = mid;
        }
        return l;
    }
    public boolean enough(int mid, int m , int n , int k){
        int count = 0;
        for (int i = 1; i <= m; i++) {
            count += Math.min(mid / i, n);
        }
        return count >= k;
    }
}

/*
Time: O(mlog(m*n))  Space: O(1)
*/
