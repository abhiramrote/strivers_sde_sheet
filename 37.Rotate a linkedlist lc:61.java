class Solution {
    public ListNode rotateRight(ListNode head, int k) {     
        ListNode curhead=head,cur=head,head1=head;
        if (head == null || head.next == null || k == 0) {
          return head;
        }
        int c=1;
        while(cur.next!=null){
            cur=cur.next;
            c++;
        }
        cur.next=head;
        k%=c;
        for(int i=0;i<c-k;i++){
            cur=cur.next;
        }
       head = cur.next;
        cur.next = null;
      return head ;
    }
}
