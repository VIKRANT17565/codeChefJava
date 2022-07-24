import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            // int m = sc.nextInt();

            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] =  sc.nextLong();
            }
            Arrays.sort(arr);

            

        }
        sc.close();
    }
}
