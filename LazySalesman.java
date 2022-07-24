import java.util.Arrays;
import java.util.Scanner;

public class LazySalesman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int w = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);
            int workingDays = 0;
            int earned = 0;
            int i = n-1;
            while (earned < w) {
                earned += a[i];
                i--;
                workingDays++;
            }

            System.out.println(n - workingDays);

        }
        sc.close();
    }
}
