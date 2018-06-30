class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0, start = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {  //遇到左括号，直接加入stack
                stack.push(i);
            } else {
                if (stack.isEmpty()) { //左右配对成功，更新新的起点
                    start = i;
                } else {
                    stack.pop();
                    if (stack.isEmpty()) {
                        result = Math.max(result, i - start);
                    } else {
                        result = Math.max(result, i - stack.peek());
                    }
                }
            }
        }
        return result;
    }
}

/*
利用栈来解决，首先定义一个变量start来记录合法起始位置，然后
遍历字符串，如果遇到左括号就入栈，如果遇到右括号并且当前栈为空，
则将下一个坐标位置记录在start。如果不为空，则取出栈顶并检查栈顶。如果
栈为空，更新result和 i - start的最大值，不为空，则更新result和 i - 栈顶
值的最大值。
Time: O(n)   Space: O(n)
The space complexity of stack is O(n)
*/
