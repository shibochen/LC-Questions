class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int j = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] < A[i]) j++;
        }
        return j;
    }
}

/*
Time: O(n)  Space: O(1)
*/
