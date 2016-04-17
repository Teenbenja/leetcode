/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
      if(head == null) return head;
      
      ListNode pre = head;
      ListNode cur = head.next;
      
      while(cur != null) {
        if(pre.val == cur.val) {
          pre.next = cur.next;
        }
        else {
          pre = cur;
        }
        cur = cur.next;
      }
      
      return head;
        
    }
}