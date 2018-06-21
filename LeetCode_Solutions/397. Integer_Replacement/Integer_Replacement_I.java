class Solution {
    public int integerReplacement(int n) {
        if (n == Integer.MAX_VALUE) return 32;
        int count = 0;

        while( n > 1) {
            if(n % 2 == 0) {
                n /= 2;
            } else {
                if((n + 1) % 4 == 0 && (n - 1) != 2) n++;
                else n--;
            }
            count++;
        }
        return count;
    }
}


/*
(n + 1 ) % 4 可以减少count数值
(n - 1) != 2  防止特殊情况 n = 3
*/
