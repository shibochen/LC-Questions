class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = dummy.next;
        
        for (int i = 1; i < m; i++) {
            cur = cur.next;
            pre = pre.next;
        }
        
        for (int j = 0; j < n - m; j++) {
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = pre.next;
            pre.next = temp;
        }
        return dummy.next;
    }
}


O(n)
O(1)