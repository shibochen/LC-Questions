class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next  == null) return head;
        
        ListNode pre = null;
        while(head != null ) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }
}

Input: 1->2->3->4->5->NULL

Trial 1:    null  1->2->3->4->5->NULL
            p     h  t
            1->null 2->3->4->5->NULL
            p       h  t
Trial 2:    2->1->null 3->4->5->NULL
            p          h  t
Output: 5->4->3->2->1->NULL
O: O(n)
S: O(1)