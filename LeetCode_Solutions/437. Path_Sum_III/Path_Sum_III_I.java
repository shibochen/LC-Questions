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
      public int pathSum(TreeNode root, int sum) {
       if (root == null) return 0;

       return containPath(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);

    }

    private int containPath(TreeNode root, int sum) {
       if (root == null) return 0;
       int res = 0;
       if (root.val == sum) res++;
       res += containPath(root.left, sum - root.val);
       res += containPath(root.right, sum - root.val);
       return res;


    }
}

/*
Time: O(n)   Space: O(n^2)
/
