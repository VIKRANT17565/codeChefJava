import java.util.Scanner;

public class AlternatingDivisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int val = 1;
            arr[0] = val;
            val++;
            // int i = 1;
            boolean alter = true;
            // while (i < n && val < 100) {
            //     if (val%arr[i-1] == 0) {
            //         if (alter) {
            //             arr[i] = val;
            //             alter = false;
            //             i++;
            //         }
            //     }
            //     else{
            //         if (!alter) {
            //             arr[i] = val;
            //             alter = true;
            //             i++;
            //         }
            //     }
            //     System.out.println(val);

            //     val++;
            // }

            val = 2;
            for (int i = 1; i < n; i++) {
                if (alter) {
                    arr[i] = arr[i-1] * val;
                    alter = false;
                }
                else{
                    arr[i] = arr[i-1] * val +1;
                    alter = true;
                }
            }

            for (int j : arr) {
                System.out.print(j+" ");
            }System.out.println();
        }
        sc.close();
    }
}
