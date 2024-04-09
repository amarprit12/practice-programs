package Practice.Test8;

public class BinaryTree4 {
    Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    BinaryTree4() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree4 tree = new BinaryTree4();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        int size = tree.findSize(tree.root);
        System.out.println(size);
    }

    private int findSize(Node root) {
        if (root == null) {
            return 0;
        }
        return findSize(root.left) + 1 + findSize(root.right);
    }

}
