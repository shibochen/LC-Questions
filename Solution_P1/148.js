var sortList = function(head) {
    if (head == null || head.next == null) return head;
    let middle = findMiddle(head);
    let next = middle.next;
    middle.next = null;
    
    return merge(sortList(head), sortList(next));
};

function findMiddle(head) {
    let slow = head;
    let fast = head;
    while (fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next;
    }
    return slow;
}

function merge(l1, l2) {
    let dummy = new ListNode(0);
    let curr = dummy;
    while (l1 != null && l2 != null) {
        if (l1.val <= l2.val) {
            curr.next = l1;
            l1 = l1.next;
        } else {
            curr.next = l2;
            l2 = l2.next;
        }
        curr = curr.next;
    }
    
    if (l1 != null) {
        curr.next = l1;
    } else {
        curr.next = l2;
    }
    
    return dummy.next;
}