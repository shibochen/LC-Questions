class Solution {
    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }
    public int sum(TreeNode root, int num) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) {
            return num * 10 + root.val;
        }
        return sum(root.left, num * 10 + root.val) + sum(root.right, num * 10 + root.val);
    }
}


O(n)
O(n)