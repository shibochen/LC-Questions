/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode middle = getMiddle(head);
        ListNode next = middle.next;
        middle.next = null;
        return merge(sortList(head),sortList(next));
    }

    public ListNode getMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode merge(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while(a != null && b != null){
            if(a.val <= b.val){
                current.next = a;
                a = a.next;
            }else{
                current.next = b;
                b = b.next;
            }
            current = current.next;
        }
        if(a == null) current.next = b;
        else current.next = a;

        return dummy.next;
    }
}

/*
Merge sort

Time: O(nlogn)    Space: O(n)
*/
