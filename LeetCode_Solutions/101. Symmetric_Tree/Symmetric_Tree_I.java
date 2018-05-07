<<<<<<< HEAD
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return helper(root.left, root.right);
    }

    public boolean helper(TreeNode q, TreeNode p){
        if(q == null && p == null) return true;
        if(q == null || p == null) return false;
        if(q.val != p.val) return false;
        return helper(q.left, p.right) && helper(q.right, p.left);
    }
}

/*
Method: recrusive

Similar to LC 100

Time: O(n)  Space: O(n)
*/
=======
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return helper(root.left, root.right);
    }

    public boolean helper(TreeNode q, TreeNode p){
        if(q == null && p == null) return true;
        if(q == null || p == null) return false;
        if(q.val != p.val) return false;
        return helper(q.left, p.right) && helper(q.right, p.left);
    }
}

/*
Method: recrusive

Similar to LC 100.

Time: O(n)  Space: O(n)
*/
>>>>>>> 59ec0388aed1323bba68cd071f3bc1e7cff917c3
