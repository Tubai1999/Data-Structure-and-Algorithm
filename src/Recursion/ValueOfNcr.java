package Recursion;

public class ValueOfNcr {
    public static int nCr(int n, int r) {
        //You can code here
        // if(r==1) return n;
        // if(r==n || r==0) return 1;
        if(r>n) return 0;
        if(n==r || r==0) return 1;
        return nCr(n-1,r-1)+nCr(n-1,r);




    }
}
