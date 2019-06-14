```
var isPalindrome = function(head) {
    if (head == null) return true;
    let middle = findMiddle(head);
    middle.next = reverse(middle.next);
    
    let p = head, q = middle.next;
    while (p != null && q != null) {
        if (p.val != q.val) return false;
        p = p.next;
        q = q.next;
    }
    return true;
};

function findMiddle(head) {
    let slow = head;
    let fast = head.next;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}

function reverse(head) {
    let prev = null;
    while (head != null) {
        let temp = head.next;
        head.next = prev;
        prev = head;
        head = temp;
    }
    return prev;
}
```
首先找到这个链表的中间节点，然后将后面链表进行翻转，再进行对比