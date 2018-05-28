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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> currLevel = new Stack<TreeNode>();
        Stack<TreeNode> nextLevel = new Stack<TreeNode>();

        currLevel.push(root);
        boolean normalOrder = true;

        while (!currLevel.isEmpty()) {
            ArrayList<Integer> currLevelResult = new ArrayList<>();

            while (!currLevel.isEmpty()) {
                TreeNode node = currLevel.pop();
                currLevelResult.add(node.val);

                if (normalOrder) {
                    if (node.left != null){
                        nextLevel.push(node.left);
                    }
                    if (node.right != null) {
                        nextLevel.push(node.right);
                    }
                } else {
                    if (node.right != null) {
                        nextLevel.push (node.right);
                    }
                    if (node.left != null) {
                        nextLevel.push (node.left);
                    }
                }
            }

            result.add(currLevelResult);
            Stack<TreeNode> temp = currLevel;
            currLevel = nextLevel;
            nextLevel = temp;
            normalOrder = !normalOrder;
        }

        return result;
    }
}

/*
Zigzag order: from left to right, then right to left for the next level and alternate between

two stack: currLevel and nextLevel
第一个stack 记录当前
第二个stack 记录下一个level
在while里，temp 用来循环交替
normalOrder 记录当前level的zigzag order顺序： 左到右，还是右到左
*/
