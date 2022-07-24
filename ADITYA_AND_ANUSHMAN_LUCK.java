import java.util.Arrays;
import java.util.Scanner;

public class ADITYA_AND_ANUSHMAN_LUCK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int tc = sc.nextInt();
        int tc = 30;
        for (int t = 0; t < tc; t++) {
            // int n = sc.nextInt();
            int n = t+1;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                // arr[i] = sc.nextInt();
                arr[i] = i+1;
            }

            int A = 0;
            int B = 0;
            Arrays.sort(arr);

            while (arr[n-1] != 0) {
                A += arr[n-1];
                arr[n-1] = (arr[n-1])/2;
                Arrays.sort(arr);

                B += arr[n-1];
                arr[n-1] = (arr[n-1])/2;
                Arrays.sort(arr);
            }
            // int i = 0;
            // while (true) {
            //     // System.out.println(i);
            //     A += arr[i];
            //     i++;
            //     if (i >= n) {
            //         break;
            //     }
            //     // arr[n-1] = (arr[n-1])/2;
            //     // Arrays.sort(arr);

            //     B += arr[i];
            //     i++;
            //     if (i >= n) {
            //         break;
            //     }
            //     // arr[n-1] = (arr[n-1])/2;
            //     // Arrays.sort(arr);
            // }

            // System.out.println(Math.abs(A-B));
            System.out.println(n+" "+A+" "+B+" "+Math.abs(A-B));

        }
        sc.close();
    }
}
