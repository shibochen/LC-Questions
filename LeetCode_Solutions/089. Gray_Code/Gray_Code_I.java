class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 1 << n; i++){
            list.add(i ^ i >> 1);
        }
        return list;
    }
}


/*
Gray Code 基础公式为 G(i) = i ^ (i / 2)     i / 2 等于 i >> 1
比如  n = 2   1 << 2  等于 4

i = 0    00
i >> 1   00       result 00   --- 0
i = 1    01
         00       result 01   --- 1
i = 2    10
         01       result 11   --- 3
i = 3    11
         01       result 10   --- 2

         Time: O(1 << n)  space: O(1 << n)
*/
