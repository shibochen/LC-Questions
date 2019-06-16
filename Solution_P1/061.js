var rotateRight = function(head, k) {
    if (!head || !head.next) return head;
        let index = head;
        let len = 1;
        while (index.next != null) {
            index = index.next;
            len++;
        }
        index.next = head;
        for (let i = 1; i < len - k % len; i++) {
            head = head.next;
        }
        let res = head.next;
        head.next = null;
        return res;
};