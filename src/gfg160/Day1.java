package gfg160;

public class Day1 {
    public int getSecondLargest(int[] arr) {

        int firstLargest = arr[0];
        int secondLargest = -1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else{
                if(arr[i] > secondLargest && arr[i] != firstLargest) secondLargest = arr[i];
            }
        }
        return secondLargest;
        // Code Here
        // HashSet<Integer> set = new HashSet<>();
        // for(int a: arr){
        //     set.add(a);
        // }

        // int[] ans = new int[set.size()];
        // int i=0;

        // for(int a: set){
        //     ans[i++] = a;
        // }
        // Arrays.sort(ans);

        // if(ans.length == 1) return -1;
        // else return ans[ans.length-2];
    }
}
