class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode mid = findMid(head);
        ListNode r = mid.next;
        mid.next = null;
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(r);
        return mergeTwoLists(l1, l2);
    
    }
    
    public ListNode findMid(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode dummy = new ListNode(0);
        ListNode l = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                l.next = l1;
                l1 = l1.next;
                // l1.next = null;
                l = l.next;
            } else {
                l.next = l2;
                l2 = l2.next;
                // l2.next = null;
                l = l.next;
            }
        }
        if (l1 == null) l.next = l2;
        if (l2 == null) l.next = l1;
        return dummy.next;
    }
}

O(nlogn)
O(n)