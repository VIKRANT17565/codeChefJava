import java.util.Scanner;

public class HungryChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n = sc.nextInt();
            int r = sc.nextInt();

            int a,b;
            boolean isSolved = false;

            // a = solveEqu(x, y, n, r);

            // for (int i = a; i <= n/2; i++) {
            //     a = i;
            //     b = n-a;

            //     if(a >= 0 && b >= 0){
            //         if((x*a + y*b) <= r){
            //             System.out.println(a+" "+b);
            //             isSolved = true;
            //             break;
            //         }
            //     }
            // }

            // if (!isSolved) {
            //     System.out.println(-1);
            // }


            a = solveEqu(x, y, n, r);
            if (a < 0) {
                a = 0;
            }
            for (int i = a; i <= n; i++) {
                a = i;
                b = n-i;
                
                if((x*a + y*b) <= r){
                    System.out.println(a+" "+b);
                    isSolved = true;
                    break;
                }
                
            }

            if (!isSolved) {
                System.out.println(-1);
            }
        }
        sc.close();
    }

    private static int solveEqu(int a, int b, int n, int r) {
        int y = (a*n-r)/(a-b);
        int x = n-y;

        return x;
    }
}
