package Practice.Test3;

public class BinaryTree7 {

    Node root1, root2;

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    BinaryTree7() {
        root1 = null;
        root2 = null;
    }

    public static void main(String[] args) {
        BinaryTree7 tree = new BinaryTree7();
        tree.root1 = new Node(1);
        tree.root1.left = new Node(2);
        tree.root1.right = new Node(3);


//        BinaryTree7 tree2 = new BinaryTree7();
        tree.root2 = new Node(1);
        tree.root2.left = new Node(2);
        tree.root2.right = new Node(3);

        boolean result = checkIdentical(tree.root1, tree.root2);
        if (result) {
            System.out.println("Identical");
        } else {
            System.out.println("Not identical");
        }
    }

    private static boolean checkIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 != null && root2 != null) {
            return ((root1.data == root2.data) && checkIdentical(root1.left, root2.left)
                    && checkIdentical(root1.right, root2.right));
        }
        return false;
    }
}

