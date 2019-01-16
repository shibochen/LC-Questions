class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        
        while(!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            if (cur.right != null) stack.push(cur.right);
            if (cur.left != null) stack.push(cur.left);
            result.add(cur.val);
        }
        return result;
    }
}

栈是基于先进后出的原则，所以在9 - 10， 先加右边在左边

O(n)
O(n)