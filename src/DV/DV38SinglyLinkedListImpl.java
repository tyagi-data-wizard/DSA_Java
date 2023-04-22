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

    //DV41
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

    //DV39
    public void display(){
        ListNode current = head;
        while(current!=null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("LinkedList has ended");
    }


    public static void main(String[] args) {

        //10 -> 1 -> 8 -> 11
        DV38SinglyLinkedListImpl sll = new DV38SinglyLinkedListImpl();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        //setting the next to form linked list
        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        //DV39
        sll.display();

        //DV41
        System.out.println("\nThe length of SLL is : "+sll.size());


    }
}
