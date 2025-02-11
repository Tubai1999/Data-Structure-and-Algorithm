package gfg160.Matrix;

public class Day38 {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        int row = mat.length;
        int col = mat[0].length;

        for(int i = 0;i <row;i++){
            if( x >= mat[i][0] && x <= mat[i][col-1]){
                for(int j = 0;j<col;j++){
                    if(x == mat[i][j]) return true;
                }
            }
        }
        return false;
    }
}
