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
    public boolean isBalanced(TreeNode root) {
        return maxDepth(root) != -1;
    }

    public int maxDepth(TreeNode root){
        if(root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        //left == -1 or right == -1 因为可能在某个sub-node 就等于 -1，
        if(left == -1 || right == -1 || Math.abs(left - right) > 1){
            return -1;
        }
        return Math.max(left, right) + 1;
    }
}

/*
Button-Up
    1         1's height = 3;
  /   \
  2   3       2's height = 2   3's height = 1   Diff = 1
/   \
4    5        4 & 5's height = 1   Diff = 0

        1      1's height = -1
      /   \
      2   3    2's height = 3   3's height = 1    diff= 2   ( Noo...)
    /   \
    4    5      4's height = 1   5's height = 2   diff = 1
          \
          9     9's  height = 1
Time: O(n)   Space: O(n)
*/
