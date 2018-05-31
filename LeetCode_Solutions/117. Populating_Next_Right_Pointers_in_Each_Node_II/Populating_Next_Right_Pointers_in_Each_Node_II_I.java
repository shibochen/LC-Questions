/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode head = null; //head of the next level
        TreeLinkNode prev = null; // the leading node on the next level
        TreeLinkNode cur = root; // current node of current level

        while (cur != null) {
            while (cur != null) { // iterate on the current level
              // left child
                if (cur.left != null) {
                    if (prev != null) {
                        prev.next = cur.left;
                    } else {
                        head = cur.left;
                    }
                    prev = cur.left;
                }
              //right child
                if (cur.right != null) {
                    if (prev != null) {
                        prev.next = cur.right;
                    } else {
                        head = cur.right;
                    }
                    prev = cur.right;
                }
                cur = cur.next;
            }
            //move to next node, reset head and prev
            cur = head;
            head = null;
            prev = null;
        }
    }
}
/*
这里用三个variable
cur代表当前level上的node
prev代表下个level连接的点，连接每个node
head就是帮助cur移动到下一位

比如：
    1
  2   3
4  5    7

当cur为第一层              2   3
head一直停留在4，        4   5   7
prev不停向右移动连接每个点知道遇到null
*/
