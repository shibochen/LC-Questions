class Solution {
    public String convert(String s, int numRows) {
        if(numRows <= 1) return s;
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i = 0; i < sb.length; i++){
            sb[i] = new StringBuilder("");
        }
        //把每个字母放到指定位置
        for(int i = 0; i < s.length(); i++){
            int index = i % (2 * numRows - 2);
            index = index < numRows ? index : 2 * numRows - 2 - index;
            sb[index].append(s.charAt(i));
        }
        //把每组的字母横向全部放在一个数组里，然后在进行返回
        for(int i = 1; i < sb.length; i++){
            sb[0].append(sb[i]);
        }
        return sb[0].toString();
    }
}

/*
题目： 不重要
这题的主要还是涉及数学找规律， line 10， 11 的规律
Time: O(n)    Space: O(n);
*/
