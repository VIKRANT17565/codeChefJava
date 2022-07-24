import java.util.Scanner;

public class PseudoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            long arr[] = new long[n];
            // int count = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            for (int i = 1; i < n; i++) {
                if (arr[i-1] > arr[i]) {
                    long temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }

            boolean b = true;
            for (int i = 1; i < n; i++) {
                if (arr[i-1] > arr[i]) {
                    b = false;
                    break;
                }
            }

            if (b) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
