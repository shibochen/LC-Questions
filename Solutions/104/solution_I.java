class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        
        int l = maxDepth(root.left) + 1;
        int r = maxDepth(root.right) + 1;
        
        return Math.max(l, r);
    }
}

https://goo.gl/GqUfcw
O(n)
O(n)