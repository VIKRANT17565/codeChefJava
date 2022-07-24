import java.util.Arrays;
import java.util.Scanner;

public class MeanMaximization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);

            double p = 0;
            double q = 0;
            for (int j = 0; j < n-1; j++) {
                p += arr[j];
            }
            p /= (n-1);
            q = arr[n-1];

            System.out.println(p+q);
        }
        sc.close();        
    }
}
