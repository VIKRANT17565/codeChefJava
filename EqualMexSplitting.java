import java.util.Scanner;

public class EqualMexSplitting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int mex[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] > 0) {
                    mex[i] = 0;
                }
                else{
                    mex[i] = 1;
                }
            }

            int c0 = 0;
            int c1 = 0;

            for (int i = 0; i < n; i++) {
                if (mex[i] == 0) {
                    c0++;
                }
                else{
                    c1++;
                }
            }

            int maxSubArr = c1 < c0 ? c0 : c1;
            
            System.out.println(maxSubArr);
        }
        sc.close();
    }
}
