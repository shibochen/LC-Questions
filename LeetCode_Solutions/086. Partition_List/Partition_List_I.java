/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0), dummy2 = new ListNode(0);
        ListNode current1 = dummy1, current2 = dummy2;

        while(head != null){
            if(head.val < x){
                current1.next = head;
                current1 = head;
            }else{
                current2.next = head;
                current2 = head;
            }
            head = head.next;
        }
        current2.next = null;
        current1.next = dummy2.next;

        return dummy1.next;
    }
}

/*
the basic idea is to maintain two queues, the first one stores all nodes with val less than x ,
and the second queue stores all the rest nodes. Then concat these two queues. Remember to set
the tail of second queue a null next, or u will get TLE.

Time: O(n)   Space: O(1)
*/
