/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = head;
        int length = 0;
        //get legnth
        while(current != null){
            length++;
            current = current.next;
        }
        //node at l-n because we add another dummy ListNode
        length -= n;
        current = dummy;

        //relink node at l-n to node at l - n + 2
        while(length > 0){
            length--;
            current = current.next;
        }
        current.next = current.next.next;

        return dummy.next;
    }
}

/*
思路：1. 找到这个list的总长度
     2. relink node at l-n to node at l - n + 2
Time: O(L)     Space: O(1)
*/
