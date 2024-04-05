package Practice.Test5;

public class LinkedList {
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
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.printList(list.head);
        list.printNthNodeFromLast(list.head, 2);
    }

    private void printNthNodeFromLast(Node head, int k) {
        if (head == null) {
            return;
        }
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        if (k > count) {
            return;
        }
        temp = head;
        for (int i = 1; i < count - k + 1; i++) {
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    private void printList(Node head) {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
