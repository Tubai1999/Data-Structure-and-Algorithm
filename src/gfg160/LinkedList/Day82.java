package gfg160.LinkedList;

public class Day82 {
    int diameter(Node root) {
        // Your code here
        // if(root == null) return 0;

        // int leftHeight = findHeight(root.left);
        // int rightHeight = findHeight(root.right);

        // int leftDiameter = diameter(root.left);
        // int rightDiameter = diameter(root.right);

        // return Math.max(leftHeight+rightHeight,Math.max(leftDiameter,rightDiameter));

        //optimal approach
        int[] ans = new int[1];
        diameterHelper(root,ans);
        return ans[0];
    }

    int diameterHelper(Node root, int[] maxi){
        if(root == null) return 0;
        int left = diameterHelper(root.left,maxi);
        int right = diameterHelper(root.right,maxi);
        maxi[0] = Math.max(maxi[0],left+right);
        return 1+Math.max(left,right);
    }

    int findHeight(Node root){
        if(root == null) return 0;
        return 1 + Math.max(findHeight(root.left),findHeight(root.right));
    }
}
