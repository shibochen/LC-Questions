class Solution {
    public int countNodes(TreeNode root) {
        int left = helper(root, true);
        int right = helper(root, false);
       if(left == right) {
           return (1 << left) - 1;
       } else {
           return 1 + countNodes(root.left) + countNodes(root.right);
       }
    }
    
    public int helper(TreeNode root, boolean isLeft) {
        if (root == null) return 0;
        return isLeft ? helper(root.left, isLeft) + 1 : helper(root.right, isLeft) + 1;
    }
}


题意： 计算complete binary search tree 的 树点
思路： 二叉树的总数点是  2^n - 1
O(n)
O(n)