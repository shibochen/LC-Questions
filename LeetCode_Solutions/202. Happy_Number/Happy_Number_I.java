    class Solution {
        public boolean isHappy(int n) {
            HashSet<Integer> set = new HashSet<>();
            //add every n to set, if cannot be add, return false
            while(set.add(n)){
                //initalize squareSum
                int squareSum = 0;
                while( n > 0){
                    //add the value of every digit square of every n
                    squareSum += Math.pow(n % 10, 2);
                    //reassign value to n
                    n /= 10;
                }
                //if sum = 1, return true
                if(squareSum == 1) return true;
                //if it is not, reset n to squareSum
                else n = squareSum;
            }
           return false;
        }
    }

    /*
    Method: HashSet
    
    思路：1. use one hash set to record the sum of every digit square of every
            number occurred.
          2. Once the current sum cannot be added to set, return false
          3. Once the current sum equal 1, return true;

    Time: O(n)  Space: O(n)
    */