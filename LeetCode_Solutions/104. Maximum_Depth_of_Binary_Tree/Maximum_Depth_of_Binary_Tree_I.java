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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int l = maxDepth(root.left) + 1;
        int r = maxDepth(root.right) + 1;
        return Math.max(l, r);
    }
}

/*
Method: recursive

Time: O(n)  space: O(n)

https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=%0Apublic+class+max+%7B%0A%09+static+class+Node%0A%09++++%7B%0A%09++++++++int+data%3B%0A%09++++++++Node+left%3B%0A%09++++++++Node+right%3B%0A%09+++++++++%0A%09++++++++//+constructor%0A%09++++++++Node(int+data)%7B%0A%09++++++++++++this.data+%3D+data%3B%0A%09++++++++++++left+%3D+null%3B%0A%09++++++++++++right+%3Dnull%3B%0A%09++++++++%7D%0A%09++++%7D%0A%09+%0A%09+public+static+int+maxDepth(Node+root)+%7B%0A%09++++++++if(root+%3D%3D+null)+return+0%3B%0A%09++++++++int+l+%3D+maxDepth(root.left)+%2B+1%3B%0A%09++++++++int+r+%3D+maxDepth(root.right)+%2B+1%3B%0A%09++++++++return+Math.max(l,+r)%3B%0A%09++++%7D%0A%09+%0A%09public+static+void+main(String%5B%5D+args)+%7B%0A%09%09//+TODO+Auto-generated+method+stub%0A%09%09Node+root+%3D+new+Node(1)%3B%0A++++++++root.left+%3D+new+Node(2)%3B%0A++++++++root.right+%3D+new+Node(3)%3B%0A++++++++root.left.left+%3D+new+Node(4)%3B%0A++++++++%0A++++++++%0A++++++++System.out.println(maxDepth(root))%3B%0A%09%7D%0A%0A%7D%0A&mode=
*/
