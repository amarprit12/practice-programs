package Practice;

public class LinkedList2 {
    Node head;

    LinkedList2() {
        head = null;
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList2 list2 = new LinkedList2();
        list2.head = new Node(1);
        list2.head.next = new Node(2);
        list2.head.next.next = new Node(3);
        list2.head.next.next.next = new Node(4);
        list2.head.next.next.next.next = new Node(5);
        list2.printList(list2.head);
        list2.head = list2.reverseList(list2.head);
        System.out.println("\nList after reverse: ");
        list2.printList(list2.head);
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

    private Node reverseList(Node head) {
        Node current = head;
        Node next;
        Node prev = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

}