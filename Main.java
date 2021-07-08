import java.util.*;

public class Main {
    static class Node{
        int data; // holds value of the node
        Node left, right; // left and right children

        // Node constructor
        public Node(int item){
            data = item;
            left = null;
            right = null;
        }
    }

    // binary tree structure declaration
    static class BinaryTree{
        Node root;

        // BinaryTree constructor
        public BinaryTree() { root = null; }

        void printInOrder(Node node){
            if(node == null){
                return;
            }

            printInOrder(node.left); // left child
            System.out.print(node.data + " ");
            printInOrder(node.right); // right child
        }

        void printPostOrder(Node node){
            if(node == null){
                return;
            }

            printPostOrder(node.left); // left child
            printPostOrder(node.right); // right child
            System.out.print(node.data + " ");
        }

        void printPreOrder(Node node){
            if(node == null){
                return;
            }

            System.out.print(node.data + " ");
            printInOrder(node.left); // left child
            printInOrder(node.right); // right child
        }

        // Code execution
        public void printInOrder() { printInOrder(root); }
        public void printPostOrder() { printPostOrder(root); }
        public void printPreOrder() { printPreOrder(root); }
    }

    // driver code
    public static void main(String[] args) {
        // TREE STRUCTURE
        /*
         *            1
         *          /   \
         *         4     8
         *        / \    / \
         *      10   12 3   2
         *          /
         *         6
         */

        BinaryTree tree = new BinaryTree();

        // Node Insertions
        tree.root = new Node(1);
        tree.root.left = new Node(4);
        tree.root.right = new Node(8);
        tree.root.right.left = new Node(3);
        tree.root.right.right = new Node(2);
        tree.root.left.left = new Node(10);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(6);

        System.out.println("INORDER TRAVERSAL: ");
        tree.printInOrder();

        System.out.println("\nPOSTORDER TRAVERSAL: ");
        tree.printPostOrder();

        System.out.println("\nPREORDER TRAVERSAL: ");
        tree.printPreOrder();
    }
}
