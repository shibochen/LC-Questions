public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        if(n == 0) return 0;
        int result = 0;
        for(int i = 0; i < 32; i++){
            result <<= 1;
            if((n & 1) == 1) result++;
            n >>= 1;
        }
        return result;
    }
}

/*
思路：就是进行左右互移
start:0101
         1
result:
1th run: 1
2th run: 10
3th run: 101
4th run: 1010
end:1010


Time: O(1)   Space: O(1)
*/
