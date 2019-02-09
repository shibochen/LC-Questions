class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        double res = 1;
        long abs = Math.abs((long)n);
        
        while (abs > 0) {
            if (abs % 2 != 0) {
                res *= x;
            }
            x *= x;
            abs /= 2;
        }
        if (n < 0) return 1.0 / res;
        return res;
    }
}