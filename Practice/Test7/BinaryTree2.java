package Practice.Test7;

import java.util.ArrayList;

public class BinaryTree2 {
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
        BinaryTree2 tree = new BinaryTree2();
        tree.root = new Node(1);
        tree.root.left = new Node(10);
        tree.root.right = new Node(39);
        tree.root.left.left = new Node(5);
        ArrayList<Integer> arrayList = postOrder(tree.root);
        System.out.println(arrayList);
    }

    private static ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (root == null) {
            arrayList.add(-1);
        }
        postOrder(root, arrayList);
        return arrayList;
    }

    private static void postOrder(Node root, ArrayList<Integer> arrayList) {
        if (root != null) {
            postOrder(root.left, arrayList);
            postOrder(root.right, arrayList);
            arrayList.add(root.data);
        }
    }
}
