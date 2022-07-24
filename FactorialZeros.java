import java.util.Scanner;

public class FactorialZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int z = 0;
            while (n > 0) {
                z += n/5;
                n /= 5;
            }

            System.out.println(z);
            
        }
        sc.close(); 
    }
}
