package Practice.Test8;


public class LinkedList1 {
    Node head;

    LinkedList1() {
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
        LinkedList1 list1 = new LinkedList1();
        list1.head = new Node(1);
        Node second = new Node(2);
        list1.head.next = second;
        list1.head.next.next = new Node(3);
        list1.head.next.next.next = new Node(4);
        list1.head.next.next.next.next = new Node(5);
        list1.head.next.next.next.next.next = second;
        detectLoop(list1.head);
    }

    private static void detectLoop(Node head) {
        boolean loopExists = false;
        if (head == null) {
            return;
        }
        Node fastPtr, slowPtr;
        fastPtr = head;
        slowPtr = head;
        while (fastPtr != null && fastPtr.next != null && slowPtr != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (fastPtr == slowPtr) {
                loopExists = true;
                break;
            }

        }
        if (loopExists) {
            System.out.println("Loop detected");
        } else {
            System.out.println("Loop doesn't exist");
        }
    }
}
