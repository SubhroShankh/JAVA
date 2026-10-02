import java.util.*;

public class BstToBalancedBST {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Helper method to get the inorder sequence
    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    // Helper method to construct a balanced BST from the sorted array
    public static Node createBST(ArrayList<Integer> inorder, int st, int end) {
        if (st > end) {
            return null;
        }

        int mid = st + (end - st) / 2; // Prevents integer overflow
        Node root = new Node(inorder.get(mid));

        root.left = createBST(inorder, st, mid - 1);
        root.right = createBST(inorder, mid + 1, end);

        return root;
    }

    public static Node balancedBST(Node root) {
        // inorder seq
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);

        // sorted inorder -> balanced bst
        return createBST(inorder, 0, inorder.size() - 1);
    }

    public static void main(String[] args) {
        /*
         * 8
         * / \
         * 6 10
         * / \
         * 5 11
         * / \
         * 3 12
         */
        Node root = new Node(8);

        // Left subtree
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        // Right subtree
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        System.out.println("Preorder before balancing:");
        preorder(root);
        System.out.println();

        // Convert to balanced BST
        root = balancedBST(root);

        /*
         * Expected Balanced Tree:
         * 8
         * / \
         * 5 11
         * / \ / \
         * 3 6 10 12
         */

        System.out.println("Preorder after balancing:");
        preorder(root);
    }
}