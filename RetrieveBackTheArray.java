import java.util.Arrays;
import java.util.Scanner;

public class RetrieveBackTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int arr[] = new int[500000];
            Arrays.fill(arr, 0);

            /*
            int k = 0;
            while (n > 1) {
                int a = k^x;
                if(a == 0 || a > 500000 || arr[a] == 1){
                    k++;
                    continue;
                }
                System.out.print(k+" ");
                x = a;
                arr[k] = 1;
                n--;
                k++;
            }

            */

            int k = 0;
            for (int j = 1; j < n; j++) {
                int a = k^x;
                if (arr[a] == 1 || a == 0 || a > 500000) {
                    k++;
                    j--;
                    continue;
                }
                System.out.print(k + " ");
                x = a;
                arr[k] = 1;
                k++;
            }
            System.out.println(x);

        }
        sc.close();

    }
}
