    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            //create a new node
            ListNode result = new ListNode(0);
            ListNode current = result;

            //check if two list are null or not
            while(l1 != null && l2 != null){
                //compare value of two lists
                if(l1.val <= l2.val){
                    current.next = l1;
                    l1 = l1.next;
                }else{
                    current.next = l2;
                    l2 = l2.next;
                }
                current = current.next;
            }
            //if l1 == null, point to l2; otherwise, point to l1
            current.next = l1 == null ? l2 : l1;

            return result.next;
        }
    }
    /*
    一般情况可以建立虚node来解决问题

    Time: O(n) space: O(1);
    */
