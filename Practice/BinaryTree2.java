package Practice;

public class BinaryTree2 {
    Node root;
    static int maxLevel = 0;

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        BinaryTree2 tree2 = new BinaryTree2();
        tree2.root = new Node(1);
        tree2.root.left = new Node(2);
        tree2.root.right = new Node(3);
        tree2.root.left.left = new Node(4);
        tree2.root.left.right = new Node(5);
        tree2.root.right.left = new Node(6);
        tree2.root.right.right = new Node(7);
        tree2.root.right.left.right = new Node(8);
        tree2.printRightView(tree2.root);

    }

    private void printRightView(Node root) {
        if (root == null) {
            return;
        }
        printRightViewUtil(root, 1);

    }

    private void printRightViewUtil(Node root, int level) {
        if (root == null) {
            return;
        }
        if (maxLevel < level) {
            System.out.print(root.data + " ");
            maxLevel = level;
        }
        printRightViewUtil(root.right, level + 1);
        printRightViewUtil(root.left, level + 1);

    }
}
