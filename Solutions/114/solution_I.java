class Solution {
    
    private TreeNode prev = null;
    
    public void flatten(TreeNode root) {
        if (root == null) return;
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
}


题意：把树转化为链表
思路：后续遍历
O(n)
O(n)