import java.util.Scanner;


public class FixedWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            long n = sc.nextLong();
            long x = sc.nextLong();

            long f1 = 0;
            long f2 = 0;

            double limit = Math.sqrt(x);
            for (int i = (int)limit; i > 1; i--) {
                if (x%i == 0) {
                    f1 = i;
                    f2 = x/i;
                }
            }
            
            if (f1 == 0 && f2 == 0) {
                f1 = 1;
                f2 = x/1;
            }
            
            System.out.println(f1+" "+f2);

            if (f1 <= n) {
                if (f2 <= n-f1+1) {
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("NO");
            }
            


        }
        sc.close();
    }
}
