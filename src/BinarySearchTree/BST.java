package BinarySearchTree;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}
public class BST {
    public static void main(String[] args) {
        Node node1  = new Node(6);
        node1.left = new Node(4);
        node1.left.left = new Node(3);
        node1.left.right = new Node(5);
        node1.right = new Node(8);
        node1.right.right = new Node(9);
        printInorder(node1);
        System.out.println();
//        System.out.println(searchInBinarySearchTree(node1,9));
        insertIntoBinarySearchTree(node1,15);
        printInorder(node1);
    }

    static Node insertIntoBinarySearchTree(Node root, int key){
        if(root == null) return new Node(key);
        if(root.data > key){
            root.left = insertIntoBinarySearchTree(root.left,key);
        }
        if(root.data < key){
            root.right = insertIntoBinarySearchTree(root.right,key);
        }

        return root;
    }

    static boolean searchInBinarySearchTree(Node root, int key){
        if(root == null) return false;

        if(root.data > key) return searchInBinarySearchTree(root.left,key);
        if(root.data < key) return searchInBinarySearchTree(root.right,key);
        return true;
    }


    static void printInorder(Node root){
        if(root == null) return;
        printInorder(root.left);
        System.out.print(root.data+" ");
        printInorder(root.right);
    }
}
