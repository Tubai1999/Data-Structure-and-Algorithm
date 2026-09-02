package GFG_POTD;
import java.util.*;

public class MorrisTraversal {
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        inorderHelper(root, ans);
        return ans;

    }

    //Morris Traversal
    void inorderHelper(Node root, ArrayList<Integer> ans){
        Node cur = root;
        while(cur != null){
            if(cur.left == null){
                ans.add(cur.data);
                cur = cur.right;
            }
            else{
                Node prev = cur.left;
                while(prev.right != null && prev.right != cur){
                    prev = prev.right;
                }
                if(prev.right == null){
                    prev.right = cur;
                    cur = cur.left;
                }
                else{
                    prev.right = null;
                    ans.add(cur.data);
                    cur = cur.right;
                }


            }
        }
    }
}
