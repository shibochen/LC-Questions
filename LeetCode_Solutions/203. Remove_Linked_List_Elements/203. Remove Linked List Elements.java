	 public ListNode removeElements(ListNode head, int val) {
        //create a fake head
        ListNode fakeHead = new ListNode(-1);
        //assign head to the fakehead.next
        fakeHead.next = head;
        //create new variable to hold fakehead
        ListNode current = fakeHead;
        
        //loop to check if the element in linkednode has same value,val
        while(current.next != null){
            if(current.next.val == val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        
        return fakeHead.next;
    }