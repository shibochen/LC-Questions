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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return myBuildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }
    private TreeNode myBuildTree(int[] inorder, int iLeft, int iRight, int[] postorder, int pLeft, int pRight){
        if(iLeft > iRight || pLeft > pRight) return null;

        TreeNode root = new TreeNode(postorder[pRight]);
        int i = 0;
        for (i = iLeft; i < inorder.length; i++){
            if(inorder[i] == root.val) break;
        }
        root.left = myBuildTree(inorder, iLeft, i - 1, postorder, pLeft, pLeft + i - iLeft - 1);
        root.right = myBuildTree(inorder, i + 1, iRight, postorder, pLeft + i - iLeft, pRight - 1);

        return root;
    }
}

/*
跟105类似概念
通过postorder的最后一个element就是根，
然后找到inorder根的index number
以根节点的位置将中序遍历拆分为左右两个部分，
分别对其递归调用原函数
*/
