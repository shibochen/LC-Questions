class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<>();
//        List<Integer> list = new LinkedList<>();  这种写法不行，List没有addFirst 方法
        if(root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            list.addFirst(cur.val);
            if(cur.left != null) stack.push(cur.left);
            if(cur.right != null) stack.push(cur.right);
        }
        return list;
    }
}


O(n)
O(n)
    
跟先序遍历的写法差不多，注意先加左边再加右边（line 12 - 13）