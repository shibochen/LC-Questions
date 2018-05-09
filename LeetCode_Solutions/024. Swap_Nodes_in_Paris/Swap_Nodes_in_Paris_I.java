/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return head;

        ListNode previous = head;
        ListNode current = head.next;
        int i = 1;
        while(current != null){
            if(++i % 2 == 0){
                int temp = previous.val;
                previous.val = current.val;
                current.val = temp;
            }
            previous = current;
            current = current.next;
        }
        return head;
    }
}

/*
思路：头出现第一个位置，i = 1. 当 i 是 even number 就进行前后对换

Time: O(n)   Space: O(1)
*/
