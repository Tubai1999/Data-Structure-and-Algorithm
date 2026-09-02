package static_practice;

public class Method1 {

    static int extraPrice = 20;

    int nonStaticValue = 150;

    int method(int a,int b){
        int total = a+b+extraPrice;
        return total;
    }

    static int staticMethod(int a, int b,Method1 obj){
        int total = a+b+extraPrice;
        System.out.println(obj.nonStaticValue);
        return total;
    }

//    int sum(int a,int b){
//        return a+b;
//    }
//    int sum(int a,int b,int c){
//        return a+b+c;
//    }

    int sum (int ...vars){
        int total=0;
        for(int a:vars){
            total+=a;
        }
        System.out.println(total);
        return total;
    }
}
