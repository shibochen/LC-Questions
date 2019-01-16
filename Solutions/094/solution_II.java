class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(result, root);
        return result;
    }
    
    public void helper(List<Integer> result, TreeNode root) {
        if (root == null) return;
        helper(result, root.left);
        result.add(root.val);
        helper(result, root.right);
    }
}



https://goo.gl/S2CPp5