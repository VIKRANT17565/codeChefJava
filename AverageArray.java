import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int arr[] = new int[n];
            int b = x-1;
            int f = x+1;
            int ind = 0;
            while (ind < n/2*2) {
                arr[ind] = b;
                b--;
                ind++;
                arr[ind] = f;
                f++;
                ind++;
            }
            if (n%2 != 0) {
                arr[n-1] = x;
            }

            for (int j : arr) {
                System.out.print(j+" ");
            }System.out.println();
        }
        sc.close();
    }
}
