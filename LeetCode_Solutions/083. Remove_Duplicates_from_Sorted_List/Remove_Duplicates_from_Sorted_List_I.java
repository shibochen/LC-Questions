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
            if(head == null) return head;
            
            ListNode current = head.next;
            ListNode previous = head;
            
            while(current != null){
                if(previous.val == current.val){
                    previous.next = current.next;
                }else{
                    previous = current;
                }
                current = current.next;
            }
            return head;
        }
    }