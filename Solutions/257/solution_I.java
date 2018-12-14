class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) return result;
        helper(result, root, "");
        return result;
    }
    public static void helper(List<String> result, TreeNode root, String path) {
        if (root.left == null && root.right == null) {
            result.add(path + root.val);
        }
        if (root.left != null) {
            helper(result, root.left, path + root.val + "->");
        }
        if (root.right != null) {
            helper(result, root.right, path + root.val + "->");
        }
    }
}

O(n)
O(n)