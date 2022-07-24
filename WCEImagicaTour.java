import java.util.Scanner;

public class WCEImagicaTour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int b = 0;
            if ((double)n/k == n/k) {
                b = n/k;
            }
            else{
                b = n/k +1;
            }

            System.out.println(b);

        }
        sc.close();
    }
}
