import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int factorial = 1;
            n = sc.nextInt();
            for (int j = 1; j <= n; j++) {
                factorial *= j;
            }
            System.out.println(factorial);
        }
        sc.close();
    }
}
