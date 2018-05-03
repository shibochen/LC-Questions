/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
    ListNode fast = head, slow = head;
    while (fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
    }
    if (fast != null) { // odd nodes: let right half smaller
        slow = slow.next;
    }
    slow = reverse(slow);
    fast = head;

    while (slow != null) {
        if (fast.val != slow.val) {
            return false;
        }
        fast = fast.next;
        slow = slow.next;
    }
    return true;
  }

  public ListNode reverse(ListNode head) {
      ListNode prev = null;
      while (head != null) {
          ListNode next = head.next;
          head.next = prev;
          prev = head;
          head = next;
      }
      return prev;
  }
}

/*
思路：首先找到中间点，然后反转中间数后面的元素，再比较前面和后面的元素是否相等
Time:O(n)  Space:O(1)
*/
