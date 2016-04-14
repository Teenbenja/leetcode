public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //  O(n) time
        if(head == null || head.next == null) return null;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode f = dummy, t = dummy;
        
        for(int i = 0; i < n; i++) {
            f = f.next;
        }
        
        while(f.next != null) {
            f = f.next;
            t = t.next;
        }
        
        t.next = t.next.next;
        
        return dummy.next;

        
    }
}