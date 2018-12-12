class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        helper(result, new ArrayList<>(), root, sum);
        return result;
    }
    
    public static void helper(List<List<Integer>> result, List<Integer> list, TreeNode root, int sum) {
        if (root == null) return;
        list.add(root.val);
        if (root.left == null && root.right == null) {
            if (root.val == sum) {
                result.add(new ArrayList<>(list));
            }
        }
        helper(result, list, root.left, sum - root.val);
        helper(result, list, root.right, sum - root.val);
        list.remove(list.size() - 1);
    }
}

O(n)
O(n)