	public boolean isPowerOfThree(int n) {
	    // 1162261467 is 3^19,  3^20 is bigger than int  
	    return ( n>0 &&  1162261467%n==0);
	}




	//Even though the solution is kinda correct, it doesn't stastify the speical
	//requirement: without using loop/ recursion, sad................
	 public boolean isPowerOfThree(int n) {
        if(n == 0) return false;
        while( n % 3 == 0) n /= 3;
        return n == 1;
    }