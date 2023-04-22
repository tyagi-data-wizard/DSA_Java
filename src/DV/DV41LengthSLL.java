package DV;

import java.util.List;

public class DV41LengthSLL {

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;

        }
    }

    public int size(){
        if(head == null){
            return 0;
        }
        int length = 0;
        ListNode current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            length++;
            current=current.next;
        }

        return length;
    }

    public static void main(String[] args) {

        DV41LengthSLL sll = new DV41LengthSLL();

        sll.head = new ListNode(11);
        ListNode second = new ListNode(4);
        ListNode third = new ListNode(3);

        sll.head.next = second;
        second.next = third;

        System.out.println("\nThe length of SLL is : "+sll.size());
    }
}
