    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1; i >= 0; i--){
            //case 1
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            //case 2
            digits[i] = 0;          //考虑进位
        }
        
        //case 3
        int[] newNumber = new int[n+1];     //this里主要为了防止无限 99999..
        newNumber[0] = 1;
        
        return newNumber;
    }


//解题思路:从数组的最后一位开始加1，需要考虑进位，如果到digits[0]位之后仍然有进位存在,则将进位加上 

/* Three cases:
   case 1: 1098 + 1 -> 1099
   case 2: 1099 + 1 ->  1100
   case 3: 9999 + 1 ->  10000     

   time: O(n)  space: O(n)

   Default array values in java
   boolean: false
   int: 0 
   double: 0.0 
   String: null
   User Defined Type: null
   Reference: https://www.geeksforgeeks.org/default-array-values-in-java/

*/
