package Practice;

public class BinaryTree1 {
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
        BinaryTree1 tree1 = new BinaryTree1();
        tree1.root = new Node(1);
        tree1.root.left = new Node(2);

        tree1.root.right = new Node(3);
        tree1.root.left.right = new Node(4);
        tree1.root.left.right.right = new Node(5);
        tree1.root.left.right.right.right = new Node(6);
        tree1.printLeftView(tree1.root);

    }

    private void printLeftView(Node root) {
        if (root == null) {
            return;
        }
        printLeftViewUtil(root, 1);

    }

    private void printLeftViewUtil(Node root, int level) {
        if (root == null) {
            return;
        }
        if (maxLevel < level) {
            System.out.print(root.data + " ");
            maxLevel = level;

        }
        printLeftViewUtil(root.left, level + 1);
        printLeftViewUtil(root.right, level + 1);

    }
}
