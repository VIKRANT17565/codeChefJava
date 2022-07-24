import java.util.ArrayList;
import java.util.Scanner;

public class PrefixPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[k];
            // int p[] = new int[n];
            ArrayList<Integer> p = new ArrayList<>();
            for (int i = 0; i < k-n+n; i++) {
                arr[i] = sc.nextInt();
            }

            int prev = 0;
            for (int i = 0; i < k; i++) {
                for (int j = arr[i]; j > prev; j--) {
                    p.add(j);
                }
                prev = arr[i];
            }

            for (Integer i : p) {
                System.out.print(i+" ");
            }System.out.println();

        }
        sc.close();
    }
}
