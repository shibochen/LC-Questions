public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        int lengthA = length(headA);
        int lengthB = length(headB);
        if(lengthA > lengthB) {
            while(lengthA != lengthB){
                headA = headA.next;
                lengthA--;
            }
        }else {
            while(lengthA != lengthB) {
                headB = headB.next;
                lengthB--;
            }
        }
        while(headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
    
    public int length(ListNode head) {
        int length = 1;
        while (head != null) {
            head = head.next;
            length++;
        }
        return length;
    }
}

T: O(n)
S: O(1)