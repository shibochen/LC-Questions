class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            if (cur.left == null && cur.right == null) {
                if (cur.val == sum) return true;
            }
            if (cur.right != null) {
                stack.push(cur.right);
                cur.right.val += cur.val;
            }
            if (cur.left != null) {
                stack.push(cur.left);
                cur.left.val += cur.val;
            }
        }
        return false;
    }
}

O(n)
O(n)