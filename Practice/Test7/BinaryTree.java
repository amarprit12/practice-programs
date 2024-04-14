package Practice.Test7;

import java.util.ArrayList;

public class BinaryTree {

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
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.preOrder(tree.root);
        ArrayList<Integer> arrayList = tree.preorder(tree.root);
        System.out.println(arrayList);

    }

    private void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static ArrayList<Integer> preorder(Node root) {
        // Code here
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (root == null) {
            arrayList.add(-1);
            return arrayList;
        }
        preorder(root, arrayList);

        return arrayList;
    }

    static void preorder(Node root, ArrayList<Integer> arrayList) {
        if (root != null) {
            arrayList.add(root.data);
            preorder(root.left, arrayList);
            preorder(root.right, arrayList);
        }
    }
}
