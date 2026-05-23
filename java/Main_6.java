import java.util.Scanner;
class Node_6 {
    int data;
    Node_6 left, right;  // Changed Node -> Node_6

    public Node_6(int data) {
        this.data = data;
        this.left = null;   // Fixed: was referencing uninitialized fields
        this.right = null;
    }
}

class BinaryTree_6 {
    Node_6 root;  // Changed Node -> Node_6

    public void inorderTraversal(Node_6 node) {  // Changed Node -> Node_6
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    public void preorderTraversal(Node_6 node) {  // Changed Node -> Node_6
        if (node != null) {
            System.out.print(node.data + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    public void postorderTraversal(Node_6 node) {  // Changed Node -> Node_6
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }
}

public class Main_6 {
    public static void main(String[] args) {
        BinaryTree_6 tree = new BinaryTree_6();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter the node values:");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            Node_6 node = new Node_6(data);

            if (tree.root == null) {
                tree.root = node;
            } else {
                Node_6 temp = tree.root;  // Changed Node -> Node_6
                while (true) {
                    if (data < temp.data) {
                        if (temp.left == null) {
                            temp.left = node;
                            break;
                        }
                        temp = temp.left;
                    } else {
                        if (temp.right == null) {
                            temp.right = node;
                            break;
                        }
                        temp = temp.right;
                    }
                }
            }
        }

        System.out.println("Inorder Traversal:");
        tree.inorderTraversal(tree.root);

        System.out.println("\nPreorder Traversal:");
        tree.preorderTraversal(tree.root);

        System.out.println("\nPostorder Traversal:");
        tree.postorderTraversal(tree.root);

        sc.close();
    }
}