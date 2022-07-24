import java.util.Scanner;

public class HostelRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int m = x;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                x += arr[i];
                if (m < x) {
                    m = x;
                }
            }

            System.out.println(m);

        }
        sc.close();
    }
}
