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
    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean valid(TreeNode root, long minVal, long maxVal){
        if(root == null) return true;
        if(root.val <= minVal || root.val >= maxVal) return false;
        return valid(root.left, minVal, root.val) && valid(root.right, root.val, maxVal);
    }
}

/*
recusive methods
Time: O(n)  Space: O(n)

http://www.pythontutor.com/visualize.html#code=class%20TreeNode%7B%0A%20%20%20%20int%20val%3B%0A%20%20%20%20TreeNode%20left%3B%0A%20%20%20%20TreeNode%20right%3B%0A%20%20%20%20public%20TreeNode%28int%20value%29%20%7B%0A%20%20%20%20%20%20%20%20val%20%3D%20value%3B%0A%20%20%20%20%20%20%20%20left%20%3D%20null%3B%0A%20%20%20%20%20%20%20%20right%20%3D%20null%3B%0A%20%20%20%20%7D%0A%7D%0Apublic%20class%20BinaryTree%20%7B%0A%20%20%20%20TreeNode%20root%3B%0A%20%20%20%20%0A%20%20%20%20%20public%20%20static%20boolean%20isValidBST%28TreeNode%20root%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20return%20valid%28root,%20Long.MIN_VALUE,%20Long.MAX_VALUE%29%3B%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20private%20static%20boolean%20valid%28TreeNode%20root,%20long%20minVal,%20long%20maxVal%29%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20if%28root%20%3D%3D%20null%29%20return%20true%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20if%28root.val%20%3C%3D%20minVal%20%7C%7C%20root.val%20%3E%3D%20maxVal%29%20return%20false%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20return%20valid%28root.left,%20minVal,%20root.val%29%20%26%26%20valid%28root.right,%20root.val,%20maxVal%29%3B%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%0A%20%20%20%20public%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%20%20%20%20%20%20%20%20//%20TODO%20Auto-generated%20method%20stub%0A%20%20%20%20%20%20%20%20BinaryTree%20tree%20%3D%20new%20BinaryTree%28%29%3B%0A%20%20%20%20%20%20%20%20%0A%20%20%20%20%20%20%20%20tree.root%20%3D%20new%20TreeNode%285%29%3B%0A%20%20%20%20%20%20%20%20tree.root.left%20%3D%20new%20TreeNode%281%29%3B%0A%20%20%20%20%20%20%20%20tree.root.right%20%3D%20new%20TreeNode%286%29%3B%0A%20%20%20%20%20%20%20%20//%20tree.root.right.left%20%3D%20new%20TreeNode%283%29%3B%0A%20%20%20%20%20%20%20%20//%20tree.root.right.right%20%3D%20new%20TreeNode%289%29%3B%0A%20%20%20%20%20%20%20%20System.out.println%28tree.isValidBST%28tree.root%29%29%3B%0A%20%20%20%20%7D%0A%0A%7D&cumulative=false&heapPrimitives=nevernest&mode=edit&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false
*/
