import java.util.Scanner;

public class NButtons1Bulb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            String s = sc.next();
            String r = sc.next();
            int currentStateOfBulb = 1;

            int change = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != r.charAt(i)) {
                    change++;
                }
            }

            if (change%2 == 0) {
                currentStateOfBulb = 1;
            }
            else{
                currentStateOfBulb = 0;
            }

            System.out.println(currentStateOfBulb);
        }
        sc.close();
    }
}
