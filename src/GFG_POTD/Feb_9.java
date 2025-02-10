package GFG_POTD;

public class Feb_9 {
    int findMaxSum(Node node) {
        // your code goes here
        int[] ans = new int[1];
        ans[0] = Integer.MIN_VALUE;
        findMaxSumHelper(node,ans);
        return ans[0];

    }

    int findMaxSumHelper(Node node,int[] ans){
        if(node == null) return 0;
        int leftVal = Math.max(0,findMaxSumHelper(node.left,ans));
        int rightVal = Math.max(0,findMaxSumHelper(node.right,ans));

        ans[0] = Math.max(ans[0],leftVal+rightVal+node.data);
        return node.data+Math.max(leftVal,rightVal);
    }
}
