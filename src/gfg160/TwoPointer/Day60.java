package gfg160.TwoPointer;

public class Day60 {
    public int maxWater(int arr[]) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int ans = 0;
        while (left < right) {
            int width = right - left;
            int height = Math.min(arr[left], arr[right]);
            int curWater = width * height;
            ans = Math.max(ans, curWater);
            if (arr[left] < arr[right]) left++;
            else right--;
        }
        return ans;
    }
}
