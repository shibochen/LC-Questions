class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;
        
        ListNode tail = head;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        tail.next = head;
        int count = length - k % length;
        while(count > 0) {
            tail = tail.next;
            count--;
        }
        head = tail.next;
        tail.next = null;
        return head;
    }
}

O(n)
O(1)