<<<<<<< HEAD
class NumArray {
    private int[] data;

    public NumArray(int[] nums) {
        data = nums;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for(int k = i; k <= j; k++){
            sum += data[k];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */


 /*
 Method: Brutal Force
 */
=======
class NumArray {
    private int[] data;

    public NumArray(int[] nums) {
        data = nums;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for(int k = i; k <= j; k++){
            sum += data[k];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */


 /*
 Method: Brutal Force
 */
>>>>>>> 59ec0388aed1323bba68cd071f3bc1e7cff917c3
