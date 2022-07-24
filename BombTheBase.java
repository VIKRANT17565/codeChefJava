import java.util.Scanner;

public class BombTheBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int a[] = new int[n];
            int last = -1;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] < x) {
                    last = i;
                }
            }

            int destroyedHouses = last+1;

            System.out.println(destroyedHouses);

        }
        sc.close();
    }
}
