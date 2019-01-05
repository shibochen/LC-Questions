class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        boolean dir = true;
        queue.offer(root);
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if (dir) {
                    list.add(cur.val);
                } else {
                    list.add(0, cur.val);
                }
                if (cur.left != null) queue.offer(cur.left);
                if (cur.right != null) queue.offer(cur.right);
            }
            result.add(list);
            dir = dir ? false : true;
        }
        return result;
    }
}


题意： 二叉树按Z字形横扫，把个个值加入到链表里
思路: 利用BFS来解决，并且做一点修改就可以
O(n)
O(n)