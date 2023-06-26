class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode currp=head;
        ListNode prev_p=null;
        ListNode next_p;
        while(currp!=null){
            next_p=currp.next;
            currp.next=prev_p;
             prev_p=currp;
            currp=next_p;
        }
        head=prev_p;
        return head;  
    }
}
