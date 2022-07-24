import java.util.Scanner;

public class VishalTheTheif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int i = 0;
            int e = arr[i];
            while (true) {
                if (e <= i + arr[i]) {
                    e = i + arr[i];
                }
                System.out.println(i+" "+e);
                if (i == e) {
                    System.out.println("NO");
                    break;
                }
                if (e >= n-1) {
                    System.out.println("YES");
                    break;
                }
                i++;
                // i != e || e < n
            }

        }
        sc.close();
    }
}
