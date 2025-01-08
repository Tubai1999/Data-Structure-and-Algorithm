package Array;

public class StockBuySell {
    public static void main(String[] args) {
        int[] prices = {100, 180, 260, 310, 40, 535, 695};
        int n = prices.length;
        int maxProfit = Integer.MIN_VALUE;

        int minSoFar = prices[0];
        for(int i=0;i<n;i++){
            minSoFar = Math.min(minSoFar,prices[i]);
            maxProfit = Math.max(maxProfit,prices[i]-minSoFar);
        }

        System.out.println(maxProfit);

//approach 2-->        int[] auxArray = new int[n];int maxTillNow = Integer.MIN_VALUE; O(n) and space also O(n)
//        for(int i = n-1;i>=0;i--){
//            maxTillNow = Math.max(prices[i],maxTillNow);
//            auxArray[i] = maxTillNow;
//        }
//        for(int i = 0;i<n;i++){
//            maxProfit = Math.max(maxProfit,auxArray[i]-prices[i]);
//        }
//        System.out.println(maxProfit);

// approach -->1       for(int i=0;i<n-1;i++){  O(n^2) solution ,using no space
//            for(int j = i+1;j<n;j++){
//                maxProfit = Math.max(maxProfit,prices[j] - prices[i]);
//            }
//        }
//        System.out.println(maxProfit);

    }
}
