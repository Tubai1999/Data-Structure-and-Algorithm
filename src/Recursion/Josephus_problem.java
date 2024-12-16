package Recursion;

public class Josephus_problem {
    public int josephus(int n, int k)
    {
        //You can code here
        if(n==1) return 1;
        return (josephus(n-1,k)+(k-1))%n+1; //it is for 0 base indexing

        // josephus(n-1,k)+k%n for 0 base indexing





    }
}
