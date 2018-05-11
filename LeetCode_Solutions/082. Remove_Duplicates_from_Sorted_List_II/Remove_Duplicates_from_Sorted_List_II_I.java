/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode current = head, previous = dummy;

        while(current != null){
            while(current.next != null && current.val == current.next.val){
                current = current.next;
            }
            if(previous.next == current){
                previous = previous.next;
            }else{
                previous.next = current.next;
            }
            current = current.next;
        }
        return dummy.next;
    }
}

/*
Time: O(n)  Space: O(1) 
*/
