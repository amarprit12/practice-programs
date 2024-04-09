package Practice.Test6;

import java.util.ArrayList;

public class BinaryTree1 {
    Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        BinaryTree1 tree = new BinaryTree1();
        tree.root = new Node(22);
        tree.root.left = new Node(12);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(20);
//        int min = tree.minValue(tree.root);
//        System.out.println(min);
//        tree.printInorder(tree.root);

        ArrayList<Integer> arrayList = new ArrayList<>();
        tree.printInorder1(tree.root, arrayList);
        System.out.println(arrayList);
        System.out.println(arrayList.get(0));
        tree.printInorder(tree.root);

        int res = tree.inorder2(tree.root);
        System.out.println("res: "+ res);
    }

    private int inorder2(Node root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(root == null){
            return -1;
        }
        printInorder2(root, arrayList);
        System.out.println(arrayList);
        return arrayList.get(0);
    }

    private void printInorder(Node root) {
        if (root == null) {
            return;
        }
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

//    int minValue(Node root) {
//        // code here
//        ArrayList<Integer> arrayList = new ArrayList();
//        if (root == null) {
//            return -1;
//        }
//        minValue(root.left);
//        arrayList.add(root.data);
//        minValue(root.right);
//        System.out.println("arrayList: " + arrayList);
//        return arrayList.get(0);
//    }

    private void printInorder1(Node root, ArrayList<Integer> arrayList) {
        if (root == null) {
//            arrayList.add(-1);
            return;
        }

        printInorder1(root.left, arrayList);
        arrayList.add(root.data);
        printInorder1(root.right, arrayList);

    }

//    int minValue(Node root) {
//        // code here
//        ArrayList<Integer> arrayList = new ArrayList();
//        printInorder1(root, arrayList);
//        System.out.println(arrayList);
//        return arrayList.get(0);
//    }

    private void printInorder2(Node root, ArrayList<Integer> arrayList) {
        if (root == null) {
            return;
        }

        printInorder2(root.left, arrayList);
        arrayList.add(root.data);
        printInorder2(root.right, arrayList);

    }
}
