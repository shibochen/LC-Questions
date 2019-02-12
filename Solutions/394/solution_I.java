class Solution {
    public String decodeString(String s) {
        if (s == null || s.length() == 0) return s;
        Stack<Integer> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        int idx = 0;
        String res = "";
        
        while (idx < s.length()) {
            if (Character.isDigit(s.charAt(idx))) {
                int count = 0;
                while (Character.isDigit(s.charAt(idx))) {
                    count = count * 10 + (s.charAt(idx) - '0');
                    idx++;
                }
                stack1.push(count);
            } else if (s.charAt(idx) == '[') {
                stack2.push(res);
                res = "";
                idx++;
            } else if (s.charAt(idx) == ']') {
                StringBuilder temp = new StringBuilder(stack2.pop());
                int time = stack1.pop();
                for (int i = 0; i < time; i++) {
                    temp.append(res);
                }
                res = temp.toString();
                idx++;
            } else {
                res += s.charAt(idx);
                idx++;
            }
        }
        return res;
    }
}


O(n)
O(n)