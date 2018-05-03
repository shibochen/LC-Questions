/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //boundary check
    if(headA == null || headB == null) return null;

    ListNode a = headA;
    ListNode b = headB;

    //if a & b have different len, then we will stop the loop after second iteration
    while( a != b){
    	//for the end of first iteration, we just reset the pointer to the head of another linkedlist
        a = a == null? headB : a.next;
        b = b == null? headA : b.next;
    }

    return a;
  }
}

/*
A: a1 -> a2 -> c1 -> c2 -> c3 -> b1 -> b2 -> b3 -> c1 -> c2 -> c3
B: b1 -> b2 -> b3 -> c1 -> c2 -> c3 -> a1 -> a2 -> c1 -> c2 -> c3
Time:O(m + n)   Space: O(1)
*/
