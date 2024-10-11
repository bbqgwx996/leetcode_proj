package leetcode05.src;
import java.lang.classfile.ClassFile;
import java.lang.classfile.components.ClassPrinter;
import java.rmi.Remote;
import java.util;




public class code19 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
    public void main(String[] args) {
        code19 removetest = new code19();
        ListNode head5 = new ListNode(5,null);
        ListNode head4 = new ListNode(4,head5);
        ListNode head3 = new ListNode(3,head4);
        ListNode head2 = new ListNode(2,head3);
        ListNode head1 = new ListNode(1,head2);
        ListNode ans = removetest.removeNthfromEnd(head1, 3);
    }
     /*   Definition for singly-linked list. */
     public code19(){

     }

    public ListNode removeNthfromEnd (ListNode head, int n){
        ListNode dummy = new ListNode(0,head);
        ListNode current = dummy;
        int length = getLength(head);
        for (int i = 0; i < length-n+1; i++){
            current = current.next;
        }
        current.next = current.next.next;
        return dummy.next;
    }
    public int getLength (ListNode head)
    {
        int length = 0;
        while(head != null)
        {
            length++;
            head = head.next;
        }
        return length;
    }
   
}
