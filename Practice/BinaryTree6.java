package Practice;

public class BinaryTree6 {
    Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    BinaryTree6() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree6 tree = new BinaryTree6();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        int diameter = tree.diameter();
        System.out.println(diameter);
    }

    private int diameter() {
        return diameter(root);
    }

    private int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int lheight = height(root.left);
        int rHeight = height(root.right);

        int ldiameter = diameter(root.left);
        int rdiameter = diameter(root.right);

        return (Math.max(Math.max(ldiameter, rdiameter), lheight + rHeight + 1));

    }

    private int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lHeight = height(root.left);
        int rHeight = height(root.right);
        if (lHeight > rHeight) {
            return lHeight + 1;
        } else {
            return rHeight + 1;
        }
    }
}
