package Practice.Test8;

public class LinkedList3 {
    Node head;

    LinkedList3() {
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
        LinkedList3 list3 = new LinkedList3();
        list3.head = new Node(1);
        list3.head.next = new Node(2);
        list3.head.next.next = new Node(3);
        list3.head.next.next.next = new Node(4);
        list3.head.next.next.next.next = new Node(5);
        list3.printList(list3.head);
        list3.countElements(list3.head);
    }

    private void countElements(Node head) {
        int count = 0;
        if (head == null) {
            return;
        }
        Node n = head;
        while (n != null) {
            count++;
            n = n.next;
        }
        System.out.println("\nNo of elements: " + count);
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