class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) return true;
        Stack<Character> stack = new Stack<>();
        
        for (Character ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            } else {
                if (stack.isEmpty() || stack.pop() != ch) return false;
            }
        }
        return stack.isEmpty();
    }
}


O(n)
O(n)
    
for (Character char : s.toCharArray())   this way is wrong, you can set variable as char