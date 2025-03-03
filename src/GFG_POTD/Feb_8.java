package GFG_POTD;
import java.util.*;
//comment
public class Feb_8 {
    ArrayList<Integer> boundaryTraversal(Node node) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        // Node root = node;
        if(!isLeafNode(node)) ans.add(node.data);
        addLeftBoundary(node,ans);
        addLeafNode(node,ans);
        addRightBoundary(node,ans);
        return ans;

    }

    void addLeftBoundary(Node node, ArrayList<Integer> ans){
        Node cur = node.left;
        while(cur != null){
            if(!isLeafNode(cur)) {
                ans.add(cur.data);
            }
            if(cur.left != null) cur = cur.left;
            else cur = cur.right;
        }


    }

    void addLeafNode(Node node, ArrayList<Integer> ans){
        if(node == null) return;
        if(isLeafNode(node)) {
            ans.add(node.data);
            return;
        }
        addLeafNode(node.left,ans);
        addLeafNode(node.right,ans);

    }

    void addRightBoundary(Node node, ArrayList<Integer> ans){
        ArrayList<Integer> temp = new ArrayList<>();
        Node cur = node.right;
        while(cur != null){
            if(!isLeafNode(cur)){
                temp.add(cur.data);
            }
            if(cur.right != null) cur = cur.right;
            else cur = cur.left;
        }
        for(int i = temp.size()-1;i>=0;i--){
            ans.add(temp.get(i));
        }

    }

    boolean isLeafNode(Node node){
        return ( node.left == null && node.right == null);
    }
}
