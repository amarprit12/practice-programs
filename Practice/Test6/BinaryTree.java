package Practice.Test6;

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
        boolean result = tree.isBalanced(tree.root);
        if (result) {
            System.out.println("Balanced");
        }else{
            System.out.println("Not balanced");
        }

    }

    private boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        }
        int lHeight = height(root.left);
        int rHeight = height(root.right);
        if (Math.abs(lHeight - rHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right))
            return true;
        return false;
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
