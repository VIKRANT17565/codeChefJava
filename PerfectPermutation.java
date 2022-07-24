import java.util.Scanner;

public class PerfectPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            perfectPermutation(n, k);

        }
        sc.close();
    }

    private static void perfectPermutation(int n, int k) {
        int arr[] = new int[n];
        for (int i = 1; i < n+1; i++) {
            arr[i-1] = i;
        }
        if (n == 1) {
            System.out.println(1);
            return;
        }
        if (k == n-1) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
            for (int i : arr) {
                System.out.print(i+" ");
            }System.out.println();
            return;
        }
        int i = 0;
        k = n-k;
        while (k > 0) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            i++;
            k--;
        }
        for (int j : arr) {
            System.out.print(j+" ");
        }System.out.println();
    }
}
