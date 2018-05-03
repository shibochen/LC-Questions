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
        //check boundary
        if(headA == null || headB == null) return null;

        //get length for both ListNode
        int lengthA = getLength(headA);
        int lengthB = getLength(headB);

        //compare lengths
        if(lengthA > lengthB){
            //if headA's length is greater, shorten it
            while(lengthA != lengthB){
                headA = headA.next;
                lengthA--;
            }
        }else{
            //if headB's length is greater, shorten it
            while(lengthA != lengthB){
                headB = headB.next;
                lengthB--;
            }
        }
        //once they have equal length, find interection node
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
    public int getLength(ListNode head){
        int length = 1;
        while(head != null){
            head = head.next;
            length++;
        }
        return length;
    }
}

/*
思路：查找两个ListNodes的长度，假如他们拥有相同长度，那么就比较值，
      在找到相同值就可以。如果长度不相等，把长的一个ListNode减成相同
      长度，再比较值和找相同值
Time: O(n)   Space: O(1)
*/
