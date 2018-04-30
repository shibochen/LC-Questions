   public ListNode reverseList(ListNode head) {
        //declaration and assignment of new ListNode
        ListNode prev = null;
        
        //while loop is used to swap nodes
        while( head != null){
            ListNode tempNode = head.next;
            head.next = prev;
            prev = head;
            head = tempNode;
        }
        
        return prev;
    }