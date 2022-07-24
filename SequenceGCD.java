import java.util.Scanner;

public class SequenceGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n-m+m; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(gcd(arr));

        }
        sc.close();
    }

    public static int gcd(int[] arr){
        int gcd = 1;
        int divisor = 2;
        // int count = 0;
        // int upper = 99991;
        boolean divide = true;
        while (true) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]%divisor != 0) {
                    divide = false;
                    break;
                }
            }
            if (divide) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] /= divisor;
                }
                gcd *= divisor;
                for (int i : arr) {
                    System.out.print(i+" ");
                }System.out.println();
            }
            if (divisor == 25) {
                break;
            }

            divisor++;
        }
        return gcd;
    }

}
