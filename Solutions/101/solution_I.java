class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
    
    public boolean isMirror(TreeNode q, TreeNode p) {
        if (q == null && p == null) return true;
        if (q == null || p == null) return false;
        
        if (q.val != p.val) return false;
        
        return isMirror(q.left, p.right) && isMirror(q.right, p.left); 
    }
}


O(n)
O(n)