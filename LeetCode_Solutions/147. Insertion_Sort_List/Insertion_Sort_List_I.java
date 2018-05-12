/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = head;
        ListNode prev = null, temp = null;

        while(current != null && current.next != null){
            if(current.val <= current.next.val){
                current = current.next;
            }else{
                temp = current.next;
                current.next = temp.next;
                prev = dummy;
                while(prev.next.val <= temp.val){
                        prev = prev.next;
                }
                temp.next = prev.next;
                prev.next = temp;
            }
        }
        return dummy.next;
    }
}
/*
list:    dummy-->60 --> 71 --> 11 --> 24 --->3
          P      C
step1:   dummy-->60 --> 71 --> 11 --> 24 --->3
          P              C
                  --------------
                  ||            |
step2:   dummy--> 60 --> 71--> 11 --> 24 --->3
          P              C     t
            |              |  ||       ||
            |              ---||----------
            |-------------------

            dummy --> 11 --> 60 --> 71 --24--3
Time: O(n^2)  Space: O(1);
*/
