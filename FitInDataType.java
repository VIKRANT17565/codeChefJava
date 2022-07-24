import java.util.Scanner;

public class FitInDataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            while (x > n) {
                x = x-n-1;
            }

            System.out.println(x);
        }
        sc.close();
    }
}
