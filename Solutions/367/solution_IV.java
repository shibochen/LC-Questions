class Solution {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }
}

TC: O(N)
SC: O(1)
    
特殊规律:
1: 1
4: 1 + 3
9: 1 + 3 + 5
16 : 1 + 3 + 5 + 7
.....