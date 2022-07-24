import java.util.Scanner;

public class FirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int first = 0;
            n = sc.nextInt();
            sum += n - (n/10 * 10);
            while (n != 0) {
                first = n - (n/10 * 10);
                n = n/10;
            }
            sum+= first;
            System.out.println(sum);
            sum = 0;

        }
        sc.close();
    }
}
