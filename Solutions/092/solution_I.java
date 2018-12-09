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

Input: 1->2->3->4->5->NULL, m = 2, n = 4
       
line 8-11    dummy->1->2->3->4->5->NULL
                    p  c  t
line 13-18   T1       14:  temp = 3
                      15:  2->4
                      16:  3->2
                      17:  1->3 
                      总： 1->3->2->4  
             ...
Output:   Output: 1->4->3->2->5->NULL
O(n)
O(1)