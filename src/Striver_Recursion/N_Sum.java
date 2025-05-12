package Striver_Recursion;

public class N_Sum {
    public static void main(String[] args) {
        System.out.println( N_SumHelper(1,5,0));
    }

    //functional procedure where not parameter function will return answer itself
    static int N_SumHelper(int i, int n, int sum){
        if(i == n) return n;
        return i+N_SumHelper(i+1,n,0);
    }
    //parameterized procedure
//    static void N_SumHelper(int i,int n,int sum){
//        if(i == n){
//            System.out.println(sum+n);
//            return;
//        }
////        System.out.println(sum+i);
//        N_SumHelper(i+1,n,sum+i);
//    }
}
