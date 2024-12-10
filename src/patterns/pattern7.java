package patterns;

public class pattern7 {
    public static void main(String[] args) {

        int n=5;
//-------> patttern 14
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=i;j>1;j--)
//            {
//                System.out.print(" ");
//            }
//            for(int k=i;k<=n;k++)
//            {
//                System.out.print(k+" ");
//            }
//            System.out.println();
//        }
//        for(int i=n-1;i>0;i--)
//        {
//            for(int j=1;j<i;j++)
//            {
//                System.out.print(" ");
//            }
//            for(int k=i;k<=n;k++)
//            {
//                System.out.print(k+" ");
//            }
//            System.out.println();
//        }

//    --------------->pattern 13
//        for(int i=0;i<=n-1;i++){
//            for(int j=1;j<n-i;j++)
//            {
//                System.out.print(" ");
//            }
//            if(i==n-1) {
//                for(int a=0;a<2*n-1;a++){
//                    System.out.print("*");
//                }
//            }
//            else{
//                System.out.print("*");
//                for(int j=0;j<=2*i-1;j++)
//                {
//                    if(j==2*i-1) System.out.print("*");
//                     else System.out.print(" ");
//
//                }
//            }
//            System.out.println();
//        }


//        ---------------->pattern 6
//        int n=5;
//        for(int i = 0; i<n; i++) {
//            for(int j = 1; j<n-i; j++) {
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            for(int j = 0; j<=2*i-1; j++) {
//                if(j == 2*i-1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        for(int i = n-2; i>=0; i--) {
//            for(int j = 1; j<n-i; j++) {
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            for(int j = 0; j<=2*i-1; j++) {
//                if(j == 2*i-1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }





//        ----------------->pattern 12
//      for(int i=1;i<=4;i++)
//      {
//          for(int j=1;j<=i;j++){
//              System.out.print("* ");
//          }
//          System.out.println();
//      }
//
//      for(int i=3;i>=1;i--)
//      {
//          for(int j=1;j<=i;j++)
//          {
//              System.out.print("* ");
//          }
//          System.out.println();
//      }







//        --------------->pattern 11 incomplete
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=n-i;j++)
//            {
//                System.out.print(" ");
//            }
//            //System.out.print("*");
//            for(int k=1;k<=2*i-1;k++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=n-2;i>=0;i--)
//        {
//            for(int j=1;j<n-i;j++)
//            {
//                System.out.print(" ");
//            }
//            for(int k=0;k<2*i+1;k++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        ----------pattern 10
//        for (int i =1; i <=6; i++)
//        {
//            for(int j=1;j<i;j++)
//            {
//                System.out.print(" ");
//            }
//            for(int k=i;k<=6;k++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        -----------------------> pattern 9
//        for(int i=1;i<=6;i++)
//        {
//            for(int j=1;j<=6-i;j++)
//            {
//                System.out.print(" ");
//            }
//            for(int k=i;k>=1;k--)
//            {
//                System.out.print(k);
//            }
//            for(int l=2;l<=i;l++)
//            {
//                System.out.print(l);
//            }
//            System.out.println();
//        }

//        --------------->patterns8
//        for (int i = 0; i <=5 ; i++) {
//            for(int j=0;j<=5-i;j++){
//                System.out.print(j+1+" ");
//            }
//            System.out.println();
//        }
 // ----------------> patterns7
//        for (int i = 0; i <= 5; i++) {
//            for(int j=0;j<=5-i;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}
