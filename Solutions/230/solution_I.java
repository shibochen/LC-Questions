class Solution {
    public static int count = 0;
    public static int number = 0;
    
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        helper(root);
        return number;
    }
    
    public void helper(TreeNode root) {
        if(root == null) return;
        helper(root.left);
        count--;
        if (count == 0) {
            number = root.val;
            return;
        }
        helper(root.right);
    }
}

题意：找出二叉树中第n个最小值
思路： 递归中序遍历

O(n)
O(n)