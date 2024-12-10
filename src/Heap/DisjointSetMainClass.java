package Heap;

public class DisjointSetMainClass {
    public static void main(String[] args) {


        DisjointSet obj = new DisjointSet(5);
        obj.union(1,2);
        System.out.println(obj.find(3));
    }
}
