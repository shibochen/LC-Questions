/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

        ListNode slow = head, fast = head;
        //find the middle 
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next = null;
        second = reverse(second);

        ListNode first = head;

        //merge two lists
        while(second != null){
            ListNode next = first.next;
            first.next = second;
            second = second.next;
            first = first.next;
            first.next = next;
            first = first.next;
        }
    }

      //reverse second half of list
      public ListNode reverse(ListNode head){
            ListNode prev = null;
            while(head != null){
                ListNode temp = head.next;
                head.next = prev;
                prev = head;
                head = temp;
            }
          return prev;
        }
}

/*
思路： 1.找到middle点，断开
      2. reverse后半部分
      3. 重新合并
*/
