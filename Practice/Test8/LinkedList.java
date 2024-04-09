package Practice.Test8;

public class LinkedList {
    // middle of linked list
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
//        Node second = new Node(2);
//        list.head.next = second;
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = null;
        list.printList(list.head);
        list.printMiddle(list.head);

    }

    private void printMiddle(Node head) {
        if (head == null) {
            return;
        }
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null && slow != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (slow != null) {
            System.out.println("\nMiddle element: " + slow.data);
        }
    }

    private void printList(Node head) {
        if (head == null) {
            return;
        }
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
}
