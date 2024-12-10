package Array;

public class minimumsumSubarray {

    public static void main(String[] args) {
        int[] arr = {1,2,5,6,6,2};
        int target=1;
        int ans = Integer.MAX_VALUE;

        int l=0,r=0;
        int cumSum=0;

        while (r!=arr.length)
        {
            cumSum += arr[r];
            while (cumSum>=target){
               ans = Math.min(ans,r-l+1);
               cumSum -= arr[l];
               l++;
            }
            r++;
        }
        if(ans==Integer.MAX_VALUE) System.out.println(0);
        else System.out.println(ans);


    }
}
