class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1 << n; i++) {
             list.add(i ^ (i >> 1));
        }
        return list;
    }
}

TC: O(n)
SC: O(n)
    
Note: 1 << n  show how many numbers in list
    i >> 1   is similar to  i / 2