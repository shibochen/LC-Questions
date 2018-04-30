	 public boolean isPowerOfTwo(int n) {
        if(n == 0) return false;
        while( n % 2 == 0) n /= 2;
        return n == 1;
    }

    //Brutal force


    public boolean isPowerOfTwo(int n) {
        return ((n>0) && (n & (n-1)) == 0); 
    }

    // Note: The & operator compares corresponding bits of two operands.
    //		 If both bits are 1, it gives 1. 
    //       If either of the bits is not 1, it gives 0.
    // n & (n-1) trick : power of 2 mean only 1 bit of n is '1'