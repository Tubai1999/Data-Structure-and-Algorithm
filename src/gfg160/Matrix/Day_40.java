package gfg160.Matrix;

public class Day_40 {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        //lets flattened the matrix
        int row = mat.length;
        int col = mat[0].length;
        int totCount = (row*col);

        int low = 0; int high = totCount-1;
        while(low <= high){
            int mid = (low+high)/2;
            int r = mid/col;
            int c = mid%col;
            if(mat[r][c] == x) return true;
            else if(mat[r][c] > x) high = mid-1;
            else low = mid+1;
        }
        return false;


    }
}
