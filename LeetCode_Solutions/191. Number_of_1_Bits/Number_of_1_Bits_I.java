<<<<<<< HEAD
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        for(int i = 0; i < 32; i++){
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}

/*
Bitwise AND
When a bitwise AND is performed on a pair of bits, it returns 1 if both bits are 1.

The above code is illustrated below this table:

n = 11      1011   --->   0101  --->  0010  ----> 0001
1              1             1           1           1
count          1             2           2           3

Time: O(1)   Space: O(1)
*/
=======
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        for(int i = 0; i < 32; i++){
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}

/*
Bitwise AND
When a bitwise AND is performed on a pair of bits, it returns 1 if both bits are 1.

The above code is illustrated below this table:

n = 11      1011   --->   0101  --->  0010  ----> 0001
1              1             1           1           1
count          1             2           2           3

Time: O(1)   Space: O(1)
*/
>>>>>>> 59ec0388aed1323bba68cd071f3bc1e7cff917c3
