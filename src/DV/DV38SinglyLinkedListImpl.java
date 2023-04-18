package DV;

public class DV38SinglyLinkedListImpl {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }

    }


    public static void main(String[] args) {

        DV38SinglyLinkedListImpl sll = new DV38SinglyLinkedListImpl();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        //setting the next to form linked list
        sll.head.next = second;
        second.next = third;
        third.next = fourth;



    }
}
