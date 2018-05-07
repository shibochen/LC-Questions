<<<<<<< HEAD
class Solution {
    public int singleNumber(int[] A) {
        int ones = 0, twos = 0;
    for(int i = 0; i < A.length; i++){
        ones = (ones ^ A[i]) & ~twos;
        twos = (twos ^ A[i]) & ~ones;
    }
    return ones;
    }
}

/*
Method: Bit Manipulation

Time: O(n)   Space: O(1)
*/
=======
class Solution {
    public int singleNumber(int[] A) {
        int ones = 0, twos = 0;
    for(int i = 0; i < A.length; i++){
        ones = (ones ^ A[i]) & ~twos;
        twos = (twos ^ A[i]) & ~ones;
    }
    return ones;
    }
}

/*
Method: Bit Manipulation

Time: O(n)   Space: O(1)
*/
>>>>>>> 59ec0388aed1323bba68cd071f3bc1e7cff917c3
