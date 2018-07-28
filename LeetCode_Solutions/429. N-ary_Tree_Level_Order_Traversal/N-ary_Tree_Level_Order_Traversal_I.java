/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new LinkedList<>();

        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new LinkedList<>();
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node current = queue.poll();
                list.add(current.val);
                for (Node c : current.children) {
                    queue.offer(c);
                }
            }
            result.add(list);
        }
        return result;
    }
}
