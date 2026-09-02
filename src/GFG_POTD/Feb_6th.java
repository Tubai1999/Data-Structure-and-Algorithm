package GFG_POTD;
import java.util.*;

public class Feb_6th {
    public static Node buildTree(int inorder[], int preorder[]) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        return buildTreeHelper(inorder,0,inorder.length-1, preorder,0,preorder.length-1,map);
    }

    static Node buildTreeHelper(int[] inorder, int inStart, int inEnd, int[] preorder,
                                int preStart, int preEnd, HashMap<Integer, Integer> map){

        if(inStart > inEnd || preStart > preEnd) return null;

        Node root = new Node(preorder[preStart]);
        int inRootPos = map.get(preorder[preStart]);
        int numsLeft = inRootPos - inStart;

        root.left = buildTreeHelper(inorder,inStart,inRootPos-1, preorder,
                preStart+1,preStart+numsLeft,map);
        root.right = buildTreeHelper(inorder,inRootPos+1,inEnd,preorder,
                preStart+numsLeft+1,preEnd, map);
        return root;


    }
}
