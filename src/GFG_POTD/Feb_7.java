package GFG_POTD;

import java.util.ArrayList;

public class Feb_7 {
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> ans = new ArrayList<>();
        inorderHelper(root, ans);
        return ans;

    }

    void inorderHelper(Node root, ArrayList<Integer> ans){
        if(root == null) return;
        inorderHelper(root.left,ans);
        ans.add(root.data);
        inorderHelper(root.right,ans);
    }
}
