import java.util.Scanner;

public class XorPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            String s = sc.next();

            int ones = 0, zeros = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    ones++;
                }
                else{
                    zeros++;
                }
            }
            if (n%2 == 0) {
                if(ones == zeros || (ones%2 == 0 && zeros%2 == 0)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("YES");
            }

        }
        sc.close();
    }
}
