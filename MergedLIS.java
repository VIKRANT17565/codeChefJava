import java.util.Arrays;
import java.util.Scanner;

// to be solve

public class MergedLIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[] = new int[n+1];
            a[0] = 0;
            int b[] = new int[m+1];
            b[0] = 0;
            int acount[] = new int[n];
            int ai = 0;
            int bcount[] = new int[m];
            int bi = 0;
            for (int j = 1; j < n+1; j++) {
                a[j] = sc.nextInt();
                if (a[j-1] <= a[j]) {
                    acount[ai]++;
                }
                else{
                    ai++;
                    acount[ai]++;
                }
            }
            for (int j = 1; j < m+1; j++) {
                b[j] = sc.nextInt();
                if (b[j-1] <= b[j]) {
                    bcount[bi]++;
                }
                else{
                    bi++;
                    bcount[bi]++;
                }
            }

            for (int j : acount) {
                System.out.print(j+" ");
            }System.out.println();

            for (int j : bcount) {
                System.out.print(j+" ");  
            }System.out.println();

            Arrays.sort(acount);
            Arrays.sort(bcount);

            System.out.print("ans : ");
            System.out.println(acount[n-1] + bcount[m-1]);
        }
        sc.close();
    }
}
