/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      //  O(n + m) time
      if(l1 == null) return l2;
      if(l2 == null) return l1;
      
      ListNode dummy = new ListNode(0);
      ListNode head = dummy;
      
      while(l1 != null && l2 != null) {
        if(l2.val < l1.val) {
          dummy.next = l2;
          dummy = l2;
          l2 = l2.next;
        }else {
          dummy.next = l1;
          dummy = l1;
          l1 = l1.next;
        }
      }
      
      dummy.next = l1 == null ? l2 : l1;
      
      return head.next;
      
    }
}