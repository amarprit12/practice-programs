package Practice.Test5;

import java.util.Stack;

public class LinkedList1 {
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
        LinkedList1 list1 = new LinkedList1();
        list1.head = new Node(1);
        list1.head.next = new Node(2);
        list1.head.next.next = new Node(3);
        list1.head.next.next.next = new Node(4);
        list1.head.next.next.next.next = new Node(3);
        list1.head.next.next.next.next.next = new Node(2);
        list1.head.next.next.next.next.next.next = new Node(1);
        boolean result = list1.checkPalindrome(list1.head);
        if(result){
            System.out.println("is Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }

    private boolean checkPalindrome(Node head) {
        boolean isPal = false;
        if (head == null) {
            return false;
        }
        Node temp = head;
        Stack<Integer> stack = new Stack<>();
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            int i = stack.pop();
            if (i == temp.data) {
                isPal = true;
            } else {
                isPal = false;
                break;
            }
            temp = temp.next;
        }
        return isPal;
    }
}
