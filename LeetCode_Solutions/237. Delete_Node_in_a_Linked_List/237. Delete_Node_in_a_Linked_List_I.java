	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	class Solution {
	    public void deleteNode(ListNode node) {
	         node.val = node.next.val;
	         node.next = node.next.next;
	    }
	}

	/*
	上述代码表示node的当前值变成他后一位的值
	然后在删除最后一位就可以，以下是流程
  1 -> 2 -> 3 -> 4
  1 -> 2 -> 4 -> 4
	1 -> 2 -> 4
	Time: O(1)   Space: O(1)
	*/
