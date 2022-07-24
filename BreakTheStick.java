import java.util.Scanner;

public class BreakTheStick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            long n = sc.nextLong();
            long x = sc.nextLong();

            long dif = n-x;
            if (x%2 == 0) {
                if (dif%2 == 1) {
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }
            }
            else{
                System.out.println("YES");
            }
            
        }
        sc.close();
    }
}
