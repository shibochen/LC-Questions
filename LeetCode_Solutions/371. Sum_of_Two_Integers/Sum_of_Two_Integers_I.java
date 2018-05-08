class Solution {
    public int getSum(int a, int b) {
        if(a == 0) return b;
        if(b == 0) return a;

        while( b != 0){
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}

/*
Ex:
a = 1        1      carry     1   --->  10    --->  000
b = 3       11        a      10         00          100
                      b      10        100          000
ans= 4     100
Bit Manipulation

Time: O(1)   Space: O(1)
*/
