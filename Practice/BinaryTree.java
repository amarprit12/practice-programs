package Practice;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.print("Inorder traversal : ");
        printInorder(tree.root);
        System.out.println();
        System.out.print("Preorder traversal : ");
        printPreorder(tree.root);
        System.out.println();
        System.out.print("Postorder traversal : ");
        printPostOrder(tree.root);
    }

    private static void printInorder(Node root) {
        if (root == null) {
            return;
        }
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);

    }

    private static void printPreorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");

        printPreorder(root.left);
        printPreorder(root.right);

    }

    private static void printPostOrder(Node root) {
        if (root == null) {
            return;
        }

        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.data + " ");
    }
}
