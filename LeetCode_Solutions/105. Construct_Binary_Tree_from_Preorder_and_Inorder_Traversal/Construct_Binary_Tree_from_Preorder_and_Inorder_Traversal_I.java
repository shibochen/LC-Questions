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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper (0, 0, inorder.length - 1, preorder, inorder);
    }
    private TreeNode helper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (preStart > preorder.length - 1 || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int inIndex = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == root.val) {
                inIndex = i;
                //break;
            }
        }
        root.left = helper(preStart + 1, inStart, inIndex - 1, preorder, inorder);
        root.right = helper(preStart + inIndex - inStart + 1, inIndex + 1, inEnd, preorder, inorder);
        return root;
    }
}

/*
首先，我们有两个array，分别是preorder和 inorder
由于根据preorder traversal的特点：root-left-right
preorder[0] 就是我们所要建立tree的根
然后我们用loop在inorder里也定位出根节点的位置，并以根节点的位置将中序遍历拆分为左右两个部分，
分别对其递归调用原函数

http://www.pythontutor.com/visualize.html#code=class%20TreeNode%7B%0A%20%20%20%20int%20val%3B%0A%20%20%20%20TreeNode%20left%3B%0A%20%20%20%20TreeNode%20right%3B%0A%20%20%20%20public%20TreeNode%28int%20value%29%20%7B%0A%20%20%20%20%20%20%20%20val%20%3D%20value%3B%0A%20%20%20%20%20%20%20%20left%20%3D%20null%3B%0A%20%20%20%20%20%20%20%20right%20%3D%20null%3B%0A%20%20%20%20%7D%0A%7D%0Apublic%20class%20BinaryTree%20%7B%0A%20%20%20%20TreeNode%20root%3B%0A%20%20%20%20%0A%20%20%20%20%20public%20static%20TreeNode%20buildTree%28int%5B%5D%20preorder,%20int%5B%5D%20inorder%29%20%7B%0A%20%20%20%20%20%20%20%20return%20helper%20%280,%200,%20inorder.length%20-%201,%20preorder,%20inorder%29%3B%0A%20%20%20%20%7D%0A%20%20%20%20private%20static%20TreeNode%20helper%28int%20preStart,%20int%20inStart,%20int%20inEnd,%20int%5B%5D%20preorder,%20int%5B%5D%20inorder%29%20%7B%0A%20%20%20%20%20%20%20%20if%20%28preStart%20%3E%20preorder.length%20-%201%20%7C%7C%20inStart%20%3E%20inEnd%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20return%20null%3B%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20TreeNode%20root%20%3D%20new%20TreeNode%28preorder%5BpreStart%5D%29%3B%0A%20%20%20%20%20%20%20%20int%20inIndex%20%3D%200%3B%0A%20%20%20%20%20%20%20%20for%20%28int%20i%20%3D%20inStart%3B%20i%20%3C%3D%20inEnd%3B%20i%2B%2B%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20if%20%28inorder%5Bi%5D%20%3D%3D%20root.val%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20inIndex%20%3D%20i%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20break%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20root.left%20%3D%20helper%28preStart%20%2B%201,%20inStart,%20inIndex%20-%201,%20preorder,%20inorder%29%3B%0A%20%20%20%20%20%20%20%20root.right%20%3D%20helper%28preStart%20%2B%20inIndex%20-%20inStart%20%2B%201,%20inIndex%20%2B%201,%20inEnd,%20preorder,%20inorder%29%3B%0A%20%20%20%20%20%20%20%20return%20root%3B%0A%20%20%20%20%7D%0A%20%20%20%20public%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%20%20%20%20%20%20%20%20//%20TODO%20Auto-generated%20method%20stub%0A%20%20%20%20%20%20%20%20int%5B%5D%20preorder%20%3D%20%7B3,%209,%2020,%2015,%207%7D%3B%0A%20%20%20%20%20%20%20%20int%5B%5D%20inorder%20%3D%20%7B9,%203,%2015,%2020,%207%7D%3B%0A%20%20%20%20%20%20%20%20System.out.println%28buildTree%28preorder,%20inorder%29%29%3B%0A%20%20%20%20%7D%0A%0A%7D&cumulative=false&heapPrimitives=nevernest&mode=edit&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false
*/
