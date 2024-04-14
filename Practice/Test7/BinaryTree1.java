package Practice.Test7;

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
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        int count = tree.countLeaves(tree.root);
        System.out.println(count);

    }

    private int countLeaves(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return countLeaves(root.left) + countLeaves(root.right);
    }
}