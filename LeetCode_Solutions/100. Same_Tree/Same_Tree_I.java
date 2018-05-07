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
    public boolean isSameTree(TreeNode p, TreeNode q) {
    if(p == null && q == null) return true;
    if(p == null || q == null) return false;
    if(p.val == q.val)
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    return false;
    }
}

/*
Method: recursive

line 11 and line 12 can not be swtiched. Otherwise, it cause error. 

Time: O(n)   Space: O(n)
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
    if(p == null && q == null) return true;
    if(p == null || q == null) return false;
    if(p.val == q.val)
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    return false;
    }
}

/*
Method: recursive

line 11 and line 12 can not be swtiched. Otherwise, it cause error. 

Similar to 101.

Time: O(n)   Space: O(n)
*/
>>>>>>> 59ec0388aed1323bba68cd071f3bc1e7cff917c3
