import java.util.Scanner;

public class AkashAndEqualMean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            long a[]= new long[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                sum += a[i];
            }

            double mean = (double) sum / n;
            long z = (long)(sum - (mean*(n-2)));

            System.out.println(mean+" "+z);
        }
        sc.close();
    }
}
