package Practice.Test8;

public class BinaryTree3 {
    Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    BinaryTree3() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree3 tree = new BinaryTree3();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        int height = tree.findHeight(tree.root);
        System.out.println(height);
    }

    private int findHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int lHeight = findHeight(root.left);
        int rHeight = findHeight(root.right);
        if (lHeight > rHeight) {
            return lHeight + 1;
        } else {
            return rHeight + 1;
        }
    }

}
