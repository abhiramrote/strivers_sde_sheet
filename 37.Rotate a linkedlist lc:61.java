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




class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        while(k!=0){
            Node t=head.next;
            curr.next=head;
            curr=curr.next;
            curr.next=null;
            head=t;
            k--;
        }
        return head;
    }
}
