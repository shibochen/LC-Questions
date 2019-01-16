class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) return result;
        helper(result, root, 0);
        return result;
    }
    
    public void helper(List<List<Integer>> result, TreeNode root, int level) {
        if (root == null) return;
        if (level >= result.size()) {
            result.add(new LinkedList<>());
        }
        result.get(level).add(root.val);
        helper(result, root.left, level + 1);
        helper(result, root.right, level + 1);
    }
}

