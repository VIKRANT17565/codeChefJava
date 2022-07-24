import java.util.Scanner;

public class PrimalityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            String isPrime  = "yes";

            if (n != 1) {
                for (int j = 2; j < n; j++) {
                    if (n%j == 0) {
                        isPrime = "no";
                    }
                }
                System.out.println(isPrime);
            }
            else{
                System.out.println("no");
            }
        }
        sc.close();
    }
}
