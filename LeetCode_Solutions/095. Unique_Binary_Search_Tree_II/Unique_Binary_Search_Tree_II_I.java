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
    public List<TreeNode> generateTrees(int n) {
        if(n == 0) return new ArrayList<>();
        return generate(1, n);
    }
    private List<TreeNode> generate(int start, int end) {
        List<TreeNode> list = new ArrayList<>();

        if (start > end) {
            list.add(null);
            return list;
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> leftList = generate(start, i - 1);
            List<TreeNode> rightList = generate(i + 1, end);
            for (TreeNode left : leftList) {
                for (TreeNode right : rightList) {
                    //should create a new root here because
                    //it need to be different for each tree
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    list.add(root);
                }
            }
        }
        return list;
    }
}
/*
recusive method
Quote from LC discussion:
I start by noting that 1..n is the in-order traversal for any BST with nodes 1 to n.
So if I pick i-th node as my root, the left subtree will contain elements 1 to (i-1),
and the right subtree will contain elements (i+1) to n.
I use recursive calls to get back all possible trees for left and right subtrees
and combine them in all possible ways with the root.
*/
