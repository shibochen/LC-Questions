class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int i = 0;
        while (A[i] < A[i + 1]) i++;
        return i;
    }
}


TC: O(N)
SC: O(1)