package Practice.Test8;

public class BinaryTree5 {
    Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    BinaryTree5() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree5 binaryTree5 = new BinaryTree5();
        binaryTree5.root = new Node(4);
        binaryTree5.root.left = new Node(2);
        binaryTree5.root.right = new Node(5);
        boolean result = binaryTree5.checkBST(binaryTree5.root);
        if (result) {
            System.out.println("is BST");
        } else {
            System.out.println("not BST");
        }
    }

    private boolean checkBST(Node root) {
        return checkBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean checkBSTUtil(Node root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.data < min || root.data > max) {
            return false;
        }
        return checkBSTUtil(root.left, min, root.data - 1) &&
                checkBSTUtil(root.right, root.data + 1, max);
    }
}
