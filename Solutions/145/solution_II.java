class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
       LinkedList<Integer> result = new LinkedList<>();
       if (root == null) return result;
       Stack<TreeNode> stack = new Stack<>();
       stack.push(root);
       
       while (!stack.isEmpty()) {
           TreeNode node = stack.pop();
           result.addFirst(node.val);
           
           if (node.left != null) stack.push(node.left);
           if (node.right != null) stack.push(node.right);
       }
      
      return result;
    }
}

O(n)
O(n)