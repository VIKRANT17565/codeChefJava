import java.util.Scanner;

public class BucketsFullofCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long l = sc.nextLong();
            long b = l+n-1;

            for (long i = 0; i < n; i++) {
                long sub = m/b;
                // System.out.println(sub);
                m -= sub*b;
                b--;
                if (b == 0) {
                    break;
                }
            }
            System.out.println(m);
        }
        sc.close();
    }
}
