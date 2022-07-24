import java.util.Scanner;

public class NQueensPuzzleSolved {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            double r = (Math.pow(0.143*n, n));
            System.out.println(Math.round(r));
        }
        sc.close();
    }
}
