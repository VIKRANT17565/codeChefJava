import java.util.Scanner;

public class AdminsAndShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            long n = sc.nextLong();
            long x = sc.nextLong();
            long a[] = new long[(int)n];
            // long min = Integer.MAX_VALUE;
            long min = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                // if (min > a[i]) {
                //     min = a[i];
                // }
                min += a[i];
            }

            min = min/n;

            long time = 0;
            while (x > 0) {
                x -= min*n;
                time += n;
            }

            System.out.println(time);

        }
        sc.close();
    }
}
