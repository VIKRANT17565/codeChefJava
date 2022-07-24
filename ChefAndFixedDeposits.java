import java.util.Arrays;
import java.util.Scanner;

public class ChefAndFixedDeposits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int totalFD = 0;
            int a[] = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
                totalFD += a[j];
            }
            Arrays.sort(a);

            int count = minimumFixedDeposits(n, x, a, totalFD);

            System.out.println("output : "+count);

        }
        sc.close();
    }

    private static int minimumFixedDeposits(int n, int x, int[] a,int totalFD) {
        int total = 0;
        int count = 0;

        if(totalFD < x){
            return -1;
        }

        for (int j = n-1; j >= 0; j--) {
            total += a[j];
            count += 1;
            if (total >= x) {
                return count;
            }
        }
        return 0;
    }
}
