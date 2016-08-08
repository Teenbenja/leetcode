/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
      
      if(head == null || head.next == null) return head;
      
      ListNode pre = new ListNode(0);
      ListNode res = pre;
      pre.next = head;
      
      while(head != null && head.next != null) {
        pre.next = head.next;
        head.next = pre.next.next;
        pre.next.next = head;
        pre = pre.next.next;
        head = pre.next;
      }
      
      return res.next;
      
    }
}