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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(list, root);
        return list;
    }
    public void helper(List<Integer> list, TreeNode root){
        if(root != null){
            if(root.left != null){
                helper(list, root.left);
            }
            list.add(root.val);
            if(root.right != null){
                helper(list, root.right);
            }
        }
    }
}
