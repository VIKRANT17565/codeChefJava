import java.util.Scanner;

public class GoodQualityBulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int a[] = new int[n-1];
            int s = 0;
            for (int i = 0; i < n-1; i++) {
                a[i] = sc.nextInt();
                s += a[i];
            }

            int nth = x*n - (s);

            if (nth >= 0) {
                System.out.println(nth);
            }
            else{
                System.out.println(0);
            }

        }
        sc.close();
    }
}
