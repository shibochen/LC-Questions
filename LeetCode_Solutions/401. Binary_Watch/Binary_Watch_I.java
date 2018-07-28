class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> list = new ArrayList<>();

        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount(h * 64 + m) == num) {
                    list.add(String.format("%d:%02d", h, m));
                }
            }
        }
        return list;
    }
}

/*
h * 64 + m 还不懂
String.format() 需要复习
Integer.bitCount()  -----> 放回二进制里面有几个 1
Time: O(hm)   Space: O(1)
*/
