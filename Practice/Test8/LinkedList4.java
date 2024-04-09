package Practice.Test8;

import java.util.Stack;

public class LinkedList4 {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    LinkedList4() {

    }

    public static void main(String[] args) {
        LinkedList4 list = new LinkedList4();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(2);
        list.head.next.next.next = new Node(1);
        boolean result = checkPalindrome(list.head);
        if (result) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");

        }
    }

    private static boolean checkPalindrome(Node head) {
        Node slow = head;
        boolean isPal = false;
        if (head == null) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        while (slow != null) {
            stack.push(slow.data);
            slow = slow.next;
        }
        while (head != null) {
            int i = stack.pop();
            if (i == head.data) {
                isPal = true;
            } else {
                isPal = false;
            }
            head = head.next;
        }
        return isPal;
    }
}
