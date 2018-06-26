class Solution {
    public String decodeString(String s) {
        String result = "";
        Stack<Integer> countStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {  //step 1
                cnt = 10 * cnt + s.charAt(i) - '0';
            } else if (s.charAt(i) == '[') {   //step 2
                countStack.push(cnt);
                strStack.push(result);
                cnt = 0;
                result = "";
            } else if (s.charAt(i) == ']') {  //step 3
                StringBuilder temp = new StringBuilder(strStack.pop());
                int repeatTimes = countStack.pop();
                for (int j = 0; j < repeatTimes; j++) {
                    temp.append(result);
                }
                result = temp.toString();
            } else {                    //step 4     
                result += s.charAt(i);
            }
        }
        return result;
    }
}

/*
此题运用迭代，并且用两个stack来辅助，一个countstack用来存储次数（cnt）， 另一个
strstack用来存储字符串（result）。
遍历整个字符串
1. 遇到数字， 更新cnt得值
2. 遇到‘[’符号，把数字cnt压入数字栈里，并把字符串（result）也压入strstack栈里，另外
重新设置cnt和 result
3. 遇到‘]’，就直接重复数字栈里的次数和字符串里的string
4. 遇到字母，直接加入result
*/
