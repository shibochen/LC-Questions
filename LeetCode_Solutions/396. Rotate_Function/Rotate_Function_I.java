class Solution {
    public int maxRotateFunction(int[] A) {
        int sum = 0, F = 0, length = A.length;
        for (int i = 0; i < length; i++) {
            F += i * A[i];
            sum += A[i];
        }
        int max = F;
        for (int i = 1; i < length; i++) {
            F = F + sum - length * A[length - i];
            max = Math.max(F, max);
        }
        return max;
    }
}


/*
规律：  F(i) = F(i-1) + sum - n*A[n-i]
*/
