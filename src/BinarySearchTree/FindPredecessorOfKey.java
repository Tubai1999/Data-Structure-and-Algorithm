package BinarySearchTree;

public class FindPredecessorOfKey {
    public static void main(String[] args) {
        Node node1  = new Node(6);
        node1.left = new Node(4);
        node1.left.left = new Node(3);
        node1.left.right = new Node(5);
        node1.right = new Node(8);
        node1.right.right = new Node(9);
        printInorder(node1);
    }


    static Node findSuccessor(Node root, int key, Node successor){
        if(root == null) return null;
        if(root.data > key){
            successor = root;
            return findSuccessor(root.left,key,successor);
        }
        else if (root.data < key){
            return findSuccessor(root.right,key,successor);
        }
        else {
            if(root.right == null) return successor;
            else{
                return getMinFromRight(root.right);
            }
        }
    }

    static Node getMinFromRight(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }




    static Node findPredecessor(Node root, int key, Node predecessor){
        if(root == null) return null;
        if(root.data > key){
            return findPredecessor(root.left,key,predecessor);
        }
        else if (root.data < key){
            predecessor = root;
            return findPredecessor(root.right,key,predecessor);
        }
        else {
            if(root.left == null) return predecessor;
            else {
                return maxFromLeft(root.left);
            }
        }
    }

    static Node maxFromLeft(Node root){
        while(root.right != null){
            root = root.right;
        }
        return root;
    }
    static void printInorder(Node root){
        if(root == null) return;
        printInorder(root.left);
        System.out.print(root.data+" ");
        printInorder(root.right);
    }
}
