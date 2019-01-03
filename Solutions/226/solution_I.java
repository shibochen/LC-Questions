class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}

题意：把二叉树左右节点互换
思路： 递归然后左右互换

O(n)
O(n)