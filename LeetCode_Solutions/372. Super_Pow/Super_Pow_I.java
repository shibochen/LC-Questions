class Solution {
    public int superPow(int a, int[] b) {
        int res = 1;
        for (int i = 0; i < b.length; i++) {
            res = pow(res, 10) * pow(a, b[i]) % 1337;
        }
        return res;
    }

    public int pow(int x, int y) {
        if (y == 0) return 1;
        if (y == 1) return x % 1337;
        return pow(x % 1337, y / 2) * pow(x % 1337, y - y / 2) % 1337;
    }
}

/*
similar to Pow(x,n) 题目
*/
