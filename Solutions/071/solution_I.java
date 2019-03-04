class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] paths = path.split("/+");
        
        for (String s : paths) {
            if (s.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!s.equals(".") && !s.equals("")) {
                stack.push(s);
            }
        }
        String res = "";
        while (!stack.isEmpty()) {
            res = "/" + stack.pop() + res;
        }
        if (res.length() == 0) return "/";
        
        return res;
    }
}
路径问题:
出现4种情况: . "" .. 字符串
当出现.. 返回上一级目录
当出现 . or "" 直接加入stack中
特殊情况只有 "" 直接返回 "/"
O(n)
O(n)