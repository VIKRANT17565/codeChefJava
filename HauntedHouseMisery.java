import java.util.Arrays;
import java.util.Scanner;

public class HauntedHouseMisery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int c = 0;
            int track = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (track < arr[i]) {
                    c++;
                }
                track = arr[i];
            }

            System.out.print("res : ");
            if (c == n-1) {
                System.out.println(0);
            }else{
                System.out.println(c);
            }

        }
        sc.close();
    }
}
