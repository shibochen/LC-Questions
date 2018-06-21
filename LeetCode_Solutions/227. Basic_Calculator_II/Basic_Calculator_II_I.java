class Solution {
    public int calculate(String s) {
        if (s == null || s.length() == 0) return 0;
        Stack<Integer> stack = new Stack<Integer>();

        int num = 0;
        char sign = '+';

        for(int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i) - '0';
            }
            if(s.charAt(i) != ' ' && !Character.isDigit(s.charAt(i)) || i + 1 == s.length()) {
                if (sign == '+') {
                    stack.push(num);
                } else if (sign == '-') {
                    stack.push(-num);
                } else if (sign == '/') {
                    stack.push(stack.pop() / num);
                } else if (sign == '*') {
                    stack.push(stack.pop() * num);
                }
                sign = s.charAt(i);
                num = 0;
            }
        }

        int result = 0;
        while(!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}

/*
思路：用stack来保存数值。如果是‘+’，那么把+num入栈。如果是‘-’,那么把‘-num'入栈。
如果是’/',那么把栈顶元素弹出除以当前的num然后再次入栈。同理对于‘*’

Time: O(n)  Space: O(n)
/
