import java.util.Scanner;

public class PalindromesNotAllowed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int c = 97;
            String s = "";
            // 'a' == 97
            while (n != 0) {
                s += (char) c;
                if (c == 122) {
                    c = 96;
                }
                c++;
                n--;
            }

            System.out.println(s);

        }
        sc.close();
    }
}
