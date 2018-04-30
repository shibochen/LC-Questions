    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        //从右到左
        while (i >= 0 || j >= 0) {
            int sum = carry;
            //a的最右边值加到sum里
            if (j >= 0) sum += b.charAt(j--) - '0';
            //b的最右边值加到sum里
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        //考虑余数，存在加进去
        if (carry != 0) sb.append(carry);
        //因为从右往左加，所以要反转
        return sb.reverse().toString();
    }


    /*
       For example:
       a = "11";
       b = "1";
       return "100" 
       
       sb = 001  
       time: O(n)
       space: O(n)

    */