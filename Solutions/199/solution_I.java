class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        helper(result, root, 0);
        return result;
    }
    public void helper(List<Integer> result, TreeNode root, int level) {
        if(root == null) return;
        if(result.size() == level) {
            result.add(root.val);
        }
        helper(result, root.right, level + 1);
        helper(result, root.left, level + 1);
    }
}


O(n)
O(n)