class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int len = s.length(), sign = 1, result = 0;

        for (int i = 0; i < len; i++) {
            if (Character.isDigit(s.charAt(i))) {
                int sum = s.charAt(i) - '0';
                while (i + 1 < len && Character.isDigit(s.charAt(i + 1))) {
                    sum = sum * 10 + s.charAt(i + 1) - '0';
                    i++;
                }
                result += sum * sign;
            } else if (s.charAt(i) == '+') {
                sign = 1;
            } else if (s.charAt(i) == '-') {
                sign = -1;
            } else if (s.charAt(i) == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (s.charAt(i) == ')') {
                result = result * stack.pop() + stack.pop();
            }
        }
        return result;
    }
}

/*
思路：
1.借用stack来解决这个问题，并且先设置一个变量sign为当前符号。
2.开始遍历字符串，遇到数字or多个数字，所以用while循环把所有数字
都计算好并存在result里。
3. 如果遇到 +/- 符号，更新sign的值
4. 如果遇到左括号，将当前result和sign入栈，并重新设置result = 0 sign = 1
5. 如果遇到右括号，就result乘栈顶符号，在加上栈上的数字

Time: O(n)  Space: O(n)
*/
